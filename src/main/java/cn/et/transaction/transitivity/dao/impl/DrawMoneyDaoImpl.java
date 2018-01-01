package cn.et.transaction.transitivity.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.transaction.transitivity.dao.DrawMoneyDao;
import cn.et.transaction.transitivity.dao.SaveMoneyDao;
@Repository
public class DrawMoneyDaoImpl implements DrawMoneyDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private SaveMoneyDao saveMoneyDao;
	public void drawMoney(double drawSum) {
		String sql = "update bankuser set sum=sum-? where uid=1";
		jdbcTemplate.update(sql,drawSum);
		
		saveMoneyDao.saveMoney(drawSum);
		int i = 1/0;
	}

}
