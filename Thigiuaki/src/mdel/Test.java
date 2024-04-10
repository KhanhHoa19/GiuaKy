package mdel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.io.*;



public class Test {

    public static void writeTransToFile(List<Transportation> employees, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Phuong tien da duoc ghi vao trong file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Transportation> readtransFromFile(String fileName) {
        List<Transportation> ds = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            ds = (List<Transportation>) ois.readObject();
            System.out.println("Trans have been read from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ds;
    }
    
    public static void main(String[] args) {
       List<Transportation> ds = new ArrayList<>(10);

    	Scanner sc= new Scanner(System.in);
    	QuanLy ql = new QuanLy();
		ql.NhapDanhSach(sc);
		ql.HienThiDanhSach();
		sc.close();
    	 
    	writeTransToFile(ds, "trans.txt");

   
    List<Transportation> transFromFile = readtransFromFile ("trans.txt");

    
    for (Transportation ds1 : transFromFile) {
        ds1.showInfo();
    }
}
}
