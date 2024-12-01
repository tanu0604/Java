package Arrays.OneDimensional;

public class Arrays
{
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int z=3;

        //Collection of similar kind of datatype
        //syntax
        // type[] variable_name=new type[size of the array]
        //The array will be stored in the heap memory and the starting address of the array will be stored in the stack memory.

//        int[] arr=new int[10];
//        int[] arr=new int[20]
        //arr[3]=94;
        //arr[7]=49;

        int [] arr={10,20,30,40,50}; //directly initializing

//        for (int i=0;i< arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

        //enhanced for loop
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
