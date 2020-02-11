class Solution {
    public String convert(String s, int numRows) {
        char[] str = s.toCharArray();
        String[] arr = new String[numRows];
        Arrays.fill(arr,"");
        String result="";
        if(numRows==1){
            return s;
        }
        int row = 0;
        boolean down = true;
        int len = s.length();
        for(int i =0 ; i<len; i++){
            arr[row] += str[i];
            if(row == numRows-1){
                down =false;
            }else if(row==0){
                down = true;
            }
            
            if(down){
                row++;
            }else{
                row--;
            }

        }
        for(String c : arr){
            result +=c;
        }
        return result;
    }
}