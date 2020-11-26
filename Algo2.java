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
public class Algo2 {
     public int[] solution(int[] A, int[] B) {
		 //L= A.length
        int[] cn = new int[A.length];
        int a = 0;
        int b = 1;
        int maxModulo = (int) Math.pow(2, 30);
        for (int i = 0; i < A.length; i++) {
            int x = (a + b) % maxModulo;
            cn[i] = x;
            a = b;
            b = x;
        }
        
        int[] result = new int[A.length];
        int[] modulo = new int[B.length];
        
        for (int i = 0; i < B.length; i++) {
            modulo[i] = (int) Math.pow(2, B[i]);
        }
        
        for (int i = 0; i < A.length; i++) {
            result[i] = cn[A[i] - 1] % modulo[i];
        }
        
        return result;
    }
    
}


//Complexity is O(L)