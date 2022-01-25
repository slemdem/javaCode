package exam1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// Array
		// 배열 : 같은 타입의 변수들로 이루어진 집합
		// 배열을 구성하는 각각의 값
		// 배열에서 위치를 가리키는 숫자
		// 배열을 구성하는 각각의 값 : 요소(element)
		// 배열에서 위치를 가리키는 숫자 : 인덱스(index)
		
		// 배열의 선언과 동시에 초기화 하는 케이스
		int[] number = {10, 20, 30}; // [],{} 초기화 블록
		int[] number2 = new int[] {20, 30, 40};
		//System.out.println(number[2]);
		
		// 배열 선언 후 인덱스 별로 초기화하는 케이스
		String[] str1 = new String[2];
		
		str1[0] = "80"; 
		str1[1] = "90"; 
		//System.out.println(str1[1]);
		 
		// 퀴즈
		// str1[2] = "test";
		// System.out.println(str1[2]);일때
		// 정답 : 에러
		// 이유 : 범위 초과 (str1 배열)
		
		//str1[0] = "80";
		//str1[1] = "90";
		//System.out.println(str1[0]);
		// null이 출력되게 됨
		
		// 배열의 응용
		// 1. 배열에 입력받은 요소들의 총합과 평균 구하기
		
		int[] number3 = new int[] {85,75,45};
		int sum=0;
		
		for(int i=0; i<number3.length; i++) {
			sum +=number[i];
		};
		// 총합
		System.out.println(sum);
		
		// 다차원 배열
		// 2차원 이상의 배열 : 배열요소로 또다른 배열을 가지는 배열
		
		// 2차원 배열의 예시
		// 타입[][] 배열명;
		// 타입 배열형[][];
		// 타입[] 배열명[];
		
		int[][] di_arr = {
				{10, 30, 50},
				{15, 25, 35}
		};
		System.out.println(di_arr[1][1]);
		
		// 가변배열
		// 열의 길이를 명시하지 않고 행마다 다른길이의 배열을 요소로 저장하는 배열
		// int[][] arr2 = new int[3][];
		int[][] arr2 = {
				{10, 15},
				{10, 20, 30, 45},
				{10}
		
		};
		System.out.println(arr2[1][3]);
		
		// 배열의 복사
		// 자바에서 배열은 생성후 길이를 변경하기가 매우 어렵다
		// 어떤 배열에더 많은 데이터를 저장하기 위해 이전 배열의 데이터를 새롭게 옮길 배열로 복사
		
		// arraycopy, copyof, clone
		
		// for문 + index 복사
		
		
		int[] arr3 = new int[] {1,2,3,4,5}; int nlength = 10;
		  
		int[] newArr1 = new int[nlength]; //arraycoppy(기존배열, 옮길배열, 옮길범위)
		  
		//System.arraycopy(arr3, 0, newArr1, 2, arr3.length);
		  
		//for(int i=0; i<newArr1.length; i++) { 
		//  System.out.println(newArr1[i] + " ");
		//};
		 
		  
		  //copyOf
		int[] arr4 = Arrays.copyOf(arr3,nlength);
		
		for (int i=0; i<arr4.length; i++) { 
			System.out.println(arr4[i] + " ");
		 };
		 
		//clone
		 int[] arr5 = (int [])arr3.clone();
			
		for (int i=0; i<arr5.length; i++) { 
			System.out.println(arr5[i] + " ");
		 };
			 
		
		
		}
}
