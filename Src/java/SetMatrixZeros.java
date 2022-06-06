package java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.util.Pair;

public class SetMatrixZeros {

	    public void setZeroes(int[][] matrix) {
	        
	        List<Pair<Integer,Integer>> coordList = new ArrayList<>();
	        for(int row = 0; row < matrix.length; row++){
	            for(int col = 0; col < matrix[0].length; col++){
	               if(matrix[row][col]==0){
	                  coordList.add(new Pair(row,col));
	               }
	            }   
	        }
	        
	        Iterator<Pair<Integer,Integer>> it = coordList.iterator();
	        while(it.hasNext()){
	            Pair<Integer,Integer> pair = it.next();
	            makeRowZero(pair.getKey(), matrix);
	            makeColZero(pair.getValue(), matrix);
	        }
	    }
	    
	    private void makeRowZero(int row, int[][] matrix){
	        for(int col = 0 ; col < matrix[0].length; col++){
	            matrix[row][col] = 0;
	        }
	    }
	    
	    
	    private void makeColZero(int col, int[][] matrix){
	        for(int row = 0 ; row < matrix.length; row++){
	            matrix[row][col] = 0;
	        }
	    }
}
