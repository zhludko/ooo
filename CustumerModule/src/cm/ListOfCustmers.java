package cm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.TreeSet;

import buffered.Person;

public class ListOfCustmers {
	private TreeSet<Custumer> set;
	File file;
	public ListOfCustmers() {
		// TODO Auto-generated constructor stub
	}
	public ListOfCustmers(TreeSet<Custumer> set) {
		super();
		this.set = set;
		File file = new File("ListOfCustmers.txt");
		}
	public TreeSet<Custumer> getSet() {
		return set;
	}
	public void setSet(TreeSet<Custumer> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "ListOfCustmers [set=" + set + "]";
	}
	public void addCustumer(Custumer custumer){
		set.add(custumer);
		//записати у файл
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file,true));
		outputStream.writeObject(custumer);
		outputStream.flush();
		outputStream.close();
	}
	public void displayAllCustumers(){
		//зчитати з файлу клієнтів
	}
	
	public void displaySomeCustumers(int someTotalValue){
		Iterator<Custumer> iterator = set.iterator();
		while(iterator.hasNext()){
			Custumer cust=iterator.next();
			if(cust.getTotalValue()>=someTotalValue){
				//зчитати з файлу клієнта
			}
		}
		
	}
}
