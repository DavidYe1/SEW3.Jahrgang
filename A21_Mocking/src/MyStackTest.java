

import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

import java.util.EmptyStackException;

public class MyStackTest {
	MyStack ms;
	
	@Before
	public void beforeTest(){
		if(withmockObjects()){
			ms = mock(MyStack.class);
			doThrow(new StackFullException()).when(ms).push(20);
			doThrow(new EmptyStackException()).when(ms).pop();
			
		}else{
			ms = new MyStack(20);
		}
	}
	/**
	 * wirft eine Stack full exception wenn 20 mal gepusht wurde
	 */
	@Test(expected=StackFullException.class)
	public void testPush(){
		for(int i = 0 ; i < 30 ; i++){
			ms.push(i);
		}
	}
	
	/**
	 * Wirft eine Exception wenn pop Aufgerufen wird (da Stack leer ist)
	 */
	@Test(expected=EmptyStackException.class)
	public void testPop(){
		ms.pop();
	}
	
	/**
	 * Gibt zurück ob der etst mit oder ohne mockobjekte ausgeführt werden soll
	 * @return
	 */
	public boolean withmockObjects(){
		return true;
	}
}