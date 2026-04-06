class Solution {

    // Encode list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            encoded.append(s.length()).append("#").append(s);
        }

        return encoded.toString();
    }

    // Decode the string back to list of strings
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract length
            int length = Integer.parseInt(str.substring(i, j));

            // Move pointer after '#'
            j++;

            // Extract the string of given length
            String word = str.substring(j, j + length);
            result.add(word);

            // Move pointer to next segment
            i = j + length;
        }

        return result;
    }
}