package com.dsa.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortCharacetersByFrequency {

	static class Pair
	{
		char ch;
		int count;

		public Pair(char ch, int count)
		{
			this.ch = ch;
			this.count = count;
		}
	}

	public static void main(String[] args) {

			String s = "Aabb";
			System.out.println(frequencySort(s));
	}

	public static String frequencySort(String s) {

		// 0 - 125 for storing char 
		int[] arr = new int[125];

		for(char ch : s.toCharArray())
		{
			arr[ch]++;
		}

		// storing each char occur how may time
		LinkedList<Pair> frequ_list = new LinkedList<>();

		for(int i=48;i<=122;i++)
		{
			if(arr[i]>0)
			{
				frequ_list.add(new Pair((char) i, arr[i]));
			}
		}

		// sort descending order
		Collections.sort(frequ_list, new Comparator<Pair>() {

			@Override
			public int compare(Pair a, Pair b) {
				return b.count - a.count;
			}
		});

		// String Construct
		StringBuilder sb = new StringBuilder();
		for(Pair P : frequ_list)
		{
			int count = P.count;
			while(count-->0)
			sb.append(P.ch);
		}

		return sb.toString();
	}

}
