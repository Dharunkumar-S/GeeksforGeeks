//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        String s1,s2,s3;
        List<String> al=new ArrayList();
        s1=S.replaceAll("[^a-zA-Z]","");
        if(s1.length()==0)
            al.add("-1");
        else
            al.add(s1);
        s2=S.replaceAll("[^0-9]","");
        if(s2.length()==0)
            al.add("-1");
        else
            al.add(s2);
        s3=S.replaceAll("[a-zA-Z0-9]","");
        if(s3.length()==0)
            al.add("-1");
        else
            al.add(s3);
        return al;
    }
} 
