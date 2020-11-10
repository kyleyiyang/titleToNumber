class Solution {
    public int titleToNumber(String s) {
        int n=0;
        for (int i=s.length()-1;i>=0;i--) {
            n+=Math.pow(26,(s.length()-i-1))*(s.charAt(i)-'A'+1);
        }
        return n;
    }
}
