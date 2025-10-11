class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        int low=0;
        int high=sb.length()-1;
        while(low<high)
        {
            char temp=sb.charAt(low);
            sb.setCharAt(low,sb.charAt(high));
            sb.setCharAt(high,temp);
            low++;
            high--;
        }
        String rev=sb.toString();
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