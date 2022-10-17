public class TwoDArray{
	public static void main(String[] args){
		// Instantiation of 2D Array
		int [][] twoD = new int[3][9]; // 3 x 9 = 27 elements

		// instantiation of 3D Array
		float[][][] threeD = new float[5][10][2]; // 5 x 10 x 2 = 100 elements

		// 2D Array Instantiation and Intialization
	String[][] dogs ={
			{"Snoopy", "Pluto"},
			{"Goofy", "Scooby"},
			{"Peabody","Jake"},
			{"Courage" , "Max"}
		};
			
		// Display specific elements of the 2D Array
			System.out.println("\ndogs[0][0] =" + dogs[0][0]);
			System.out.println("\ndogs[1][1] =" + dogs[1][1]);
			System.out.println("\ndogs[2][1] =" + dogs[2][1]);
			System.out.println("\ndogs[3][0] =" + dogs[3][0]);

		// Display 2D Array using nested for loop
			System.out.println("\nusing nested for-loop");
		for (int row = 0; row < dogs.length; row++) {
			for (int col = 0; col < dogs[row].length; col++) {
				System.out.printf("%-9s", dogs[row][col]);
				
			}
			System.out.println();
		}
		// Update the value of the elements of the 2D Array
		dogs[1][1] = "Scrappy";
		dogs[3][1] = "Bolt";
		dogs[3][0] = "Bantay";

		// Display 2D Array using enhanced for loop
		for (String[] row: dogs) {
			for(String element : row){
				System.out.printf("%-9s", element);
			}
			System.out.println();
			
		}
	}
}
