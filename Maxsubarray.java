package Array;

import java.util.*;
public class printsubarray {
    public static void printsubarraySum(int numbers[]){
        int CurrSum =0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                CurrSum =0;
                for(int k=start; k<=end; k++){
                     //subarray
                     CurrSum += numbers[k];
                }
                 System.out.println(CurrSum);
                if(maxSum < CurrSum){
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum =" + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        printsubarraySum(numbers);
    }
}
