class Solution {
    public int orangesRotting(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)dfs(i,j,grid,2);
            }
        }
        int minutes=2;
           for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)return -1;
                minutes=Math.max(minutes,grid[i][j]);
            }
        }
        return minutes-2;
        
        
    }
    void dfs(int i,int j,int[][] grid,int minutes){
        if(i<0||i>=grid.length)return;
        if(j<0||j>=grid[0].length)return;   
        if(grid[i][j]==0)return;
        if(grid[i][j]>1 && grid[i][j]<minutes)return;

        grid[i][j]=minutes;
        dfs(i+1,j,grid,minutes+1);
        dfs(i-1,j,grid,minutes+1);
        dfs(i,j+1,grid,minutes+1);
        dfs(i,j-1,grid,minutes+1);

    }
}