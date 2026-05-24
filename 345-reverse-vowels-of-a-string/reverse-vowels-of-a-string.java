class Solution {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        String vowels = "aeiouAEIOU";

        while(i < j) {

            if(vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            else if(vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            else {

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}