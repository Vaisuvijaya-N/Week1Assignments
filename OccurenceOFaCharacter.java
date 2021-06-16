package week2.assignments.stringconcepts;

public class OccurenceOFaCharacter {
public static void main(String[] args) {
	String occ="Live life like queen size";
	
	char[] ch=occ.toCharArray();
	int count=0;
	for (int i = 0; i < ch.length; i++) {
		if ('w'==ch[i]) {
			count=count+1;
		}
	}
	if(count==0) {
		System.out.println("Given char not found");
	}else {
	System.out.println("E appears "+count+" of times");
	}
 }
}