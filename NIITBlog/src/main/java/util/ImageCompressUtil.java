package util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImageCompressUtil {
	//图片等比例缩放工具
	public static String zipImageFile(String oldFile, int width, int height,
			float quality, String smallIcon) {
		if (oldFile == null) {
			return null;
		}
		String newImage = null;
		try {
			Image srcFile = ImageIO.read(new File(oldFile));
			BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			tag.getGraphics().drawImage(srcFile, 0, 0, width, height, null);
			String filePrex = oldFile.substring(0, oldFile.indexOf('.'));
			newImage = filePrex + smallIcon	+ oldFile.substring(filePrex.length());
			FileOutputStream out = new FileOutputStream(newImage);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);
			jep.setQuality(quality, true);
			encoder.encode(tag, jep);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newImage;
	}

	public static String writeFile(String fileName, InputStream is) {
		if (fileName == null || fileName.trim().length() == 0) {
			return null;
		}
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			byte[] readBytes = new byte[512];// �����С
			int readed = 0;
			while ((readed = is.read(readBytes)) > 0) {
				fos.write(readBytes, 0, readed);
			}
			fos.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileName;
	}

	public static void saveMinPhoto(String srcURL, String deskURL, double comBase,
			double scale) throws Exception {
		File srcFile = new java.io.File(srcURL);
		Image src = ImageIO.read(srcFile);
		int srcHeight = src.getHeight(null);
		int srcWidth = src.getWidth(null);
		int deskHeight = 0;
		int deskWidth = 0;
		double srcScale = (double) srcHeight / srcWidth;
		if ((double) srcHeight > comBase || (double) srcWidth > comBase) {
			if (srcScale >= scale || 1 / srcScale > scale) {
				if (srcScale >= scale) {
					deskHeight = (int) comBase;
					deskWidth = srcWidth * deskHeight / srcHeight;
				} else {
					deskWidth = (int) comBase;
					deskHeight = srcHeight * deskWidth / srcWidth;
				}
			} else {
				if ((double) srcHeight > comBase) {
					deskHeight = (int) comBase;
					deskWidth = srcWidth * deskHeight / srcHeight;
				} else {
					deskWidth = (int) comBase;
					deskHeight = srcHeight * deskWidth / srcWidth;
				}
			}
		} else {
			deskHeight = srcHeight;
			deskWidth = srcWidth;
		}
		BufferedImage tag = new BufferedImage(deskWidth, deskHeight, BufferedImage.TYPE_3BYTE_BGR);
		tag.getGraphics().drawImage(src, 0, 0, deskWidth, deskHeight, null);
		FileOutputStream deskImage = new FileOutputStream(deskURL);
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(deskImage);
		encoder.encode(tag);
		deskImage.close();
	}

//	public static void main(String args[]) throws Exception {
//		ImageCompressUtil.zipImageFile("d:/Files/IdeaProjects/NIITBlog/target/NIITBlog/upload/1ff00aa11465439f8653000a2cdafa5f.jpeg", 200, 200, 1f, "x2");
//		ImageCompressUtil.saveMinPhoto("d:/Files/IdeaProjects/NIITBlog/target/NIITBlog/upload/1ff00aa11465439f8653000a2cdafa5f.jpeg", "d:/11.jpg", 139, 0.9d);
//	}
}
