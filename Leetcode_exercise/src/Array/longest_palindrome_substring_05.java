package Array;

public class longest_palindrome_substring_05 {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String res = "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = palindromeLen(s, i, i);
            int len2 = palindromeLen(s, i, i + 1);
            int paliLen = len1 > len2 ? len1 : len2;
            if (paliLen > end - start)
            {
                start = i - (paliLen - 1) / 2;
                end = i + paliLen/2;

            }
        }
        return s.substring(start, end + 1);
    }



    public int palindromeLen(String s, int left, int right) {
        int length = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        length = right - left - 1;
        return length;
    }
}
