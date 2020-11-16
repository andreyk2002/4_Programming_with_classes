package by.epam_tc.class_programminng.agregation_decomposition;

import java.util.regex.*;

public class Tst {
	
	public static void main(String[] argc) {
		
		Pattern p = Pattern.compile("(.*)(\\d+)(.*)");
		
		Matcher m = p.matcher("It was in 988 year! Isn't it?");
		
		while(m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
			
		}
		
	}
}
