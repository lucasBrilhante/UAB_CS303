package Lab_1_Linear;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFileInputs {
	public static ArrayList FillArray () throws FileNotFoundException{
	    File file_List = new File("C:/Users/Lucas/workspace/Lab_1/src/input3.txt"); //change to input 1,2 or 3 to to see the difference of time
	    ArrayList<Integer> list = new ArrayList<>();
	    Scanner Inputs = new Scanner(file_List);
	    
	    while(Inputs.hasNextInt()){
	    	int i = Inputs.nextInt();
	    	list.add(i);
	    }
	    Inputs.close();
	    return list;
	}
}
