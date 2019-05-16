package exceptionPractice;

public class CustomException extends Exception {
	private String message;

	public CustomException(String message) {
		this.message = message;

	}

	public String toString() {
		return "message is : " + message;
	}

}
