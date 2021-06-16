package week2.assignments.stringconcepts;

public class FindTypes {
	public static void main(String[] args) {
		String occ="Live91& life4* like6$ queen3@ size7*";
		
		char[] ch=occ.toCharArray();
		int letter=0;
		int space=0;
		int digit=0;
		int specialchar=0;
		for (int i = 0; i < ch.length; i++) {
			
		if(Character.isLetter(ch[i])) {
			letter=letter+1;
		}else if(Character.isDigit(ch[i])){
			digit=digit+1;
		}
		else if(Character.isSpace(ch[i])){
			
			space=space+1;
		}
		else {
			specialchar=specialchar+1;
		}
		
		}
		System.out.println("String has "+letter+" letter and "+digit+" digit and "+space+" space and"+specialchar+" special char");
	 }
}
