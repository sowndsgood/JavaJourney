public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,7,13,15,19,21,100,222,534,657};
        int target = 13;
        System.out.println(find(arr,target));
    }
    public static int find(int[] arr,int target) {
        int start=0;
        int end = 1;

        while(target>arr[end])
        {
            int temp = end + 1;
            end = end + (end - start)*2;
            start = temp;
        }
        return binary(arr,target,start,end);

    }
    public static int binary(int[] arr,int target,int start, int end){
        
    while(start<=end)
        {
            int mid=start + (end - start)/2 ;

            if(target>arr[mid])
            {
                start = mid +1;
            }
            else if(target<arr[mid])
            {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
}
