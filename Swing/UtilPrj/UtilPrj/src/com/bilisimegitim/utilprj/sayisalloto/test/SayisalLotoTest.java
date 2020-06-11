package com.bilisimegitim.utilprj.sayisalloto.test;

import com.bilisimegitim.utilprj.sayisalloto.SayisalLoto;

public class SayisalLotoTest {

	public static void main(String[] args) {
		
		SayisalLoto loto = new SayisalLoto(); 

		int[] sayilar = loto.arrayOlustur();
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}

	}

}
