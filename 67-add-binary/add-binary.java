class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop while there are digits left in a or b, or there is a lingering carry
        while (i >= 0 || j >= 0 || carry == 1) {
            
            // Add digit from 'a' if available
            if (i >= 0) {
                // '1' - '0' converts the char to integer 1
                carry += a.charAt(i--) - '0'; 
            }
            
            // Add digit from 'b' if available
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            
            // Append the result digit (carry % 2)
            // 0 -> 0, 1 -> 1, 2 -> 0, 3 -> 1
            sb.append(carry % 2);
            
            // Update carry for the next position
            // 0 or 1 -> 0; 2 or 3 -> 1
            carry /= 2;
        }
        
        // Since we appended numbers from the end, reverse the result
        return sb.reverse().toString();
    }
}