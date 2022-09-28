Question 1: Crazy series (50 points)
In this session, you need to implement the crazy series method. In the crazy series, you will be given a starting number. Then, you need to subtract 3 for each number until we reach a negative number. After we reach a negative number, you need to add 3 until we reach the starting number. Note that the input number must be greater than 0.
For example,
crazySeries(5) should return ArrayList [5, 2, -1, 2, 5]
crazySeries(9) should return ArrayList [9, 6, 3, 0, -3, 0, 3, 6, 9]
Question 2: Ben number (50 points)
Ben has difficulty coming out with an assignment question, then he created a weird number called Ben number which is the sum of a Ben series. Given a starting number, in the Ben series, the number should double at even index, whereas the number should be added 1 at odd index (Assuming the index starting from 1).
Example of a Ben series,
Assume the starting number = 5, and total numbers are 6, then the series should be
[6, 12, 13, 26, 27, 54]. Then the Ben number should be 138 because of 6+12+13+26+27+54.
Thus, given the method benNumber(m,n), for all m, n > 0
benNumber(2,5) should return 45 because 3+6+7+14+15 =45
benNumber(3,8) should return 213 because 4+8+9+18+19+38+39+78 =213
benNumber(1,1) should return 2
Note that you can only use recursion to solve these methods, and you cannot use any loop. You are free to add new methods or any parameters.
