package com.function.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

	private List<String> list = new ArrayList<>();

	public void create(String email) {
		list.add(email);
	}

	public List<String> findAll() {
		list.add("from bean stalk.....");
         return list;
	}

	public static int[] sortArray(int[] nums) {
		int length = nums.length;
		int mid = length / 2;
		int[] leftarr = new int[mid];
		int[] rightarr = new int[length - mid];

		if (length < 2) {
			return nums;
		}

		for (int i = 0; i < mid; i++) {
			leftarr[i] = nums[i];
		}
		for (int i = mid; i < length; i++) {
			rightarr[i - mid] = nums[i];
		}
		sortArray(leftarr);
		sortArray(rightarr);

		return merging(leftarr, rightarr, nums);
	}

	public static int[] merging(int[] leftarr, int[] rightarr, int[] inputarr) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftarr.length && j < rightarr.length) {

			if (leftarr[i] < rightarr[j]) {
				inputarr[k] = leftarr[i];
				i++;
				k++;
			} else {
				inputarr[k] = rightarr[j];
				j++;
				k++;
			}

		}

		while (i < leftarr.length) {
			inputarr[k] = leftarr[i];
			i++;
			k++;
		}

		while (j < rightarr.length) {
			inputarr[k] = rightarr[i];
			j++;
			k++;
		}

		return inputarr;

	}

}
