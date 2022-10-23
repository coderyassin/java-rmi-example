package org.yascode.rmitest.client;

import java.rmi.Naming;

public class Client {

private Client() {}
	
	public static void main(String[] args) {
		try {

			org.yascode.rmitest.serveur.Hello impClasse = (org.yascode.rmitest.serveur.Hello) Naming
					.lookup("rmi://localhost:1000/ic");
			impClasse.showMsg();

		} catch (Exception e) {

			System.err.println(e.toString());

			e.printStackTrace();

		}
	}

}
