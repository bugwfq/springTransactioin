package cn.et.transaction.transitivity.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.transaction.transitivity.dao.DrawMoneyDao;
import cn.et.transaction.transitivity.dao.SaveMoneyDao;
import cn.et.transaction.transitivity.service.MoneyManager;
@Service
public class MoneyManagerImpl implements MoneyManager {
	@Autowired
	private DrawMoneyDao drawMoneyDao;
	


	public void drawMoney(double money) {
		drawMoneyDao.drawMoney( money);
	}

	

}
