package UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindow extends BaseClass {

	public static void handleWindowOrTab(int windowNumber) {

		Set<String> listWindow = getDriver().getWindowHandles();

		ArrayList<String> arrayList = new ArrayList<String>();

		Iterator<String> it = listWindow.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			arrayList.add(windowId);
		}
		String window = arrayList.get(windowNumber);
		getDriver().switchTo().window(window);
	}

	public static void handleWindowORTab(int windowNumber) {
		Iterator<String> listIt = getDriver().getWindowHandles().iterator();
		ArrayList<String> arrayList = new ArrayList<String>();

		while (listIt.hasNext()) {
			arrayList.add(listIt.next());
		}
		getDriver().switchTo().window(arrayList.get(windowNumber));
	}

}
