package cn.et.transaction.tx.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.et.transaction.tx.action.UserAction;
import cn.et.transaction.tx.entity.User;
import cn.et.transaction.tx.service.UserManager;
@Controller
public class UserActionImpl implements UserAction{
	@Autowired
	private UserManager userManager;
	public void addUser(User newUser) {
		// TODO Auto-generated method stub
	}

	public void deleteUser(String id) {
		
	}

	public User findUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void sendMoney(String sourceID, String receiverId, double sumMoney) {
		userManager.sendMoney(sourceID, receiverId, sumMoney);
	}

	public void drawMoney(String uid, double money) {
		userManager.drawMoney(uid, money);
		
	}

	public void saveMoney(String uid, double money) {
		userManager.saveMoney(uid, money);
	}


}
