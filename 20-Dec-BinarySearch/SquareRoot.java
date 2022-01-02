public class SquareRoot {
  
    public static int sqrt(int[] arr , int  x) {
        long start = 0;
        long end = x;
    
    
              while(start+1<end){  
                  long mid = start+(end-start)/2;
    
                  if(mid*mid==x) {
                     return (int)mid;
    
                  }if(mid*mid>x) {
                      end=mid;
    
    
                  }else {
                      start=mid;
    
              }if(end*end==x) {
                  return (int)end;
              }
              }
              return (int)start;
        }      
    
    
        public static void main(String[] args) {
    
         int[] arr = {2,5,6,10,12,15,16,18,32,81};
          int x = 81;
    
         int sq = sqrt(arr,x);
         System.out.println(sq);
    
     }
    } 

   

