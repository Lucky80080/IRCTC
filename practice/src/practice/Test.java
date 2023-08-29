package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException("something goes worng in calc  ");
		} catch (CustomException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
