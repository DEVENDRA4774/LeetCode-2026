class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Since the input consists of valid ASCII characters, 
        // an array of size 256 covers all possibilities.
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // If the last seen positions of these two characters 
            // don't match, the mapping is inconsistent.
            if (mapS[charS] != mapT[charT]) {
                return false;
            }
            
            // Update the "last seen" position. 
            // We use i + 1 because the default value in the array is 0.
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }
        
        return true;
    }
}