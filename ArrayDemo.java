public class ArrayDemo{
	public static void main (String[] args) {
	// Array Declaration 
	double[] MyList1; // java way
	double myList2[]; // c++ way

	// Array Instantiations
	// <datatype>[] <arrayName> = new <dataType>[<size>];
	int[] ages = new int[100];

	//Array Instatiation and Initialization
	double[] myList = {1.4, 5.3, 6.3, 1.0, 5.4, 7.3, 4.3, 7.0, 9.2, 5.4};
	String[] names = {"Luke", "Jessica"};

	//Display specific elements
	System.out.println("1st element = " + myList[0]);
	System.out.println("4th element = " + myList[3]);
	System.out.println("Last element = " + myList[9]);

	// Access size of of an array: <arrayName>.length
	System.out.println("\nArry length = " + myList.length);
	System.out.println("Last element = " + myList[myList.length-1]);

	// Updating value of elements
	myList[4] = 2.0;
	myList[6] = 3.0;
	myList[8] = 4.0;

	// Print All Elements of the array
	System.out.println("\nusing for-loop: ");
	for (int i = 0; i < myList.length; i++){
		System.out.println(myList[i]);
	}

	// Print all elements using enhanced for loop
	System.out.println("\nusing enhance for-loop: ");
	for (double element : myList){
		System.out.println(element);
	}
	}
}
