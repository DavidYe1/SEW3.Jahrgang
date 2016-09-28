import java.util.Iterator;

/**
 * Das vierte Beispiel des ersten Tests.
 * @author Johann Weiser
 *
 */
public class AutoTransport implements Iterable<Auto> {

	private Auto[] aList;
	private int nextFree;
	
	public AutoTransport(Auto a1, Auto a2, Auto a3) {
		aList = new Auto[3];
		nextFree = 0;
		if (a1 != null) {
			aList[nextFree++] = a1;
		}
		if (a2 != null) {
			aList[nextFree++] = a2;
		}
		if (a3 != null) {
			aList[nextFree++] = a3;
		}
	}
	
	private class MyIterator implements IteratorExtended<Auto> {
		private int nextElem;
		private int lastReturned;
		
		MyIterator() {
			nextElem = 0;
			lastReturned = -1;
		}
		
		@Override
		public boolean hasNext() {
			return nextElem < nextFree;
		}

		@Override
		public Auto next() {
			if (!hasNext()) {
				throw new IllegalStateException("No more elements exist.");
			}
			lastReturned = nextElem;
			return aList[nextElem++];
		}

		@Override
		public void replace(Auto e) {
			if ((lastReturned < 0) || (lastReturned >= nextFree)) {
				throw new IllegalStateException("Nothing returned.");
			}
			aList[lastReturned] = e;
		}

		/**
		 * F�gt ein Element nach dem zuletzt zur�ck gegebenen Element ein.
		 * Wurde noch kein Element zur�ck gegeben, dann wird das Element am Beginn der Liste eingef�gt.
		 */
		@Override
		public void insertAfter(Auto e) {
			if (nextFree > 2) {
				throw new IllegalStateException("Transport full.");
			}
			for (int i = nextFree; i>lastReturned+1; i--) {
				aList[i] = aList[i-1];
			}
			aList[lastReturned+1] = e;
			nextFree++;
		}
	}
	
	/**
	 * Gibt ein Objekt, welches IteratorExtended implementiert zur�ck. 
	 * Da IteratorExtended eine Erweiterung des Interfaces Iterator ist, wird auch das
	 * Erfordernis von Interface Iterable erf�llt!!!
	 */
	@Override
	public IteratorExtended<Auto> iterator() {
		return new MyIterator();
	}
	
	/**
	 * F�gt eine Leerzeile am Ende der Liste ein.
	 * In der for-each Schleife wird implizit next und hasnext aufgerufen!
	 */
	public String toString(){
		String s = null;
		for (Auto a:this) {
			if (s == null) {
				// Die toString-Methode von a wird implizit aufgerufen.
				s = "Autos im Transporter: \n   "+ a;
			} else {
				s = s + "\n   " + a;
			}
		}
		return s+"\n";
	}
}

