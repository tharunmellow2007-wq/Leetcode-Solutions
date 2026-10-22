class Solution {
    public int minOperations(String s) {
        int min = 2;
        int n = s.length();
        if(n == 1) return 0;
        boolean sorted = true;
        char minc = s.charAt(0), maxc = s.charAt(0), prev = s.charAt(0);
        int minCount = 0, maxCount = 0;
        for(int i=1; i<n; i++) {
            if(s.charAt(i) < prev) sorted = false;
            if(s.charAt(i) < minc) {
                minc = s.charAt(i); 
            }
            if(s.charAt(i) > maxc) {
                maxc = s.charAt(i);
            }

            prev = s.charAt(i);
        } 

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == minc) minCount++;
            if(s.charAt(i) == maxc) maxCount++;
        }



        if(sorted) return 0;
        if(minc == s.charAt(0) || maxc == s.charAt(n - 1)) return 1;
        if(maxc == s.charAt(0) && minc == s.charAt(n - 1) && n == 2) return -1;
        if(maxc == s.charAt(0) && minc == s.charAt(n - 1) && minCount == 1 && maxCount == 1) return 3;  
        return 2;
    }
}