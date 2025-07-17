
public class binarysortcore {

	public static void main(String[] args) {
		        int arr[] = {12, 34, 56, 78, 90};
		        int key = 12;
		        int left = 0, right = arr.length - 1; // 4
		        int result = -1;
		        while (left <= right) {
		            int mid = left + (right - left) / 2; // 2
		            if (arr[mid] == key) {
		                result = mid;
		                break;
		            }
		            if (arr[mid] < key) {
		                left = mid + 1;
		            } else {
		                right = mid - 1;
		  
		  }
		        }
		        if (result >= 0) {
		            System.out.println("key found");
		        } else {
		            System.out.println("key not found");
		        }
		    }
		}

