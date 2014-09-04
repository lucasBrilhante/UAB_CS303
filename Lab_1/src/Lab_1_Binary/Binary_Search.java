package Lab_1_Binary;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Binary_Search {
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
		//end of measuring time
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
	public static boolean SearchInTheList(int key, ArrayList<Integer> List){
		int init = 0;
		int size = List.size();
		// Stores the last element of the array
		int end = size - 1;
		
		// Calculates the middle element of the array
		int mid = (init + end) / 2;
		
		// It will iterate the array until check all the elements recursively
		while(init <= end){
	    	if(List.get(mid) < key){
	    		init = mid + 1;
	    	}
	    	else if(List.get(mid) == key){
				return true;
	    	}
	    	else{
	    		end = mid - 1;
	    	}
	    	mid = (init + end)/2;
		}    
		return false;
	}
}

