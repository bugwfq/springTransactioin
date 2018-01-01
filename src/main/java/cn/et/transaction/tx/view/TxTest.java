package cn.et.transaction.tx.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.transaction.tx.action.UserAction;

public class TxTest {
	static ApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:cn/et/transaction/tx/spring.xml");
	}
	public static void main(String[] args) {
		UserAction action = context.getBean(UserAction.class);
		action.sendMoney("1", "2", 10);
	}
}
