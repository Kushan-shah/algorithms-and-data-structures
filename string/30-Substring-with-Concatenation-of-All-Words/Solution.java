class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> res = new ArrayList<>();

        int n = s.length();
        int m = words.length;
        int k = words[0].length();

        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < k; i++) {

            int left = i, count = 0;
            Map<String, Integer> seen = new HashMap<>();

            for (int right = i; right + k <= n; right += k) {

                String word = s.substring(right, right + k);

                if (map.containsKey(word)) {

                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    while (seen.get(word) > map.get(word)) {

                        String leftWord = s.substring(left, left + k);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += k;
                        count--;
                    }

                    if (count == m) {
                        res.add(left);
                    }

                } else {
                    seen.clear();
                    count = 0;
                    left = right + k;
                }
            }
        }

        return res;
    }
}
