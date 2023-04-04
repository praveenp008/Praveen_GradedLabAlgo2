package com.glearning.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CurrencyService {

	public void denominatorService(int[] denominators, long amount) {
		sortArray(denominators);
		boolean flag = true;
		List<String> result = new ArrayList<>();
		while (flag) {
			for (int i = denominators.length - 1; i >= 0; i--) {
				int numberOfDenominator = 0;

				while (amount >= denominators[i]) {
					amount = amount - denominators[i];
					numberOfDenominator++;
				}
				if (numberOfDenominator != 0) {
					result.add(denominators[i] + ":" + numberOfDenominator);
				}

			}
			flag = false;
		}

		System.out.print("Your payment approach in order to give min no of notes will be \n " + result);

	}

	private int sortArray(int[] array) {
		int i, temp;
		for (i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[i];
	}
}
