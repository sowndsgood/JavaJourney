import java.util.*;

public class FirstLast {  
        public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,2,13,17,19};
        int target = 2;
        System.out.println(Arrays.toString((range(arr,target))));
    }
    public static int[] range(int[] arr,int target)
    {
        int[] range ={-1,-1};
        range[0] = find(arr,target,true);
        if(range[0]!=-1)
        {
            range[1] = find(arr,target,false);
        }
        return range;
    }
    public static int find(int[] arr,int target,boolean b)
    {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        
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
                ans = mid;
                if(b)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
                
            }
        }

        return ans;
    }
    
}
