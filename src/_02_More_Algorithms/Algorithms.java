package _02_More_Algorithms;

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
	public static Object containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			//if(message1.) {
				return true;
			}
	//	}
		
		return false;
		
	}
}
