package boardgame;

public class BoardException extends RuntimeException {
		private static final long serialVersionUID = 1L;
		
		//construtor que recebe a mensagem
		public BoardException (String msg) {
			super(msg); // vai passar a mensagem para superclass
		}

}
