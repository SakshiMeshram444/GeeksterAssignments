public class FirstandLastOccur {
    public static int firstPosition(int arr[] , int target) {
    	int start =0;
    	int end = arr.length-1;
    	int index = -1;

    	while(start<=end) {
    	int	mid = start+(end-start)/2;

    	if(arr[mid]==target) {
    		index= mid;
    		end = mid-1;
    	}else if(arr[mid]>target) {
    		end=mid-1;
    	}else {
    		start=mid+1;
    	}
    	}
    	return index;
    }
    public static int lastPosition(int arr[], int target) {
    	int start =0;
    	int end = arr.length-1;
    	int index = -1;

    	while(start<=end) {
    	int	mid = start+(end-start)/2;

    	if(arr[mid]==target) {
    		index= mid;
    		start= mid+1;
    	}else if(arr[mid]>target) {
    		end=mid-1;
    	}else {
    		start=mid+1;
    	}

    	}
    	return index;
    }
    public static void main(String[] args) {
	


	int[] arr = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};

	int target = 6;


	int firstIndex = firstPosition(arr,target);
	int lastIndex = lastPosition(arr,target);
	System.out.println(firstIndex);
	System.out.println(lastIndex);

    }
}