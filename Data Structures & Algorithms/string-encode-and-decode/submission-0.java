class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str: strs){
          sb.append(str.length()).append("#").append(str);
        }
        return sb.toString(); //"5#Hello5#World"
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j)); // have length 5
            i = j+1;
            j = len + i;
            list.add(str.substring(i,j));
            i = j;
        }

        return list;

    }
}
