package cn.et.transaction.tx.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.transaction.tx.dao.UserDao;
import cn.et.transaction.tx.dao.UserMoneyDao;
import cn.et.transaction.tx.entity.User;
import cn.et.transaction.tx.service.UserManager;
@Service
public class UserManagerImpl implements UserManager {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserMoneyDao userMoneyDao;
	public void addUser(User newUser) {
		// TODO Auto-generated method stub

	}

	public void updateUser(User newUser) {
		// TODO Auto-generated method stub

	}

	public User findUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(String uid) {
		// TODO Auto-generated method stub

	}

	public void sendMoney(String sourceID, String receiverId, double sumMoney) {
		drawMoney(sourceID, sumMoney);
		
		saveMoney(receiverId, sumMoney);
		int i = 10/0;
	}

	public void drawMoney(String uid, double money) {
		if(uid==null || "".equals(uid)){
			return;
		}
		userMoneyDao.drawMoney(uid, money);
	}

	public void saveMoney(String uid, double money) {
		if(uid==null || "".equals(uid)){
			return;
		}
		userMoneyDao.saveMoney(uid, money);
	}

}
