package org.yascode.rmitest.serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpClasse extends UnicastRemoteObject implements Hello {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9023818513796774392L;

	protected ImpClasse() throws RemoteException {
		super();
	}

	public void showMsg() {
		System.out.println("Hello World!");
	}
}
