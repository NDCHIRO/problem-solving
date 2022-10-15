
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int h = S.nextInt();
        int count=0;
        int[] arr=new int[2001];
        for(int i=0;i<n;i++) {
            arr[i] = S.nextInt();
            if(arr[i]>h)
                count+=2;
            else
                count++;
        }
        System.out.println(count);
    }
}
