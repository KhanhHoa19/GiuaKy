package mdel;

import java.util.Scanner;

public class XeMay extends Transportation{
	private String capacity;
	
	public XeMay()
	{
		
	}
	public XeMay(int ID,String brand,int publishYear,double price,String color,String capacity)
	{
		this.ID=ID;
		this.brand=brand;
		this.publishYear=publishYear;
		this.price=price;
		this.color=color;
		this.capacity=capacity;
	}
	public void NhapThongTin(Scanner sc)
	{
		super.NhapThongTin(sc);
		System.out.println("Nhap cong suat ");
		capacity=sc.nextLine();	
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Cong suat: "+capacity);
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
}
