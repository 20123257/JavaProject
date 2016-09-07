package JavaStudy;

public class LogicalOperatorExam2 {
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		//이 아래 줄을 수정하세요.
		if( age>=20&&age<30 ) {
			isTwenties = true;
		}
		else{
			isTwenties = false;
		}
    
    return isTwenties;//결과 테스트를 위한 코드입니다.
	}
}