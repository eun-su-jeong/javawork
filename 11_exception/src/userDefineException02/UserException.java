package userDefineException02;

public class UserException extends Exception {
	public UserException() {}
	public UserException(String message) {
		super(message);
	}
}