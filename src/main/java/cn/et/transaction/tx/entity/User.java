package cn.et.transaction.tx.entity;

public class User {
	private String uId;//uId
	private String uname;//����
	private String password;//����
	private long phone;//��ϵ�绰
	private long idCard;//���֤��
	private String addr;//��ַ
	private double sum;//�ܽ��
	public User() {}
	public User(String uId, String uname, String password, long phone, long idCard, String addr, double sum) {
		super();
		this.uId = uId;
		this.uname = uname;
		this.password = password;
		this.phone = phone;
		this.idCard = idCard;
		this.addr = addr;
		this.sum = sum;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getIdCard() {
		return idCard;
	}
	public void setIdCard(long idCard) {
		this.idCard = idCard;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	
	
}
