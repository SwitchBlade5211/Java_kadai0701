package dto;

public class Employee {
	private int num;
	private String name;
	private String money;
	private int price;

	public Employee(){

	}

	public Employee(int num , String name,String money,int price){
		this.num= num;
		this.name = name;
		this.money = money;
		this.price = price;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



}
