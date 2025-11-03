AD SOYAD:MELİKE KEKE
	ÖĞRENCİ NO:250541003
	package odev;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class MaasHesap {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
String ad,soyad;
double brutMaas,mesaiUcreti,toplamGelir,sgkKesinti,gelirVergisi,damgaVergisi,toplamKesinti,kesintiOranı,saatlikNetKazanc,gunlukNetKazanc,netMaas;
int haftalıkSaat,mesaiSaati;
final double SGK_ORANI=0.14;
final double GELİR_VERGİSİ_ORANI=0.15;
final double DAMGA_VERGİSİ_ORANI=0.00759;
System.out.println("====================================");
System.out.println("           MAAS BORDROSU");
System.out.println("====================================");
System.out.println("Çalışanın adını giriniz:");
ad=input.nextLine();
System.out.println("Çalışanın soyadını girinz:");
soyad=input.nextLine();
System.out.println("Aylık brüt maas(TL)");
brutMaas=input.nextDouble();
System.out.println("Haftalık calışma saatini giriniz:");
haftalıkSaat=input.nextInt();
System.out.println("Mesai saatini giriniz");
mesaiSaati=input.nextInt();
mesaiUcreti=(brutMaas/160)*1.5;
toplamGelir=brutMaas+mesaiUcreti;
sgkKesinti=toplamGelir*SGK_ORANI;
gelirVergisi=toplamGelir*GELİR_VERGİSİ_ORANI;
damgaVergisi=toplamGelir*DAMGA_VERGİSİ_ORANI;
toplamKesinti=sgkKesinti+gelirVergisi+damgaVergisi;
netMaas=toplamGelir-toplamKesinti;
kesintiOranı = (toplamKesinti / toplamGelir) * 100;
 saatlikNetKazanc = netMaas / 176; 
 gunlukNetKazanc = netMaas / 22;
 System.out.println("\n====================================");
 System.out.printf("Calisan: %s %s%n", ad, soyad);
 System.out.println("------------------------------------");
 System.out.println("GELIRLER:");
 System.out.printf("Brut Maas               : %.2f TL%n", brutMaas);
 System.out.printf("Mesai Ucreti (%d saat)  : %.2f TL%n", mesaiSaati, mesaiUcreti);
 System.out.println("------------------------------------");
 System.out.printf("TOPLAM GELIR            : %.2f TL%n", toplamGelir);

 System.out.println("\nKESINTILER:");
 System.out.printf("SGK Kesintisi (%.1f%%)       : %.2f TL%n", SGK_ORANI * 100, sgkKesinti);
 System.out.printf("Gelir Vergisi (%.1f%%)       : %.2f TL%n", GELİR_VERGİSİ_ORANI * 100, gelirVergisi);
 System.out.printf("Damga Vergisi (%.1f%%)       : %.2f TL%n", DAMGA_VERGİSİ_ORANI * 100, damgaVergisi);
 System.out.println("------------------------------------");
 System.out.printf("TOPLAM KESINTI           : %.2f TL%n", toplamKesinti);

 System.out.println("\n====================================");
 System.out.printf("NET MAAS                 : %.2f TL%n", netMaas);
 System.out.println("====================================");
 System.out.println("\nISTATISTIKLER:");
 System.out.printf("Kesinti Orani        : %.1f%%%n", kesintiOranı);
 System.out.printf("Saatlik Net Kazanc   : %.2f TL%n", saatlikNetKazanc);
 System.out.printf("Gunluk Net Kazanc    : %.2f TL%n", gunlukNetKazanc);

 input.close();

	}

}

