package view;

import controller.ThreadId;

public class Principal {
	
	public static void main(String[] args) {
		
		for(int idThread = 0; idThread < 5; idThread++) {
			Thread tid = new ThreadId(idThread);
			tid.start();
		}

	}

}