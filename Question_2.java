package euler_project;

public class Question_2 {
//Herkese merhaba simdide euler projesinin ikinci sorusunu cozecegiz...baslayalim...

/*Fibonacci serisinde her say�, kendisinden �nce gelen iki say�n�n toplam�d�r. 
*1 ve 2 ile ba�layan serinin ilk 10 say�s�:
*1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
*Bu serinin d�rt milyondan (4000000) k���k t�m �ift say�lar�n�n toplam�n� bulunuz.*/

	public static void main(String[] args) {
		int toplam=0;// burada en sonki bulacagimiz cift sayilarin toplamini 0 a esitledik.
		int x=1;  // x ve y ise ilk iki elemani olup sirayla degisecektir.
		int y=2;
		while(x<=4000000){// burada istenilen sayiya kadar while dongusunun icine soktuk.
			if (x%2==0){//cift sayilari bulabilmek icin 2 ye bolumunden kalana baktik.
				toplam+=x;
			}
			int z=x+y;
			x=y;
			y=z;//burada ise fibonacci dizisinin kendine ait dongusunu yazdik...		
		}
		System.out.println("toplam= "+toplam);//en son toplam degerimizi yazdiriyoruz.ve bakalim sonuc 
		//degerine...cikan degerimiz dogru
		//beni dinlediginiz icin tesekkur ederim. asagiya sorularinizi sorabilirsiniz. begenmeyi ve takip 
		//etmeyi lutfen unutmayin.
	}

}
