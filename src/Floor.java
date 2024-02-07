public class Floor {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,7,13,15,19};
        int target = 12;
        System.out.println(Floor(arr,target));
    }
    public static int Floor(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
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
                return arr[mid];
            }
        }

        return start< arr.length ? arr[end] : -1;
    }

    
}
