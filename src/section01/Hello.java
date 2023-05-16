package section01;
/* 한줄 주석
*
*
*
*
*/

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");

		printNum(516);
	}

	/**
	 * JavaDoc 주석
	 *
	 * 입력받은 정수 출력하는 메소드
	 * 
	 * @param num - 입력받은 정수
	 *
	 */
	public static void printNum(int num) {
		System.out.println("num: " + num);
	}
}