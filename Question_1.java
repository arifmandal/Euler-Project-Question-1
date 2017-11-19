package euler_project;

public class Question_1 {
 //Herkese merhaba bugun euler projesinin ilk sorusunu cozecegim.baslayalim ilk soru asagidaki gibi...

 /*
 * 3'ün veya 5'in katý olan 10'dan küçük tüm doðal sayýlarý listelersek, 3, 5, 6, ve 9'u elde ederiz. 
 * Bu katlarýn toplamý 23'tür.
 * 3'ün veya 5'in 1000'den küçük tüm katlarýnýn toplamýný bulunuz...yani burada bizden 3 veya 5 e 
 * bolunebiilen sayilarin toplamini istiyor...
 */
	public static void main(String[] args) {
	int toplam=0;// burada ilk toplamimizi sifira esitledik.
	
	for(int i=0;i<1000;i++){// burada bizden istenilen degere yani 1000 sayisina i nin gitmesini istedik.
		
		if(i%3==0 || i%5==0){//burada ise 3 veya 5 e bolunebilmeyi sagladik.
			
			toplam+=i;//toplamimizi ise her seferde arttiedik.
		}
		
		
	}
		
		System.out.println("toplam= "+toplam);//en son ise degerimizi yazdirdik. toplam degerimiz 233168...
		//beni dinlediginiz icin tesekkur ederim. her turlu sorunuzu asagiya belirte blirsiniz...
		// abone olmayi unutmayin lutfen iyi gunler...
		
	
	}

}
