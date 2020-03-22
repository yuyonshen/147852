package java3_22_1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

            for(;k>0;k--){
                int[][] newgrid=new int[grid.length][grid[0].length];
                for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[0].length-1;j++){
                        newgrid[i][j+1]=grid[i][j];
                    }
                }
                for(int i=0;i<grid.length-1;i++){
                    newgrid[i+1][0]=grid[i+1][grid[0].length];
                }
                newgrid[0][0] = grid[grid.length - 1][grid[0].length - 1];
                grid=newgrid;
            }
            List<List<Integer>> result=new ArrayList<>();
            for(int[] row:grid){
                List<Integer> listRow = new ArrayList<>();
                result.add(listRow);
                for (int v : row)
                    listRow.add(v);
            }
            return result;
    }
}
