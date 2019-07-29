// if else 구문을 사용한 점수에 따른 학점 계산 프로그램
package com.javacampus.ifelse;

public class ScoreGrade {
	public static void main(String[] args) {
		int score = 59;
		char grade = 'F';
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("점수: " + score);
		System.out.println("학점: " + grade);
	}
}
