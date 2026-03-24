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

public class TestStudy01 {
	// 전역변수 영역 - Field변수(java C#), member변수 (c++)
	// UML : 속성(Attribute)
	static int num;
	static String name;
	static int kor;
	static int eng;
	static int math;
	static int tot;
	static double avg;
	static char grade;

	public static void main(String[] args) {
		input();
		process();
		output();
	}
// input();
	private static void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("번호 이름 국어 영어 수학");
		String line = in.nextLine(); //한줄로 입력받음 ex) 1, 안유진, 90 ,80, 90 
		String [] li = line.trim().split(","); // 입력 받은 것을 배열로 trim()공백 빅칸없이 쉼표를 기준으로 문자열 배열을 정리
		//1, 안유진, 90 ,80, 90 li[0]=1, li[1]=안유진 ... 
		// 문자열을 숫자열로 교환
		num = Integer.parseInt(li[0].trim());
		name = (li[1].trim());
		kor = Integer.parseInt(li[2].trim());
		eng = Integer.parseInt(li[3].trim());
		math = Integer.parseInt(li[4].trim());		
	}
	//process()
	private static void process() {
		
		tot    = kor + eng + math;
		avg    = tot / 3.0;
		char [] g = {'F','F','F','F','F','F','D','C','B','A','A'};
		grade = g [(int)avg/10];
	}
	// output()
	private static void output() {
		System.out.println("output");
		System.out.println("번호 이름    총점  평균  등급");
		System.out.printf(" %d  %s  %d  %.2f  %c\n", num, name, tot, avg, grade);		
	}

}
