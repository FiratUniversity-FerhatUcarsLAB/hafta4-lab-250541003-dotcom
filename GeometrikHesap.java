AD SOYAD:MELİKE KEKE
  OGRENCİ NO:250541003
  TARİH:30.10.2025
  ACIKLAMA:GOREV 2 -GEOMETRIK HESAPLAYICI 
  package odev;

import java.util.Scanner;

public class GeometrikHesap {

	public static void main(String[] args) {
	System.out.println("======GEOMETRİK HESAPLAYICI======");
	final double pi=3.14159;
	double r,daireCevresi,daireAlanı,kureHacmi,kureYuzeyAlanı,daireCapı;

	Scanner input =new Scanner(System.in);

	System.out.println("Yarıçapı giriniz:");
	r=input.nextDouble();
	daireCapı=2*r;
	daireCevresi=2*pi*r;
	daireAlanı=pi*r*r;
    kureHacmi=(4.0/3.0)*pi*Math.pow(r,3);
    kureYuzeyAlanı=4*pi*r*r;
   System.out.println("Dairenin Çevresi:"+daireCevresi);
   System.out.println("Dairenin Alanı:"+daireAlanı);
   System.out.println("Dairenin Çapı:"+daireCapı);
   System.out.println("Kürenin Hacmi:"+kureHacmi);
   System.out.println("Kürenin Yüzey Alanı:"+kureYuzeyAlanı);
   System.out.println("====SONUÇLAR====");
   System.out.printf("Daire Çevresi:%.2f cm%n",daireCevresi);
   System.out.printf("Daire Alanı:%.2f cm^2%n",daireAlanı);
   System.out.printf("Daire Çapı:%.2f cm%n",daireCapı);
   System.out.printf("Küre Hacmi:%.2f cm^3%n ",kureHacmi);
   System.out.printf("Küre Yüzey Alanı:%.2f cm^2%n",kureYuzeyAlanı);
   input.close();
	
	
	}

}

