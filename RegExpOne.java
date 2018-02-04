import java.util.regex.*;
public class RegExpOne {

	public static void main(String[] args) {
		String sentence = " Today is sunny. The temperature is 12 degrees celcius.";
		
		
		regExpFunction("\\s[A-Za-z]{2,50}", sentence);

	}
	
	public static void regExpFunction(String regExp, String string2Check){
		Pattern checkRegExp = Pattern.compile(regExp);
		
		Matcher regExpMatcher = checkRegExp.matcher(string2Check);
		
		while(regExpMatcher.find()){
			if(regExpMatcher.group().length() != 0){
				System.out.println(regExpMatcher.group().trim());
			}
			System.out.println("Start index: "+regExpMatcher.start());
			System.out.println("End index: "+regExpMatcher.end());
		}
	}

}
