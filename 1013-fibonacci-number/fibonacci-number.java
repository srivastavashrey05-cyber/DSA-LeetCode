class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int idk2 = 0, idk1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = idk1 + idk2;
            idk2 = idk1;
            idk1 = curr;
        }
        return idk1;
    }
}