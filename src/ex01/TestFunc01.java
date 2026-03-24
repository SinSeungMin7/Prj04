package ex01;

import java.util.Scanner;

/*
  입력단계(input)
  번호 이름 국어 영어 수학
  num name kor eng math   2, 카리나, 100,90, 90

  1, 안유진, 90 ,80, 90 
  2, 카리나, 100,90, 90
  3, 장원영, 100,100,100
  4, 닝닝,  70, 90, 0
  
  계산(process)
  tot    = kor + eng + math
  avg    = tot / 3.0
  grade
  
  출력(output)
  번호 이름 총점 평균 등급
 num,name,tot,avg,grade
   
  */

public class TestFunc01 {

	// 지역변수 : local variable {} 안에서 만들었고 {} 벗어나면 사라짐
	// 전역변수 : global  class에 전역변수생성 위치(모든함수 위)에서 만든변수
	//          class가 끝날떄 까지 존재
	//          함수가 전역변수를 공유하기 위해
	// 전역변수 영역
	static int     num;
	static String name;
	static int     kor;
	static int     eng;
	static int    math;
	
	static int     tot;
	static double  avg;
	static char  grade;
	
	public static void main(String[] args) {
		// IPO : Input, Process, Output 나눠서 함수로 처리할 예정
		input();
		process();
		output();
	}

	private static void input() {
		System.out.println("input");
		
		Scanner in   = new Scanner(System.in);
		System.out.println("입력: 번호, 이름, 국어, 영어, 수학");
		String line  = in.nextLine(); //  1, 안유진, 90 ,80, 90
		String [] li = line.trim().split(","); // trim()앞뒤 공백 제거, 쉼표를 기준으로 자름
		num          = Integer.parseInt( li[0].trim() ); // "1" 
		            // Integer.parseInt : 문자열을 숫자열로 바꾸는법 
		name         = li[1].trim();                     // "안유진"
		kor          = Integer.parseInt( li[2].trim() ); // "90"
		eng          = Integer.parseInt( li[3].trim() ); // "80"
		math         = Integer.parseInt( li[4].trim() ); // "90"
	}

	private static void process() {
		System.out.println("process");
		//			  0   1   2   3   4   5   6   7   8   9   10
		char [] g = {'F','F','F','F','F','F','D','C','B','A','A'};
		    // g = gradeTable 기차칸(배열)
		
		tot       = kor + eng + math;
		avg       = tot / 3.0;
		grade     = g [ (int)avg / 10 ]; // 정수(avg)를 10으로 나눈다
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);
		
	}

	private static void output() {
		System.out.println("output");
		System.out.println("번호 이름    총점  평균  등급");
		System.out.printf(" %d  %s  %d  %.2f  %c\n", num, name, tot, avg, grade);
		
	}
	
}














