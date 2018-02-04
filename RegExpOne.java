import java.util.regex.*;
public class RegExpOne {

	public static void main(String[] args) {
		int zipCode = 12345; // zip code to check
		String sentence = " John Shanks. New York "+zipCode; // sentence to check
		
		regExpFunction("\\s[A-Za-z]{2,50}", sentence); // method call with regular expression language and char params
		
		findZipCodeWithRegExp("\\s\\d{5}", sentence); // zip code method call with param length of 5

	}
	
	// regular expression method with 2 params 
	public static void regExpFunction(String regExp, String string2Check){
		Pattern checkRegExp = Pattern.compile(regExp);
		
		Matcher regExpMatcher = checkRegExp.matcher(string2Check);
		
		// while loop to check string param
		while(regExpMatcher.find()){
			// trim & print if length > 0
			if(regExpMatcher.group().length() > 0){
				System.out.println(regExpMatcher.group().trim());
			}
			// print start index and end index
			System.out.println("Start index: "+regExpMatcher.start());
			System.out.println("End index: "+regExpMatcher.end());
		}
	}
	
	// method to check for zip code with 2 params
	public static void findZipCodeWithRegExp(String regExp, String string2Check){
		Pattern checkRegExp = Pattern.compile(regExp);
		
		Matcher regExpMatcher = checkRegExp.matcher(string2Check);
		
		System.out.println("\nZip Code:");
		
		// while loop to check for > 0 group()
		while(regExpMatcher.find()){
			if(regExpMatcher.group().length() > 0){
				// trim and print in length > 0
				System.out.println(regExpMatcher.group().trim());
			}
			// print start and end index
			System.out.println("Start index: "+regExpMatcher.start());
			System.out.println("End index: "+regExpMatcher.end());
		}
	}
	
	

}
