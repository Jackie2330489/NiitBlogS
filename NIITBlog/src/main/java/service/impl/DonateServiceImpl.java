package service.impl;

import dao.DonateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DonateService;

/**
 * Created by Justin on 2017/7/29.
 */
@Service
public class DonateServiceImpl implements DonateService {

    @Autowired
    private DonateDao donateDao;

    public boolean donateArticle(String donatorId, long articleId, int money) {
        int cols=donateDao.addDonate(donatorId,articleId,money);
        if(cols!=0)return true;
        else return false;
    }
}
