package JavaStudy;

public class ConditionalExam2 {
	public int conditionTest(int value){
	    //���� value�� ����Ǿ� �ִٰ� �����ϰ� �Ʒ��� �ڵ带 �ۼ��ϼ���.
	    int ret=0;
			if( value % 3 ==0 ){
				ret = 3;
			}//�� �Ʒ��ٿ� else������ �߰��ؼ� �ڵ带 �ϼ��ϼ���.
	    else if (value%4==0){
	      ret = 4;
	    }
	    
	    return ret;//��� üũ�� ���� �ڵ��Դϴ�.
	}
}

