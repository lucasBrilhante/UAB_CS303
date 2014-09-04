package Lab_1_Binary;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFileInputs {
	public static ArrayList FillArray () throws FileNotFoundException{
	    File file_List = new File("C:/Users/Lucas/workspace/Lab_1/src/input3.txt");
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
