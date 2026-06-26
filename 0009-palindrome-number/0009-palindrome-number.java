class Solution {
    public boolean isPalindrome(int n) {

        if(n < 0 || ((n % 10 == 0) && (n != 0)) ) return false;

        int dupNumber = n;
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }

        if(dupNumber == reversed) return true;
        return false;
    }
}