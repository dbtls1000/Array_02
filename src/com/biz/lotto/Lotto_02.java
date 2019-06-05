package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개의 정수형 배열을 생성하고

		// 정수배열 개수만큼 반복을 하면서
		// 1. 1~45까지 숫자 중 한개를 생성
		// 2. 생성한 수가 배열에 이미 담겨 있는지 검사
		// 3. 그렇지 않으면 배열에 임의 정수를 담기

		int[] num = new int[6];
		Random rnd = new Random();

		for (int i = 0; i < num.length; i++) {
			int intR = rnd.nextInt(45) + 1;
			// num[i] = rnd.nextInt(45) + 1;
			int index;
			for (index = 0; index < num.length; index++) {
				
				if (num[index] == intR) {
					break;
				}

			}
			if (index >= num.length) {
				num[i] = intR;
			} else {
				i--;
			}
	
			}
		for(int j = 0 ; j < num.length ; j++) {
			System.out.print(num[j] + "\t");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		int[] lottoNum = new int[6];
		Random rnd1 = new Random();
		
		for(int 저장위치 = 0; 저장위치 < lottoNum.length; 저장위치++) {
			int intR = rnd1.nextInt(45) + 1;
			// lotto배열에 intR과 같은값이 있는지 검사
			
			int 찾을위치 = 0 ;
			for(찾을위치 = 0 ; 찾을위치 < lottoNum.length ; 찾을위치++) {
				if(lottoNum[찾을위치] == intR) {
					break;
				}
			}
			// 값을 못찾았다.
			if(찾을위치 >= lottoNum.length) {
				// 생성한intR을 저장위치에 저장해도된다.
				lottoNum[저장위치] = intR;
			// 찾았다
			} else {
				// 번호를 다시 생성해서
				// 저장위치에 저장을 해야한다.
				저장위치--;
			}
			
			
			
			
		}
		for(int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] + "\t");
		}
		
	}

}
