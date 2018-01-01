package cn.et.transaction.transitivity.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.transaction.transitivity.dao.SaveMoneyDao;
@Repository
public class SaveMoneyDaoImpl implements SaveMoneyDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void saveMoney( double saveSum) {
		String sql = "update bankuser set sum=sum+? where uid=2";
		jdbcTemplate.update(sql,saveSum);
	}

}
