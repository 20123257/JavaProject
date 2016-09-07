package JavaStudy;

public class LinearSearch { 
	public static int linerSearch(int[] array, int number){ 
		int size = array.length; 
		for(int i=0;i<size;i++){ 
			if(array[i] == number){ 
				return i; }
			}
		return -1;
		}
	public static void main(String a[]){
		int[] array1= {73,82,19,827,69,43,93,90};
		int number = 43;
		System.out.println("KeyNumber "+number+" found at index: "+linerSearch(array1, number));
		int[] array2= {498,421,239,595,2397,29,23,8239}; 
		number = 239;
		System.out.println("KeyNumber "+number+" found at index: "+linerSearch(array2, number));
		}
	}
