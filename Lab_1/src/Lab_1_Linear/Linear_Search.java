package Lab_1_Linear;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Linear_Search {
	public static void main(String[] args) throws FileNotFoundException {
		//measuring time
		long startTime = System.currentTimeMillis();
		//declaring
		int i,key;
		ArrayList<Integer> List = new ArrayList<>();
		ArrayList<Integer> ListKeys = new ArrayList<>();
		//Copying the array from the function
		List = (ArrayList<Integer>)ReadFileInputs.FillArray().clone();
		ListKeys = (ArrayList<Integer>)ReadFileKey.FillArray().clone();
		//Search algorithm
		for(i = 0; i<ListKeys.size();i++){
			//the key that is going to be searched for this 'for'
			key = ListKeys.get(i);
			if(SearchInTheList(key,List) == true){
				System.out.println(key + "found");
			}else if(SearchInTheList(key,List) == false){ 
				System.out.println(key + "not found");
			}
		}//end for
		//end of counting
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
	public static boolean SearchInTheList(int key, ArrayList<Integer> List){
		int j;
		for(j = 0; j < List.size();j++){
			if(key == List.get(j))	
				return true;
		}//end for
		return false;
	}
}
