class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] ch = s.toCharArray();
        int num = map.get(ch[ch.length - 1]);
        for (int i = ch.length - 2; i >= 0; i--) {
            if (map.get(ch[i]) >= map.get(ch[i + 1]))
                num += map.get(ch[i]);
            else
                num -= map.get(ch[i]);
        }
        return num;
    }
}