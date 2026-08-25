class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            i++;
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            for (i = 0; i < map.get(ch); i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}