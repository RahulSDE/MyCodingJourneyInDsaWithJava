package AdvancedSorting.ClassWork;
import java.util.*;
public class InversionCountProblem {
    public static int countInversion(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        int count = countInversion(arr);
        System.out.println(count);
    }
}
