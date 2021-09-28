package yoon.calendar;

import java.util.Scanner;

public class Calendar1 {
	
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	
	public static void main(String[] args) {

		System.out.println("달을 입력하세요");

		Scanner scanner = new Scanner(System.in);
		Calendar1 cal = new Calendar1();
		int month = scanner.nextInt();
		scanner.close();

		System.out.printf("%d월은 %d일까지 있습니다..\n", month, cal.maxDaysOfMonth(month));

	}
}
