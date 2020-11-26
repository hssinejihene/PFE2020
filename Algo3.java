/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe2021;

/**
 *
 * @author jihen
 */
public class Algo3 {
    public int solution(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // O(N)
        for (int i = 0; i < a.length; i++) {
            final int value = Math.abs(a[i]);
            sum += value;
            if (max < value) {
                max = value;
            }
            a[i] = value;
        }
       
        // O(N)
        final int[] counts = new int[max + 1];
        for (int value: a) {
            counts[value]++;
        }
        // O(sum(abs(a)))
        final int[] b = new int[sum + 1];
        for (int i = 1; i < b.length; i++) {
            b[i] = -1;
        }
        
        for (int i = 1; i < counts.length; i++) {
            //  if b[j] it's not less than 0, then it means we've reached j value with previous steps
            // if it's less than 0, spend 1 current number if b[j - i] has been reached
            for (int j = 0; j < b.length; j++) {
                
                if (b[j] >= 0) {
                    b[j] = counts[i];
                } else if (j - i >= 0 && b[j - i] > 0) {
                    b[j] = b[j - i] - 1;
                }
               
            }
        }
        int result = sum;
        
        for (int i = 0; i < b.length / 2 + 1; i++) {
            if (b[i] >= 0 && result > Math.abs(sum - 2 * i)) {
                result = Math.abs(sum - 2 * i);
            }
        }
        return result;
    }
    
}


//complexity is O(N*max(abs(A))2)