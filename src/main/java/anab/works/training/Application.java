package anab.works.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	public int countWords(String text) {
		String[] words = StringUtils.split(text, ' ');
		return (words == null) ? 0: words.length;
	}
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello!");
		for (String greeting:greetings) {
			System.out.println("Greeting: " + greeting);
		}
	}	
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	System.out.println ("No.of Words in String \"This is Anand!\" is : " + app.countWords("This is Anand!"));
    }
}