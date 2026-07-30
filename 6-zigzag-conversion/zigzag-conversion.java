class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 ||s.length()<=numRows)return s;
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)rows[i]=new StringBuilder();

        int curRows=0;
        boolean goingdown=false;

        for(char c : s.toCharArray()){
            rows[curRows].append(c);
            if(curRows==0||curRows==numRows-1)goingdown=!goingdown;
            curRows+=goingdown?1:-1;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);
        }

        return result.toString();


        
    }
}