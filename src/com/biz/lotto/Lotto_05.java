package com.biz.lotto;

import java.util.Random;

public class Lotto_05 {
	public static void main(String[] args) {

		/*
		 * 1.정수형배열을 45개를 생성 2.순서대로 1부터 45까지의 숫자를 각가 대입 배열요소에는 중복된 값이 없다. 3. 45의 배열을 무작위
		 * 섞기(shuffle) 4.섞인배열에서 0번에서 5번까지를 추출해서 5.콘솔에보여주기
		 */

		int[] num = new int[45];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		// 횟수를 정하지 않은 반복문
		// for(;;) {}
		// 보통은 for문을 이용해서 무한반복을 사용하지 않는다.

		// 무한반복
		boolean a = 1 == 1;
		// while(a) { //while(true)
		// if(!a) break;
		// }

		Random rnd = new Random();
		int loop = num.length * 3;
		while (loop > 0) {
			int index1 = rnd.nextInt(num.length);
			int index2 = rnd.nextInt(num.length);

			// 두개의 변수에 저장된 값이 다르면
			if (index1 != index2) {
				int _temp = num[index1];
				num[index1] = num[index2];
				num[index2] = _temp;
				loop--;
			}
		}
		int[] lottos = new int[6];
		for(int i = 0 ; i<lottos.length; i++) {
			lottos[i] = num[i];
			System.out.print(lottos[i] + "\t");
		}
		for(int i = 0 ; i < lottos.length ; i++ ) {
			for(int j = (i + 1) ; j < lottos.length ; j++) {
				if(lottos[i] > lottos[j]) {
					int _temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = _temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "\t");
		}
		
	}
}