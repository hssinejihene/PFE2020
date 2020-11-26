# First Algorithm (Algo1.java):
Write a function:
class Solution { public int[] solution(int N, int[] A); }
For example, given:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2].

Assume that: 
N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].

Complexity:
O(N+M)

# Second Algorithm(Algo2.java):

Write a function:
class Solution { public int[] solution(int[] A, int[] B); }
For example, given L = 5 and:
    A[0] = 4   B[0] = 3
    A[1] = 4   B[1] = 2
    A[2] = 5   B[2] = 4
    A[3] = 5   B[3] = 3
    A[4] = 1   B[4] = 1
the function should return the sequence [5, 1, 8, 0, 1].

Assume that:

L is an integer within the range [1..50,000];
each element of array A is an integer within the range [1..L];
each element of array B is an integer within the range [1..30].

Complexity:
O(L)


# Third Algorithm(Algo3.java):
Write a function:
class Solution { public int solution(int[] A); }


For example, given array:
A[0] = 1
A[1] = 5 
A[2] = 2
A[3] =-2
your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.

Assume that:
N is an integer within the range [0..20,000];
each element of array A is an integer within the range [−100..100].


Complexity:
O(N*max(abs(A))2)
