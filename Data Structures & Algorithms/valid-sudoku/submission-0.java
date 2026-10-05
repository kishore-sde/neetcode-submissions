class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < 9; i++) {

            for(int j = 0; j < 9; j++){

                char currVal = board[i][j];

                if(currVal != '.'){
                    
                    String row = currVal + "row" + i;
                    String col = currVal + "col" + j;
                    String box = currVal + "box" + (i/3) + "and" + (j/3);
                    map.put(row,map.getOrDefault(row,0) + 1);
                    map.put(col,map.getOrDefault(col,0) + 1);
                    map.put(box,map.getOrDefault(box,0) + 1);

                    if(map.get(row) > 1 || map.get(col) > 1 || map.get(box) > 1){
                        return false;
                    }
                }


            }
        }

        return true;
    }
}
