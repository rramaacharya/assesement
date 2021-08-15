package TreeCount;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
 
static int trees(int arr[], int n)
{

	Queue<Integer> q = new LinkedList<>();
	
	Arrays.sort(arr);
    
    q.add(arr[0]);
    
    for (int i = 1; i < n; i++)
    {
        int now = q.element();
 
        if (arr[i] >= 2 * now)
        q.remove();
 
        
        q.add(arr[i]);
    }
 
    return q.size();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10, 6, 12, 9, 11, 16, 24, 20, 17, 26};
		int n= arr.length;
		System.out.println("Total Visible trees:" +trees(arr,n));
		
	}

}
