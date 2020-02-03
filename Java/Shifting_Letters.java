class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        
        char[] s = S.toCharArray();
        for (int i = shifts.length-2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i+1]) % 26;
        }
        for (int i = 0; i < s.length; i++) {
            shifts[i] %= 26;
            s[i] += shifts[i];
            if (s[i] > 'z') {
                s[i] = (char) (s[i] - 'z' + 'a' - 1);
            }
        }
        return new String(s);
}
}