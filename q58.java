class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int end = 0;
        int start = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            } else if (end == 0 && s.charAt(i) != ' ') {
                end = i;

                if (end == 0) {
                    return 1;
                }
            }

            if (i - 1 >= 0) {
                if (s.charAt(i - 1) == ' ') {
                    start = i - 1;
                    break;
                }
            } else {
                return end - start + 1;
            }
        }

        return end - start;
    }
}
