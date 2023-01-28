
public class HolidayBonus {
	static double high = 5000;
    static double low = 1000;
    static double another = 2000;
    
    
    public static double[] calculateHolidayBonus(double[][] data) {
    	double[] r = new double[data.length];

    	for (int row=0; row<data.length; row++) {
    		double b = 0.0;
    			
    		for (int col=0; col<data[row].length; col++) {
    				
    			if (0 >= data[row][col]) {
    					b += 0.0;
    			} 
    			
    			else if(row == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col)) {
    				b += low;
    			
    			}
    			else if (row == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col)) {
    				b += high;
    			
    			} 
    			else {
    				b += another;
    			
    			}
    		
    		}

    		r[row] = b;
}

    	return r;
}

    	public static double calculateTotalHolidayBonus(double[][] data) {
    			double t = 0;

    			double[] b = calculateHolidayBonus(data);
    			
    			for (int i=0; i<b.length; i++) {
    				t += b[i];
    			}

    			return t;

    	
    	}
	

}
