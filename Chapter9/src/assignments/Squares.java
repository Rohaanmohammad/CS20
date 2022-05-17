package assignments;



public class Squares {
	public static void main(String[] args) 
	{
		
		
		
		int[] square = {1, 2, 3, 4, 5};


	    for (int i = 0; i < square.length; i++) {
	        square[i] = (int) Math.pow(square[i], 2);
	    }

	    for (int num : square) {
	        System.out.println(num);
	    }
		
		
		
	}
}
