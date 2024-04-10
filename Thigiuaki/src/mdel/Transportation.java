package mdel;

import java.util.Scanner;

public class Transportation implements ICar{
	protected int ID;
	protected  String brand;
	protected  int publishYear;
	protected  double price;
	protected  String color;

	
	public Transportation()
	{
		
	}
	public Transportation(int ID,String brand,int publishYear,double price,String color)
	{
		this.ID=ID;
		this.brand=brand;
		this.publishYear=publishYear;
		this.price=price;
		this.color=color;;
	}
	public void NhapThongTin(Scanner sc)
	{
		System.out.println("Nhap id ");
		ID=sc.nextInt(); sc.nextLine();
		System.out.println("Nhap hang ");
		brand=sc.nextLine();
		System.out.println("Nhap gia ");
		price=sc.nextDouble(); sc.nextLine();
		System.out.println("Nhap mau");
		color=sc.nextLine();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showInfo() 
	{
		System.out.println("Id: "+ID);
		System.out.println("Hang xe : "+brand);
		System.out.println("Gia : "+price);
		System.out.println("Mau xe: "+color);

	}
}
