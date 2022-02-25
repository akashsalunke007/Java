package Assignments;

public class Moisturizer implements Comparable<Moisturizer>{
	
	private int moisturizerId;
	private String moisturizerName;
	private int price;
	private String brandName;
	
	
	public Moisturizer(int moisturizerId, String moisturizerName, int price, String brandName) {
		this.moisturizerId = moisturizerId;
		this.moisturizerName = moisturizerName;
		this.price = price;
		this.brandName = brandName;
	}
	
	public int getMoisturizerId() {
		return moisturizerId;
	}
	public String getMoisturizerName() {
		return moisturizerName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrandName() {
		return brandName;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return price+"";
	}

	@Override
	public int compareTo(Moisturizer o) {
		
		return Integer.compare(this.price, o.price);
	}
	
}

