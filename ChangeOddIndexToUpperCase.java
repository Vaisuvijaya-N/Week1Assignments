package week2.assignments.stringconcepts;

public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String key="AutomationScripts";
	char[] ky=key.toCharArray();
	
	for(int i=0;i<ky.length;i++) {
		if(i%2!=0) {
			ky[i]=Character.toUpperCase(ky[i]);
		}
	}
	System.out.println(ky);

}	
	
}
