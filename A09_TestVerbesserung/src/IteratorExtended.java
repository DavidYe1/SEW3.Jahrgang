import java.util.*;
/**
 * Iterator extended , eine erweiterung von iterator
 * @author Dragana Sunaric
 * @verison 22.10.2015
 * @param <E>
 */
public interface IteratorExtended<E> extends Iterator<E>{
	/**
	 * ersetzt das zuletzt zur�ckgegebene Element
	 * @param e
	 */
	void replace(E e);
	/**
	 * F�gt ein Element nach dem zuletzt hinzugef�gtem ein
	 * @param e
	 */
	void insertAfter(E e);
}
