package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong {
	 Set<String> thungPhieuTrungThuong =new HashSet<>();
public RutThamTrungThuong() {}
public boolean themPhieu(String value)
{
	return this.thungPhieuTrungThuong.add(value);
}
public boolean xoaPhieu(String value)
{
	return this.thungPhieuTrungThuong.remove(value);
}
public boolean ktPhieuTonTai(String value)
{
	return this.thungPhieuTrungThuong.contains(value);
}
public void xoaAllPhieuDuThuong()
{
	 this.thungPhieuTrungThuong.clear();
}
public int laySoluong()
{
	return this.thungPhieuTrungThuong.size();
}
public String rutMotPhieu()
{
	String kq=" ";
	Random rd =new Random();
	int viTri=rd.nextInt(this.thungPhieuTrungThuong.size());
    kq= (String) this.thungPhieuTrungThuong.toArray()[viTri];
	return kq;
}
public void inAll()
{
	System.out.println(Arrays.toString(this.thungPhieuTrungThuong.toArray()));
}
public static void main(String []args)
 {
	 int luachon=0;
	 Scanner sc=new Scanner(System.in);
	 RutThamTrungThuong rt= new RutThamTrungThuong();
	 do
	 {
	System.out.println("---------------");
	System.out.println("MENU");
	System.out.println("1.  Them ma so du thuong.");
	System.out.println("2.  Xoa ma so du thuong.");
	System.out.println("3.  Kiem tra ma so du thuong co ton tai hay khong.");
	System.out.println("4.  Xoa tat ca cac phieu du thuong.");
	System.out.println("5.  So luong phieu du thuong.");
	System.out.println("6.  Rut tham trung thuong.");
	System.out.println("7.  In ra tat ca cac so");
	System.out.println("0. Thoat khoi chuong trinh.");
	luachon =sc.nextInt();
	sc.nextLine();
	if(luachon==1||luachon==2||luachon==3)
	{
		System.out.println("Nhap vao ma phieu du thuong: ");
		String value =sc.nextLine();
		if(luachon==1)
			rt.themPhieu(value);
		else if(luachon==2)
			rt.xoaPhieu(value);
		else 
			System.out.println("Kiem tra ket qua: "+rt.ktPhieuTonTai(value)); 
	}
	else if(luachon==4)
		rt.xoaAllPhieuDuThuong();
	else if(luachon==5)
			System.out.println("So luong pheu la: "+rt.laySoluong());
	else if(luachon==6)
			rt.rutMotPhieu();
	else if(luachon==0)
			System.exit(0);
	else if(luachon ==7)
	{
		System.out.println("Cac ma phieu: ");
		rt.inAll();
	}
	else 
		System.out.println("Ban da nhap sai chuc nang.Vui long nhap lai!!");
	 }while(luachon!=0);
	 
 }
}
