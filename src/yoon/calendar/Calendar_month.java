package yoon.calendar;

import java.util.Scanner;

public class Calendar_month {
	public static void main(String[] args) {

		System.out.println("달을 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number > 12) {
			   System.out.println("값을 잘못 입력하였습니다.");
	          }

		  else if (number < 8 && number % 2 > 0) {
			System.out.println(number + "월은 31일까지 있습니다.");
		} else if (number < 8 && number % 2 == 0 && number != 2) {
			System.out.println(number + "월은 30일까지 있습니다.");
		} else if (7 < number && number % 2 > 0) {
			System.out.println(number + "월은 30일까지 있습니다.");
		} else if (7 < number && number % 2 == 0) {
			System.out.println(number + "월은 31일까지 있습니다.");
		} else if (number == 2) {
			System.out.println(number + "월은 28일까지 있습니다.");
		}
		  scanner.close();
}
}
