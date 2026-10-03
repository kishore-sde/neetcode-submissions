class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char sChar: s.toCharArray()){

            if(map.containsKey(sChar)){
                map.replace(sChar,map.get(sChar)+1);
            } else {
                map.put(sChar,1);
            }
        }

        for(char tChar: t.toCharArray()){

            if(map.containsKey(tChar)){
                map.replace(tChar, map.get(tChar)-1);
            } else {
                map.put(tChar,1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() > 0){
                return false;
            }
        }

        return true;
    }
}
