import java.util.*;
public class sortbinary{
    public static int binary(int arr[],int k)
    {
        int min=minsearch(arr);
        int left=-1;
        int right=-1;
        if(arr[arr.length-1]>=k)
        {
            left=min;
            right=arr.length-1;

        }
        else{
            left=0;
            right=min;
        }
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static int misearch(int arr[])
    {
        int small=Integer.MIN_VALUE,index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
                index=i;
            }
        }
        // System.out.print(index+" \t");
        return index;
    }
    public static void main(String args[])
    {
        int arr[]={4,5,6,7,8,0,1,2,3};
        int k=3 ;
        int index=binary(arr,k);
        System.out.print(index);
        System.out.print("Bobby is back");
    }

}
