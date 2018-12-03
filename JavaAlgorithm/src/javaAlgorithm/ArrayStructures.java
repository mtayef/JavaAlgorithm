package javaAlgorithm;

public class ArrayStructures {
	private int [] theArray = new int[50];
	private int arraySize = 10;
	public static void main(String[] args) {
		ArrayStructures arr = new ArrayStructures();
		arr.generateRandomArray();
		arr.printArray();
		System.out.println(arr.getValueAtIndex(3));
		System.out.println(arr.arrayContainValue(18));
		arr.deleteIndex(4);
		arr.printArray();
		arr.insertValue(55);
		arr.printArray();
		arr.linearSearchForValue(11);
		
	}
	public void generateRandomArray() {
		for(int i = 0; i<arraySize; i++) {
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	public void printArray() {
		System.out.println("--------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| "+ i +" | ");
			System.out.println(theArray[i] + " |" );
			
			System.out.println("--------------");
		}
	}
	
	public int getValueAtIndex(int index) {
		if(index < arraySize) return theArray[index];
		
		return 0;
	}
	
	public boolean arrayContainValue(int searchValue) {
		boolean contain = false;
		for (int i = 0; i < arraySize; i++) {
			if(theArray[i] == searchValue) {
				contain = true;
			}
		}
		return contain;
	}
	public void deleteIndex(int index) {
		if(index < arraySize) {
			for(int i = index; i < (arraySize -1); i++) {
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
	}
	public void insertValue(int value) {
		if(arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}
	public String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexesWithValue = "";
		System.out.println("Value was found in the following: ");
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				System.out.print(i+ " ");
				indexesWithValue += i + " ";
			}
		}
		if (!valueInArray) {
			indexesWithValue = "None";
			System.out.print(indexesWithValue);
		}
		System.out.println();
		
		return indexesWithValue;
	}
}
