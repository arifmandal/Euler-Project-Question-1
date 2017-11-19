package euler_project;

public class Question_3 {
	//Herkese merhaba arkadaslar bugun euler projecte ucumcu soruyu cozecegiz...baslayalim...
	
	//Soru 3: En büyük asal çarpan
   //13195'in asal çarpanlarý 5, 7, 13 ve 29'dur.//burda bize bir sayinin asal sayilarla olan carpimini vermis...
  //600851475143 sayýsýnýn en büyük asal çarpaný kaçtýr?600851475143 bu sayinin asal carpanlarini soruyor...
	
	public static void main(String[] args) {
		long n=600851475143L; //long tipinde oldugu icin sonuna L yazdik.
		for (int i = 2; i <= n; i++) {//burda sayimizi en kucuk asal carpandan baslatarak verilen sayiya kadar 
			//gitmesini istedik.
			if (n%i==0) {//burda sayimizin sayilara bolumunden kalani kontrol ettik.
				System.out.println("Carpanlari= "+ i);//carpanlari yazdirdik.
				
				n=n/i;//n' imizi bolunen yeni sayiya bolduk yeni bir n olusturduk ve i'yi tekrar 2 olarak atadik.
				i=2;
			}
			//program bu kadar simdi calistiralim.bir hata var ...for dongusunde = 'i koymadik. simdi calistiralim.
		}// evet simdi dogru en buyuk bolen 6857'dir. beni dinlediginiz icin tesekkur ederim.begenmeyi ve abone olmayi 
		//unutmayalim...iyi gunler...

	}

}
