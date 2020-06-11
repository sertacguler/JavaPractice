package com.bilisimegitim.utilprj.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto {
	
	public static final int MINDEGER = 1;
	public static final int MAXDEGER = 49;
	public static final int ARRAY_BOY = 6;
	
	public int[] arrayOlustur() 
	{
		int[] sayilar = new int[ARRAY_BOY];
		
		int sayi = 0;
		
		for (int i = 0; i < sayilar.length; i++) {

			do {
				sayi = rastgeleSayiOlustur();
			} while (arraydeVarmi(sayi, sayilar) );
		
			sayilar[0] = sayi;
		}
		
		Arrays.sort(sayilar);
		
		return sayilar;
	}
	
	private int rastgeleSayiOlustur() 
	{
		Random rand = new Random();
		
		return rand.nextInt(MAXDEGER)+1;
	}
	
	private boolean arraydeVarmi(int p_sayi, int[] p_array)
	{
		//Arrays.binarySearch kullanmanin sarti sirali olmasi
		Arrays.sort(p_array);
		
		int sonuc = Arrays.binarySearch(p_array, p_sayi);
		
		if (sonuc >= 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
