package JavaStudy;

public class LogicalOperatorExam2 {
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		//�� �Ʒ� ���� �����ϼ���.
		if( age>=20&&age<30 ) {
			isTwenties = true;
		}
		else{
			isTwenties = false;
		}
    
    return isTwenties;//��� �׽�Ʈ�� ���� �ڵ��Դϴ�.
	}
}