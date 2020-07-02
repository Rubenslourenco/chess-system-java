package boardgame;

public class BoardExpetion extends RuntimeException {
		private static final long serialVersionUID = 1L;
		
		//construtor que recebe a mensagem
		public BoardExpetion (String msg) {
			super(msg); // vai passar a mensagem para superclass
		}

}
