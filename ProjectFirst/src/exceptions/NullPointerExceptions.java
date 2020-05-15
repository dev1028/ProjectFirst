package exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "hello";
		
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		}catch(NullPointerException e) {
			System.out.println("실행 중 오류 발생.");
		}catch(ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
			
		}catch(Exception e) {
			
		}
		
		System.out.println("프로그램 정상 종료.");
	}
}
