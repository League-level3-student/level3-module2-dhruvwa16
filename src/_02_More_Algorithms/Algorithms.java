package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int j = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i) == "cracked") {
				 j=i;
				 i = eggs.size();
			}
		}
		return j;
	}
	public static int countPearls(List<Boolean> oysters) {
		int j = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				j++;
			}
		}
		
	return j;
	}
	public static double findTallest(List<Double> peeps) {
		double j = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > j) {
				j = peeps.get(i);
			}
		}
		
		
		return j;
	}
	
	public static String findLongestWord(List<String> words) {
		String a = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > a.length()) {
				a = words.get(i);
			}
		}
		
		
		return a;
	}
	public static boolean containsSOS(List<String> message1) {		
		for (int i = 0; i < message1.size(); i++) {
			String s =  "... --- ... ";
			if(message1.get(i).contains(s)) {
				return true;
			}
		}
		return false;
		
	}
	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		ArrayList<String> unsorted2=new ArrayList<String>();
		for (int i = 0; i < 28; i++) {
			for (int j = 0; j < unsortedSequences.size(); j++) {
				if(unsortedSequences.get(j).length() == i) {
					unsorted2.add(unsortedSequences.get(j));
				}
			}
		}
		
		unsortedSequences = unsorted2;
		
		return unsorted2;
	}
	
	
	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		ArrayList<String> words2=new ArrayList<String>();
		
		for (int j = 0; j < words.size(); j++) {
			int counter = 0;
		for (int i = 0; i < words.size(); i++) {
			if(words.get(j).compareTo(words.get(i)) > 0) {
				counter++;
			}
		}
		words2.add(counter, words.get(j));
		
		}
		words = words2;
		return words;
	}
	
	

		// TODO Auto-generated method stub
		
	}

	

	

