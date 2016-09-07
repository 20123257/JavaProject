package JavaStudy;

public class ConditionalExam2 {
	public int conditionTest(int value){
	    //변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
	    int ret=0;
			if( value % 3 ==0 ){
				ret = 3;
			}//이 아래줄에 else구문을 추가해서 코드를 완성하세요.
	    else if (value%4==0){
	      ret = 4;
	    }
	    
	    return ret;//결과 체크를 위한 코드입니다.
	}
}

