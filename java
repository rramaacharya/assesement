package TreeCount;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
 
static int trees(int arr[], int n)
{

	int maxHeight = Integer.MIN_VALUE;
	int visibleTrees = 0;
    
    for (int i =01; i < n; i++)
    {
       if(arr[i]>maxHeight)
       {
       maxHeight = arr[i];
       visibleTrees++;
       }
    }
 
    return visibleTrees;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10, 6, 12, 9, 11, 16, 24, 20, 17, 26};
		int n= arr.length;
		System.out.println("Total Visible trees:" +trees(arr,n));
		
	}

}
