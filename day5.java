
public class day5 {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target= 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        //find the range
        //start with a box of size 2
        int start=0;
        int end=1;
        //condition for target to lie in the range
        while(target>arr[end]){
            int newStart = end+1; //newStart is temp
            //double the box value
            //end= previous end + size of box*2
            end =  end +( end-start+1) * 2;
            //update the start value
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start , int end){
        
        while(start<=end){
            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
