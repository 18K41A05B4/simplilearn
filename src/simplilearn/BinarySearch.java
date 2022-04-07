package simplilearn;
import java.util.*;
public class BinarySearch {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int arrlength = arr.length-1;
        for(int i=0;i<arrlength;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key element");
        int key=sc.nextInt();
        binarySearch(arr,0,key,arrlength);
    }
    public static void binarySearch(int[] arr, int start, int key, int length){
        int midValue = (start+length)/2;
        while(start<=length){
            int m = arr[midValue];
            System.out.println(m);
            if(m<key){
                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {
                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
        if(start>length){
            System.out.println("Element is not found");
        }
    }
}

