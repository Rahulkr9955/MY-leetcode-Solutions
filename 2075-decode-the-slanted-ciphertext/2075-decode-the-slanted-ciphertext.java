class Solution {
    public String decodeCiphertext(String encodedText, int rows) {

        int cols = encodedText.length() / rows;

        StringBuilder ans = new StringBuilder();

        for (int c = 0; c < cols; c++) {

            int r = 0;
            int j = c;

            while (r < rows && j < cols) {

                ans.append(encodedText.charAt(r * cols + j));

                r++;
                j++;
            }
        }

        // Remove trailing spaces
        while (ans.length() > 0 &&
               ans.charAt(ans.length() - 1) == ' ') {
            ans.deleteCharAt(ans.length() - 1);
        }

        return ans.toString();
    }
}