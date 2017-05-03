package exceptions;

public class ListSizeOverflownException extends RuntimeException {

	public ListSizeOverflownException(String msg)  {
		super("[Excepcion]: " + msg);
	}
}
