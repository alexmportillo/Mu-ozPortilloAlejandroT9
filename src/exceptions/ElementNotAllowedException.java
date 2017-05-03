package exceptions;

@SuppressWarnings("serial")

	public class ElementNotAllowedException extends RuntimeException {

		public ElementNotAllowedException(String msg)  {
			super("[Excepcion]: " + msg);
		}
	}

