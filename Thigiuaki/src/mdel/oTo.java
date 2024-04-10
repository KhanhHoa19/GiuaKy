package mdel;

import java.util.Scanner;

public class oTo extends Transportation{
	private int slots;
	private  String engineType;
	
	public oTo() 
	{
		
	}
	public oTo(int ID,String brand,int publishYear,double price,String color,int slots,String engineType) 
	{
		this.ID=ID;
		this.brand=brand;
		this.publishYear=publishYear;
		this.price=price;
		this.color=color;
		this.slots=slots;
		this.engineType=engineType;
	}
	public int getSlots() {
		return slots;
	}
	public void setSlots(int slots) {
		this.slots = slots;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void NhapThongTin(Scanner sc)
	{
		super.NhapThongTin(sc);
		System.out.println("Nhap so ghe ngoi ");
		slots=sc.nextInt(); sc.nextLine();
		System.out.println("Nhap loai dong co ");
		engineType=sc.nextLine();
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("So ghe: "+slots);
		System.out.println("Loai dong co: "+engineType);
	}
}
