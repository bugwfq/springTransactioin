package cn.et.transaction.transitivity.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.transaction.transitivity.service.MoneyManager;

public class TransitivityTest {
	static ApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:cn/et/transaction/transitivity/spring.xml");
	}
	public static void main(String[] args) {
		MoneyManager manager = context.getBean(MoneyManager.class);
		manager.drawMoney(10);
	}
}
