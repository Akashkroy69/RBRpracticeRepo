package exceptionPractice;

public class TestException {
	public static void main(String[] args) throws CustomException {

		try {
			throw new CustomException("custom exception");
		} catch (CustomException e) {
			System.out.println(e.toString());
		}

		//throw new CustomException("this is from user defined exception.");   <----- this is not working I was trying as in ravi sir video it was told to try.
	}

}
