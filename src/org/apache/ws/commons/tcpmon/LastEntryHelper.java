package org.apache.ws.commons.tcpmon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LastEntryHelper {
	static String fileName = "tcpmon.data";

	public static UserEntry getLastEntry() {
		FileInputStream fis = null;
		ArrayList entries = new ArrayList();

		try {
			fis = new FileInputStream(fileName);
			ObjectInputStream is = new ObjectInputStream(fis);
			// Read the number of entries
			int numberOfentries = is.readInt();
			if (numberOfentries > 0) {
				for (int i = 1; i <= numberOfentries; i++) {
					Object data = is.readObject();
					// Cast the object to an Employee type
					UserEntry entry = (UserEntry) data;
					System.out.println(entry);
					entries.add(entry);
				}
			}
			is.close();
			return (UserEntry) entries.get(0);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void writeEntry(int lport, String targetHost, int targetport) {
		UserEntry ue = new UserEntry();
		ue.setListenPort(lport);
		ue.setTargetHost(targetHost);
		ue.setTargetPort(targetport);
		writeEntry(ue);
	}

	public static void writeEntry(UserEntry entry) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileName);

			ObjectOutputStream os = new ObjectOutputStream(fos);
			int numberOfentries = 1;
			os.writeInt(numberOfentries);
			os.writeObject(entry);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
