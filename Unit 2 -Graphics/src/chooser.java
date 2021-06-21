import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class chooser {
	String[] wordArray = {"the", "horn", "on", "bus"}; 
	
	public chooser(){
		RandomWordChooser sPicker = new RandomWordChooser(wordArray); 
		for (int k = 0; k < 6; k++) {
			System.out.println(sPicker.getWord());
		}
	}
	
	

}
