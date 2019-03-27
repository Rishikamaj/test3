package com.newt;

public class Employee {
	String ID;
	String Name;
	String CardNo;
	String BloodGroup;
	String PhotoName;

	Employee() {
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}

	public String getPhotoName() {
		return PhotoName;
	}

	public void setPhotoName(String photoName) {
		PhotoName = photoName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BloodGroup == null) ? 0 : BloodGroup.hashCode());
		result = prime * result + ((CardNo == null) ? 0 : CardNo.hashCode());
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((PhotoName == null) ? 0 : PhotoName.hashCode());
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
		Employee other = (Employee) obj;
		if (BloodGroup == null) {
			if (other.BloodGroup != null)
				return false;
		} else if (!BloodGroup.equals(other.BloodGroup))
			return false;
		if (CardNo == null) {
			if (other.CardNo != null)
				return false;
		} else if (!CardNo.equals(other.CardNo))
			return false;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (PhotoName == null) {
			if (other.PhotoName != null)
				return false;
		} else if (!PhotoName.equals(other.PhotoName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", CardNo=" + CardNo + ", BloodGroup=" + BloodGroup
				+ ", PhotoName=" + PhotoName + "]";
	}

	public Employee(String iD, String name, String cardNo, String bloodGroup, String photoName) {
		super();
		ID = iD;
		Name = name;
		CardNo = cardNo;
		BloodGroup = bloodGroup;
		PhotoName = photoName;
	}

}
