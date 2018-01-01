package cn.et.transaction.tx.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.transaction.tx.dao.UserMoneyDao;
@Repository
public class UserMoneyDaoImpl implements UserMoneyDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * »°«Æ
	 */
	public void drawMoney(String userId, double drawSum) {
		String sql = "update bankuser set sum=sum-? where uid=?";
		jdbcTemplate.update(sql,drawSum,userId);
	}
	/**
	 *¥Ê«Æ
	 */
	public void saveMoney(String userId, double saveSum) {
		String sql = "update bankuser set sum=sum+? where uid=?";
		jdbcTemplate.update(sql,saveSum,userId);
	}

}
