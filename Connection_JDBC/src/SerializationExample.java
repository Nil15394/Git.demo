import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6200059863612291834L;
	static String fileName="employee.ser";
	public static void main(String[] args) {
		
		Customer emp = new Customer();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);
		
		Seriazalize(emp,fileName);
		
		Customer cust = deser(fileName);
	}
	private static Customer deser(String fileName2) {
		try {
			Customer cust = null;
			FileInputStream in = new FileInputStream(fileName2);
			ObjectInputStream obj = new ObjectInputStream(in);
			
			cust = (Customer) obj.readObject();
			return cust;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	private static void Seriazalize(Customer emp, String fileName2) {
		try {
			FileOutputStream file = new FileOutputStream(fileName2);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(emp); 
			file.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
		
		
	
	

