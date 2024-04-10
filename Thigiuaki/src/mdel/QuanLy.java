package mdel;


import java.util.ArrayList;
import java.util.Scanner;




public class QuanLy 
{
	Scanner sc= new Scanner(System.in);
	private ArrayList<Transportation>ds;
	
	public QuanLy()
	{
		ds=new ArrayList<Transportation>(10);
	}
	
	
	public void Thempt(Transportation nv)
	{
		ds.add(nv);
	}
	public void xoapt(Transportation nv)
	{
		ds.remove(nv);
	}
	
	
	public void NhapDanhSach(Scanner sc)
	{
		Transportation nv;
		System.out.println("Nhap vao so luong phuong tien");
		int n =sc.nextInt(); sc.nextLine();
		System.out.println("Nhap thong tin chi tiet ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Phuong tien thu "+(i+1));
			System.out.println("Chon phuong tien (1-Oto; 2-xe may; 3-xe tai)");
			int chon= sc.nextInt(); sc.nextLine();
			nv= new Transportation();
			
			switch (chon) {
			case 1: 
				nv=new oTo();
				break;	
			case 2:
				nv=new XeMay();
				break;
			case 3:
				nv=new XeTai();
				break;
			
			}
			nv.NhapThongTin(sc);
			Thempt(nv);
			
		}
	
		}
	public void HienThiDanhSach() {
		for(Transportation the :ds) {
			the.showInfo();
		}
	
		
		
}

}
