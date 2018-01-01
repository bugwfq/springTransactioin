package cn.et.transaction.tx.action;

import cn.et.transaction.tx.entity.User;

public interface UserAction {
	public void addUser(User newUser);
	public void deleteUser(String id);
	public void updateUser(User newUser);
	public User findUser(String id);
	public void sendMoney(String sourceID,String receiverId,double sumMoney);
	public void drawMoney(String uid,double money);
	public void saveMoney(String uid,double money);
}
