package JavaStudy;

public class StaticExam{
	public static void main(String []args){
		Car3 taxi = new Car3();
		Car3 suv = new Car3();

		taxi.wheelCount = 10;
		suv.wheelCount = 4;

		System.out.println("taxi�� ������:"+ taxi.wheelCount);
		System.out.println("suv�� ������:"+ suv.wheelCount);
	}
}