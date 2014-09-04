package Lab_2;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Insetion_Sort{
	public static void main(String[] args) throws FileNotFoundException {
		//Declaring variables
		int j,key,i;
		ArrayList<Integer> List = new ArrayList<>();
		//Copying the array from the function
		List = (ArrayList<Integer>)ReadFile.FillArray().clone();
		//Insetion Sort algorithm
		for (j=1;j<List.size();j++){
			key = List.get(j);
			i = j-1;
			while((i>=0)&&(List.get(i) > key)){
				List.set(i+1, List.get(i));
				i=i-1;
				
			}
			List.set(i+1, key);
		}
		//calling the canvas given algorithm
		boolean result = SortedCheckTest.sortCheckAsc(List);
		if(result == true) System.out.println("It is sorted");
		else System.out.println("It is not Sorted");
	}
	
}