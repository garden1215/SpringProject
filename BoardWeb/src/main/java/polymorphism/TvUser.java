package polymorphism;

public class TvUser {
	public static void main(String[] args) {
	
		//BeanFactor를 이용:beaName을 args로 입력받아 클라이언트 소스 수정없이 실행객체 변경가능 
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
	}
}


		
	/*
		//묵시적 형변환을 통한 객체 참조(interface 상속) : 참조하는 객체만 변경하면 되므로 객체 쉽게 교체 가 
		TV tv = new SamsungTV();
		tv.powerOff();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
	*/
	
	/*
		// 명시적 형변환을 통한객체 참조 
		LgTv tv = new LgTv();
		tv.powerOff();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
	 */
		 

