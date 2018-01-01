package cn.et.transaction.tx.service;

import cn.et.transaction.tx.entity.User;

public interface UserManager {
	public void addUser(User newUser);
	public void updateUser(User newUser);
	public User findUser(String id);
	public void deleteUser(String uid);
	public void sendMoney(String sourceID,String receiverId,double sumMoney);
	public void drawMoney(String uid,double money);
	public void saveMoney(String uid,double money);
}
