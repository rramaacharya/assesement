package TreeCount;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
 
static int trees(int arr[], int n)
{

	Stack<Integer> s = new Stack();

    
    
    for (int i = n-1; i>=0; i--)
    {
       if(s.isEmpty())
       {
       		s.push(arr[i]);
       }
       else
       {
       int curr = arr[i];
       
       while(!s.isEmpty() && curr>=s.peek())
       {
       		s.pop();
       }
       
       s.push(arr[i]);
       }
    }
 
    return s.size();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10, 6, 12, 9, 11, 16, 24, 20, 17, 26};
		int n= arr.length;
		System.out.println("Total Visible trees:" +trees(arr,n));
		
	}

}
