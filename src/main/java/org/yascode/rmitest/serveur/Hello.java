package org.yascode.rmitest.serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	void showMsg() throws RemoteException;
}
