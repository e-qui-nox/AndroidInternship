import java.util.Arrays;

public class BinarySearchExample {

		public boolean binarySearch(int sortedArray[],
								 int left,
								 int right,
								 int key) { //we do so to make it more easily readable
			while(left<=right) {
				int mid=left+(right-left)/2;
				if(sortedArray[mid]==key) {
					return true;
				}
				else if(sortedArray[mid]>key) {
					right=mid-1;
				}
				else {
					left = mid+1;
				}
			}
			return false;
		}
		
		
		public static void main(String[] args) {
			
			int[] unsortedArray=new int[10];
			for(int i=0;i<unsortedArray.length;i++) {
				unsortedArray[i] =1+(int)(Math.random()*10); //[(Max-Min)+1] how random works 
				//(int) since the result is double to typecast
				//range is 0-10 but 0 is inclusive but 10 is exclusive
				//Math belongs to java.lang  .....it is imported automatically
			}
			
			System.out.println();
			System.out.println("Unsorted Array");
			for(int i=0;i<unsortedArray.length;i++) {
				System.out.print(unsortedArray[i]+" ");
			}
			System.out.println("\nSorted Array");
			
			Arrays.sort(unsortedArray); //unsorted -> sorted
			
			for(int i=0;i<unsortedArray.length;i++) {
				System.out.print(unsortedArray[i]+" ");
			}
			System.out.println();
			
			BinarySearchExample example = new BinarySearchExample();
			System.out.println(example.binarySearch(unsortedArray, 0,9,4));
			
			System.out.println(Arrays.binarySearch(unsortedArray, 4));
			//+4 when element is there and corresponds to that elements position in the sorted array(could be 3 or 4)
			//-9 means if you place the element before the 9th index you will find the key in that sorted array means element in the 8th index hence (-insertionIndex -1);
		}
}
