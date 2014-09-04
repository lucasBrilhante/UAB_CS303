import java.util.ArrayList;


public class InOrder {
	public static void main(String[] args) {
		int j,Times = 0,key,i;
		ArrayList<Integer> List = new ArrayList<>();
		for(j = 1;j<=6;j++){
			List.add(j);
			
		}
		for (j=1;j<List.size();j++){
			key = List.get(j);
			i = j-1;
			while((i>0)&&(List.get(i) > key)){
				List.set(i+1, List.get(i));
				i=i-1;
				Times++;
			}
			List.set(i+1, key);
		}
		System.out.println(Times);
		
	}
}
