class Solution {
    public int romanToInt(String s) {
        // 1. Initialize the map (using a Map since 'mp' isn't a primitive in Java)
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // 2. Use .charAt() and add a boundary check for i + 1
            if (i < n - 1 && mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))) {
                ans -= mp.get(s.charAt(i));
            } else {
                ans += mp.get(s.charAt(i));
            }
        }
        return ans;
    }
}