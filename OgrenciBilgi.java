/*
 * Ad Soyad: MELİKE KEKE
 * Ogrenci No: 250541003
 * Tarih: 30.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 package odev;

import java.util.Scanner;


public class OgrenciBilgi {

	public static void main(String[] args) {
		String ad,soyad;
		int ogrenciNo,yas;
	Scanner input=new Scanner(System.in);
		System.out.println("=======ÖĞRENCİ BİLGİ SİSTEMİ========");
		System.out.println("Öğrenci adını giriniz:");
		ad=input.nextLine();
		System.out.println("Öğrenci soyadını giriniz:");
		soyad=input.nextLine();
		System.out.println("Öğrenci numaranızı giriniz:");
		ogrenciNo=input.nextInt();
		System.out.println("Yaşınız:");
		yas=input.nextInt();
		double GPA;
		System.out.println("GPA (0.00-4.00)");
		GPA=input.nextDouble();
		String durum;
		durum =( GPA>=2.5)? "BAŞARILI OĞRENCİ":"GELİŞTİRİLMELİ";
		System.out.println("Durum:"+durum);
		
		System.out.println("============ÖĞRENCİ BİLGİ SİSTEMİ==========");
		System.out.printf("Ad Soyad: %s %s %n",ad ,soyad);
		System.out.printf("Öğrenci No:%d %n",ogrenciNo);
		System.out.printf("Yas:%d %n",yas);
		System.out.printf("GPA :%.2f %n ",GPA);
		System.out.printf("Durum:%s %n",durum);
		input.close();
		

	}

}
