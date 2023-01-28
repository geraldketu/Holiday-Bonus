

import java.io.*;
import java.util.*;
import java.lang.*;


public class TwoDimRaggedArrayUtility {
	
	
	
	public static double[][] readFile(File file) throws FileNotFoundException{
		String[][] u = new String[10][10];
		int w = 0;

		Scanner inFile = new Scanner(file);
		
		while (inFile.hasNext()) {
		u[w] = inFile.nextLine().split("\\s");
		w++;
		}
		
		inFile.close();

		double[][] e = new double[w][];
		
		for (int q=0; q<w; q++) {
			
		int k = u[q].length;
		e[q] = new double[k];
		
		for (int c=0; c<k; c++) {
			
		e[q][c] = Double.parseDouble(u[q][c]);
		
		}
		}

		return e;
		
	}
	
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		
		PrintWriter outFile = new PrintWriter(outputFile);

		for (int r=0; r<data.length; r++) {
			
		String nextLine = "";
		
		for (int c=0; c<data[r].length; c++) {
		nextLine= nextLine + data[r][c] + " ";
		
		}
		outFile.println(nextLine);
		}

		outFile.close();
		
	}
	
	public static double getTotal(double [][] data) {
		int t = 0;

		for(int i = 0; i < data.length; i++) {
			
		for(int c = 0; c < data[i].length; c++) {
		t += data[i][c];
		}
		}

		return t;
		}
	
	public static double getAverage(double[][] data) {
		double t = 0;
		double a;
		int d = 0;

		for(int i = 0; i < data.length; i++) {
			
		for(int j = 0; j < data[i].length; j++) {
			
		t += data[i][j];
		d +=1;

		   }
		
		}

		a = (t/d);
		
		return a;

		}
	
	public static double getRowTotal(double [][] data, int row) {
		int t = 0;

		for(int i = 0; i < data[row].length; i++) {
		t += data[row][i];
		}

		return t;
		}
	

	public static double getColumnTotal(double[][] data, int col) {
		double t = 0;

		for(int i = 0; i < data.length; i++) {
			
		if(col <= data[i].length - 1) {
			
		t += data[i][col];
		   }
		
		
		}

		return t;
	}
	
	public static double getHighestInRow(double [][] data, int row) {
		double h = data[row][0];

		for(int i = 0; i < data[row].length; i++) {
			
		if(h < data[row][i]) {
			
		h = data[row][i];
		   }
		
		}
		
		return h;

}
	public static int getHighestInRowIndex(double [][] data, int row) {
		int h = 0;

		for(int i = 0; i < data[row].length; i++) {
			
		if(data[row][i] > data[row][h]) {
		h = i;
				
			 }
		}

		return h;

}
	
	public static double getLowestInRow(double [][] data, int row) {
		double d = data[row][0];

		for(int i = 0; i < data[row].length; i++) {
		
		if(d > data[row][i]) {
		d = data[row][i];
		
			}
		
		}
		
		return d;
}

		
	public static int getLowestInRowIndex(double [][] data, int row) {
		int l = 0;

		for(int i = 0; i < data[row].length; i++) {
			
		if(data[row][i] < data[row][l]) {
			
		l = i;
			
			}
		
		}

		return l;
}
	
	public static double getHighestInColumn(double[][] data, int c){
		double h = data[0][c];

		for(int i = 0; i < data.length; i++) {
			
		if(c <= data[i].length - 1) {
			
		if(h < data[i][c]) {
			
		h = data[i][c];
			
		        }
		
		    }
		}

		
		return h;


}
	public static int getHighestInColumnIndex(double[][] data, int col){
		int h = 0;

		for(int i = 0; i < data.length; i++) {
			
				if(col < data[i].length) {
			
						if(data[i][col] > data[h][col]) {
			
							h = i;
		        }
		    
			}
		
		}

		return h;
		
}
	
	public static double getLowestInColumn(double [][] data, int col) {
		double l = data[0][col];

		for(int i = 0; i < data.length; i++) {
			
				if(col <= data[i].length - 1) {
			
						if(l > data[i][col]) {
			
							l = data[i][col];
				}
			}
		}
		
		return l;
}

		
		
public static int getLowestInColumnIndex(double [][] data, int col) {
		int l = 0;

		for(int i = 0; i < data.length; i++) {
			
			if(col < data[i].length) {
			
					if(data[i][col] < data[l][col]) {
						l = i;
		
				}
			}
		}

		return l;
}

	public static double getHighestInArray(double[][] data){
		double h = data[0][0];

		for(int i = 0; i < data.length; i++) {
			
			for(int k = 0; k < data.length; k++) {
			
			if(h < data[i][k]) {
		
				h = data[i][k];
				}
			}
		}

		return h;

	}
	
	public static double getLowestInArray(double [][] data) {
		double l = data[0][0];

		for(int i = 0; i < data.length; i++) {
			
			for(int j = 0; j < data.length; j++) {
			
				if(l > data[i][j]) {
					l = data[i][j];
						}
					}
				
				}
		
		
		return l;
}

		

		

		

		

		

		

		

		






	

}
