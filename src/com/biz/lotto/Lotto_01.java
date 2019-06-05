package com.biz.lotto;

import java.util.Random;

public class Lotto_01 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 선언 및 초기화(생성)하고
		// 1~45까지의 임의의 정수를 1개씩 배열에 채우시오
		int[] intNum = new int[6];
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(45) + 1;

		}

		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");
		}
		
		/*
		 * 또다른 임의숫자를 생성해서
		 * num배열에 담겨 있는지 검사
		 * 있으면 있다
		 * 없으면 없다.
		 */
		
		int intR = rnd.nextInt(45) + 1;  
		int index;
		for(index = 0; index<intNum.length ; index++) {
			if(intNum[index] == intR) {
				break;
			}
		}
		if(index >= intNum.length ) {
			System.out.println("값이 없음");
		} else {
			System.out.println("값이 있음");
		}
	}

}
