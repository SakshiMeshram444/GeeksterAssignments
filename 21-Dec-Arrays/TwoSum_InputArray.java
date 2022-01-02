import java.util.Scanner; 
class TwoSum_InputArray {
    public void pairedElements(int arr[], int sum) {

        int low = 0;

        int high = arr.length - 1;


        while (low < high) {

            if (arr[low] + arr[high] == sum) {

             System.out.println("The pair is : (" + arr[low] + ", " + arr[high] + ")");

            } if (arr[low] + arr[high] > sum) {

                high--;

            } else {

                low++;

            }

        }

    }


    public static void main(String[] args)  {
        int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
        Scanner sc = new Scanner(System.in);
        TwoSum_InputArray sp = new TwoSum_InputArray();

        sp.pairedElements(arr, 9);

}	
} 

