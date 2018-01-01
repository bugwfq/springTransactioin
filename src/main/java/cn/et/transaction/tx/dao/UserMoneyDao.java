package cn.et.transaction.tx.dao;

public interface UserMoneyDao {
	public void drawMoney(String userId,double drawSum);
	public void saveMoney(String userId,double saveSum);
}
