package Arrays.OneDimensional;

public class Questions
{
    public static void main(String[] args) {
        int[] arr={1,4,55,78,2};
        int target=55;
        int ans=SearchElement(arr,target);
        if (ans==1)
        {
            System.out.println("Target "+target +" found");
        }
        else
        {
            System.out.println("Target "+target +" not found");

        }

        FindMaximum(arr);
        ReverseArray(arr);
        SumofArray(arr);
    }
    public static int SearchElement(int[] arr,int target)
    {
        for(int i:arr)
        {
            if (i==target) {
                return 1;
            }
        }
        return 0;
    }

    //Finding the maximum element of the array
    public static void FindMaximum(int[] arr)
    {
        int maxi=arr[0];
        for (int i:arr)
        {
            maxi=Math.max(maxi,i);
        }
        System.out.println("Maximum Element in the array is: "+maxi);
    }

    //Reverse the array

    public static void ReverseArray(int [] arr)
    {
       for (int i= arr.length-1;i>=0;i--)
       {
           System.out.println(arr[i]);
       }
    }

    //SUm of Array
    public static void SumofArray(int []arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
//            sum=sum+arr[i];
            sum+=arr[i];
        }
        System.out.println("The sum of all the elements are: "+sum);
    }
}
