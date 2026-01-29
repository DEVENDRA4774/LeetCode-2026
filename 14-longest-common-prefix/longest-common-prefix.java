class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. Sort the array alphabetically
        Arrays.sort(strs);
        
        // 2. Get the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // 3. Compare characters until they don't match
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // 4. Return the matching part
        return first.substring(0, i);
    }
}