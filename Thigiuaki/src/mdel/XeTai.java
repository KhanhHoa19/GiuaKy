package mdel;

import java.util.Scanner;

public class XeTai extends Transportation{
	private double loadWeight;;
	
	public XeTai()
	{
		
	}
	public XeTai(int ID,String brand,int publishYear,double price,String color,double loadWeight)
	{
		this.ID=ID;
		this.brand=brand;
		this.publishYear=publishYear;
		this.price=price;
		this.color=color;
		this.loadWeight=loadWeight;
	}
	public void NhapThongTin(Scanner sc)
	{
		super.NhapThongTin(sc);
		System.out.println("Nhap trong tai ");
		loadWeight=sc.nextDouble(); sc.nextLine();
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Trong tai: "+loadWeight);
	}
	public double getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}
}
