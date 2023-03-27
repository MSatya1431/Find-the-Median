
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMedian 
{
    public static int median(List<Integer> arr)
    {
        Collections.sort(arr);
        int n=arr.size();
        int m;
        if(n%2==1)
            m=arr.get(n/2);
        else
            m=(arr.get(n/2-1)+arr.get(n/2))/2;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        int list=median(arr);
        System.out.println(list);
        sc.close();
    }
}