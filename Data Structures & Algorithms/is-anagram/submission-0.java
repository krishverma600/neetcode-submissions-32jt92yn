class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();

        for (char i : s.toCharArray()) {
            hs1.put(i, hs1.getOrDefault(i, 0) + 1);
        }

        for (char i : t.toCharArray()) {
            hs2.put(i, hs2.getOrDefault(i, 0) + 1);
        }

        return hs1.equals(hs2);
    }
}