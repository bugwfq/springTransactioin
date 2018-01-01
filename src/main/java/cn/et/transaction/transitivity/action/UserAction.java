package cn.et.transaction.transitivity.action;


public interface UserAction {
	public void sendMoney(String sourceID,String receiverId,double sumMoney);
}
