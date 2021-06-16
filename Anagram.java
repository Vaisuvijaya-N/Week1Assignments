package week2.assignments.stringconcepts;

import java.util.Arrays;

//anagram requires the shuffling of the letters. whereas pallindrome - gives same word on reversing
public class Anagram {

public static void main(String[] args) {
	String a1="listen";
	String a2="silent";
	int count=0;
	int cc=0;
	int ee=0;
	if (a1.length()==a2.length()) {
		char firstString[]=a1.toCharArray();
		char secondString[]=a2.toCharArray();
		System.out.println(firstString);
		System.out.println(secondString);
//		if(a1.contentEquals(a2)) {
//			System.out.println("given is an anagram");
//		}
		Arrays.sort(firstString);
		Arrays.sort(secondString);
		if (Arrays.equals(firstString,secondString)) {
			System.out.println("Anagram"); //basic
		}
		
		
		//when confirm its a equal length word to check as anagram without using sort
		for (int k=0;k<firstString.length;k++) {
			for (int l=0;l<firstString.length;l++) {
				 if(firstString[k]==secondString[l]) {
					  cc=cc+1;
					 break;
	              }	
				 else if(l==firstString.length-1&&firstString[k]==secondString[l]) {
					 System.out.println("confirm its not a anagram");
				   }
				 else {
					 continue;
				 }
				 }
			
			}
		if(cc==secondString.length) {
			System.out.println("confirm its a anagram");
			
		
		}
		
		//without using sort , used nested loop to check characters, if i check present or not with different length of two strings
		for (int i=0;i<firstString.length;i++) {
			for (int j=0;j<firstString.length;j++) {
				 if(firstString[i]==secondString[j]) {
					 count=count+1 ;
					 ee=ee+1;
                     }			 
			}
			if(count>1) {
				 System.out.println("Definitely not a anagram***");
				 System.out.println(firstString[i]);
				break;
		         }
			count=0;
			}
		if(ee==secondString.length) {
			System.out.println("Definitely a anagram***");
			
		
		}
			
	}
}
}

