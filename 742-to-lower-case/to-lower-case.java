class Solution {
    public String toLowerCase(String s) {

        char []arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char ch:arr)
        {
            if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();  
    }
}