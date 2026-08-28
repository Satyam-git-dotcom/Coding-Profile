class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;
        int reversed = 0;
        while(x > reversed){
            reversed = x % 10 + reversed * 10;
            x = x / 10;
        }
        if ((x == reversed) || (x == reversed / 10)) return true;
        else return false;
    }
}