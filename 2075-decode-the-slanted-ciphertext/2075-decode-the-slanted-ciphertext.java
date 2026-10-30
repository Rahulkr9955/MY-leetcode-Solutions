class Solution {
    public String decodeCiphertext(String encodedText, int rows) {

        int n = encodedText.length();

        if (rows == 1) return encodedText;

        int cols = n / rows;

        StringBuilder ans = new StringBuilder();

        for (int c = 0; c < cols; c++) {

            for (int i = 0; i < rows && c + i < cols; i++) {

                ans.append(encodedText.charAt(i * cols + c + i));
            }
        }

        // Remove trailing spaces
        int len = ans.length();

        while (len > 0 && ans.charAt(len - 1) == ' ') {
            len--;
        }

        return ans.substring(0, len);
    }
}