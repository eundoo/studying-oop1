package day3;

public class StaitcMethodSampleApp {
		public static void main(String[] args) {
			//멤버변수, 멤버메소드 실행 <--- 객체의 생성이 반드시 선행되어야 한다.
			StaticMethodSample sample = new StaticMethodSample();
			sample.x = 100;
			sample.y = 400;
			
			
			sample.plus();
			sample.minus();
			sample.calculate();
			sample.calculate2();
		}
}
