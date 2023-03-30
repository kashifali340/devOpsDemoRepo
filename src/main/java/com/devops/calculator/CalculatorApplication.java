package com.devops.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(CalculatorApplication.class, args);


		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first number  ");
		int num1 = scanner.nextInt();
		System.out.print("Enter your second number ");
		int num2 = scanner.nextInt();

		System.out.println("Addittion: " +calculator.add(2, 3)
		+" multiply: " +calculator.multiply(2, 3)
		+" subtraction: " +calculator.subtract(3, 2)
		+" divide: " +calculator.divide(4, 2));
		while (true) {
			System.out.println("Infinite Loop... ");
			Thread.sleep( 1000);
			System.out.print("Are you want to stop the loop ? Y/N  ");
			String str = scanner.next();
			if (str.equalsIgnoreCase("y"))
				break;
			else
				continue;

	}
	}
}
