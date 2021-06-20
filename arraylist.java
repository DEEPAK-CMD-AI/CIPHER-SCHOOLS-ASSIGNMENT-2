package sortedarray;
import java.util.Arraylist;
public class arraylist{
	public static int first(ArrayList<int> list, int x)

    {

        // return first occurrence index

        // of element x in ArrayList

        // using method indexOf()

        return list.indexOf(x);

    }
	

    public static int last(ArrayList<int> list, int x)

    {

        // return last occurrence index

        // of element x in ArrayList

        // using method lastIndexOf()

        return list.lastIndexOf(x);

    }

    public static void main(String[] args)

    {

        int arr[] = { 1, 3, 5, 5, 5, 5,7,123,125 };

        ArrayList<int> clist = new ArrayList<int>();
 

        // adding elements of array to ArrayList

        for (int i : arr)

            clist.add(i);

        int x = 7;
 

        // displaying the first occurrence

        System.out.println("First Occurrence = "

                           + arraylistfirst(clist, x));
 

        // displaying the last occurance

        System.out.println("Last Occurrence = "

                           + last(clist, x));

    }

}
