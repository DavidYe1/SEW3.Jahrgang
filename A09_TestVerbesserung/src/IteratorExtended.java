import java.util.*;
/**
 * Iterator extended , eine erweiterung von iterator
 * @author Dragana Sunaric
 * @verison 22.10.2015
 * @param <E>
 */
public interface IteratorExtended<E> extends Iterator<E>{
	/**
	 * ersetzt das zuletzt zurückgegebene Element
	 * @param e
	 */
	void replace(E e);
	/**
	 * FÜgt ein Element nach dem zuletzt hinzugefügtem ein
	 * @param e
	 */
	void insertAfter(E e);
}
