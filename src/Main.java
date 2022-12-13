public class Main {

    public String reverseWords(String s) {
        int end = s.length() - 1;
        StringBuilder newString = new StringBuilder();
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            newString.append(s.substring(start + 1, end + 1));
            newString.append(' ');
            end = start - 1;
        }
        if (newString.charAt(newString.length() - 1) == ' ') {
            newString.deleteCharAt(newString.length() - 1);
        }
        return newString.toString();
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length()) {
                newWord.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                newWord.append(word2.charAt(i));
            }
        }
        return newWord.toString();
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k += 1;
            }
        }
        return k;
    }

    public boolean isPalindrome(String s) {
        boolean check = true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                check = false;
            }
            left++;
            right--;
        }
        return check;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int copy = nums1.length - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[copy] = nums1[m];
                copy--;
                m--;
            }
            else {
                nums1[copy] = nums2[n];
                copy--;
                n--;
            }
        }
        while (n >= 0) {
            nums1[copy] = nums2[n];
            copy--;
            n--;
        }
    }
}