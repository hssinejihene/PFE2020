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
public class Algo1 {
     public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int maxCounter = 0; 
        int lastResetCounter = 0; 
        for(int i=0; i<A.length; i++) {
            if(A[i] <= N) {
                if(counters[A[i]-1] < lastResetCounter) {
                    counters[A[i]-1] = lastResetCounter; //bring it up to last reset value
                }
                counters[A[i]-1]++;
                //store max counter 
                if(counters[A[i]-1] > maxCounter) {
                    maxCounter = counters[A[i]-1];
                }
            }
            else {
                //keep track of last reset counter
                lastResetCounter = maxCounter;
            }
        }
        
        for(int i=0; i<counters.length; i++) {
            if(counters[i] < lastResetCounter) {
                counters[i]     = lastResetCounter;
            }
        }
        return counters;
    }
}


//Complexity O(N+M)