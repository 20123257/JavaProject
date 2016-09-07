package JavaStudy;

public class BubbleSort { 
	// logic to sort the elements   
	public static void bubble_sort(int array[]) {   
		int length = array.length;
		int j;
		for (int l = length; l >= 0; l--) {
			for (int i = 0; i < length - 1; i++) {  
				j = i + 1;   
				if (array[i] > array[j]) {  
					swap(i, j, array); 
					}       
				}    
			printNumbers(array);
			}     
		}   
	private static void swap(int i, int j, int[] array) {   
		int temp;   
		temp = array[i];     
		array[i] = array[j];  
		array[j] = temp;  
		}    
	private static void printNumbers(int[] input) {       
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
			}   
		System.out.println("\n");   
		}  
	public static void main(String[] args) {
		int[] input = { 7, 37, 10, 6, 50, 12, 34, 0, 1 };    
			bubble_sort(input);  
		}
}