package org.yascode.rmitest.serveur;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIregistry extends ImpClasse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2925313384566355292L;

	public RMIregistry() throws RemoteException {
	}

	public static void main(String[] args) {
		try {

			LocateRegistry.createRegistry(1000);

			ImpClasse impClasse = new ImpClasse();

			Naming.rebind("rmi://localhost:1000/ic", impClasse);

			System.out.println("Server is ready ...");

		} catch (Exception e) {

			System.err.println(e.toString());

			e.printStackTrace();

		}

	}

}
