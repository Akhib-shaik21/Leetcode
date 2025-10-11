class Solution {
    public String reverseWords(String s) {
        String [] srr=s.split(" ");
        StringBuilder result =new StringBuilder();
        for(String arr:srr)
        {
            StringBuilder sb=new StringBuilder(arr);
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
             result.append(sb).append(" ");
        }
        return result.toString().trim();
    }
}