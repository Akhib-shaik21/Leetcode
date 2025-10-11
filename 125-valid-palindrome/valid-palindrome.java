class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        
        String rev=sb.reverse().toString();
        if(rev.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}