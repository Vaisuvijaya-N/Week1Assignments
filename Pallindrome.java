package week2.assignments.stringconcepts;


public class Pallindrome {
public static void main(String[] args) {
	String ay1="yelley";
	char ch[]=ay1.toCharArray();
			String ay2="";
	for(int i=ch.length-1;i>=0;i--)
	{
		ay2=ay2+ch[i]; //PTR : if you change var while appending it will add in same order and not in reverse // try ay2=ch[i]+ay2
		System.out.println(ay2);
	}
	if(ay1.equalsIgnoreCase(ay2)) {
		System.out.println("I/P '"+ay1+"' word is a pallindrome");
	}
	else {
		System.out.println("Not a pallindrome");
	}
}
}
