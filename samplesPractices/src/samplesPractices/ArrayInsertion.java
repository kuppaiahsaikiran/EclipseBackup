package samplesPractices;
import java.util.*;
public class ArrayInsertion {
	
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			int [] arr = new int[scan.nextInt()];

			for(int i=0 ; i<=arr.length-1 ; i++)

			{

				arr[i] = scan.nextInt();

			}

			int [] sortedArr = InsertionSort.insertionSorting(arr);

			for(int x:sortedArr)

			{

				System.out.print(x+" ");

			}

		}

	}

	class InsertionSort 

	{

		public static int[] insertionSorting(int arr[])

		{

			int item;

			for(int i=1;i<=arr.length-1;i++)

			{

				int j=i-1;

				item=arr[i];

				while(j>=0 && arr[j]>item)

				{

					arr[j+1]=arr[j];

					j--;

				}

				arr[j+1]=item;

			}

			return arr;

		}

	}
	



