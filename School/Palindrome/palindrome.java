//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends




//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int num=n,r_num=0;
        while(num>0) {
            r_num=r_num*10+num%10;
            num/=10;
        }
        if(n==r_num)
            return "Yes";
        else
            return "No";
    }
}