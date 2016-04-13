package cm;

public class Custumer implements Comparable<Custumer>{
	private String firstName;
	private String surname;
	private String adress;
	private int uniqueNumericCode=0;
	private int totalValue;
	public Custumer() {
		// TODO Auto-generated constructor stub
	}
	public Custumer(String firstName, String surname, String adress,
			 int totalValue) {
		super();
		firstName = firstName;
		surname = surname;
		adress = adress;
		uniqueNumericCode = uniqueNumericCode+1;
		totalValue = totalValue;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		surname = surname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		adress = adress;
	}
	public int getUniqueNumericCode() {
		return uniqueNumericCode;
		//UniqueNumericCode++;
	}
	public void setUniqueNumericCode(int uniqueNumericCode) {
		uniqueNumericCode = uniqueNumericCode;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		totalValue = totalValue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + totalValue;
		result = prime * result + uniqueNumericCode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Custumer other = (Custumer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (totalValue != other.totalValue)
			return false;
		if (uniqueNumericCode != other.uniqueNumericCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Custumer [firstName=" + firstName + ", surname=" + surname
				+ ", adress=" + adress + ", uniqueNumericCode="
				+ uniqueNumericCode + ", totalValue=" + totalValue + "]";
	}
	@Override
	public int compareTo(Custumer o) {
		int result = this.firstName.compareTo(o.firstName);
		if(result==0){
			result = this.surname.compareTo(o.surname);
			if(result ==0){
				result = this.adress.compareTo(o.adress);
				if(result ==0){
					result = this.uniqueNumericCode-o.uniqueNumericCode;
					if(result ==0){
						result = this.totalValue -o.totalValue;
					}
				}
			}
		}
		return result;
	}
	
}
