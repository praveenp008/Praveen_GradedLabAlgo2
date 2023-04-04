package com.glearning.client;

import java.util.Scanner;

import com.glearning.service.CurrencyService;

public class CurrencyClient {

	public static void main(String[] args) {
		CurrencyService service = new CurrencyService();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations ");
		int size = sc.nextInt();
		int[] denominators = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < denominators.length; i++)
			denominators[i] = sc.nextInt();

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		service.denominatorService(denominators, amount);

	}

}
