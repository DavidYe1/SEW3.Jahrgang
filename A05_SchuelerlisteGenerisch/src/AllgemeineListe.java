
public class AllgemeineListe<E> {
	private Object [] o; // ein array von objekten
	public AllgemeineListe(){
		this.o = new Object[0];
	}
	public void add(E e){
		Object[] neu = new Object[this.o.length+1];
		for(int i = 0 ; i < this.o.length ; i++){
			neu[i] = this.o[i];
		}
		neu [neu.length-1] = e;
		this.o = neu;
	}
	public void remove(E e){
		Object[] neu = new Object[this.o.length-1];
		boolean b1 = true;
		for(int i = 0 ; i < this.o.length - 2 ; i++){
			if(e.equals(this.o[i]))b1=false;
			else if(b1) neu[i] = this.o[i];
			else if(!b1)neu[i-1] = this.o[i];
		}
		this.o = neu;
	}
	public int anzahl(){
		return this.o.length;
	}
	public String toString(){
		String s1 = "";
		for(int i = 0 ; i < this.o.length ; i++){
			s1 += this.o[i].toString() + "\n";
		}
		return s1;
	}
	public GeneralIterator get(){
		return new MyIterator(this.o);
	}
	private class MyIterator implements GeneralIterator<E>{
		private Object [] li; // ein array von objekten
		private int index;
		private MyIterator(Object [] e){
			this.li = e.clone();
			this.index = 0;
		}
		public boolean hasNext(){
			return index < this.li.length;
		}
		public E next(){
			Object o = this.li[index];
			index++;
			return (E)o;
		}
	} 
}
