class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedKey = new String(ch);
            map.putIfAbsent(sortedKey,new LinkedList<>());
            map.get(sortedKey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}