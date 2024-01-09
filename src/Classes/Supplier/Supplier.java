package Classes.Supplier;

import Classes.Contacts;

public class Supplier {
  private int counter = 1;
  private final int ID;
  private String companyName;
  private String address;
  private int suppliedProductType;
  private String VATNumber;
  private Operations operations;
  private Contacts contacts;

  public Supplier(String companyName, String address, int suppliedProductType, String VATNumber, String email, String phoneNumber) {
    this.ID = incrementAndGet();
    this.companyName = companyName;
    this.address = address;
    this.suppliedProductType = suppliedProductType;
    this.VATNumber = VATNumber;
    this.contacts = new Contacts(email, phoneNumber);
  }

  public int getID() {
    return ID;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getAddress() {
    return address;
  }

  public int getSuppliedProductType() {
    return suppliedProductType;
  }

  public String getVATNumber() {
    return VATNumber;
  }

  public Operations getOperations() {
    return operations;
  }

  public Contacts getContacts() {
    return contacts;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setSuppliedProductType(int suppliedProductType) {
    this.suppliedProductType = suppliedProductType;
  }

  public void setVATNumber(String VATNumber) {
    this.VATNumber = VATNumber;
  }

  public void setOperations(Operations operations) {
    this.operations = operations;
  }

  public void setContacts(Contacts contacts) {
    this.contacts = contacts;
  }

  private int incrementAndGet() {
    return counter++;
  }

  @Override
  public String toString() {
    return "Supplier{" +
            "counter=" + counter +
            ", ID=" + ID +
            ", companyName='" + companyName + '\'' +
            ", address='" + address + '\'' +
            ", suppliedProductType=" + suppliedProductType +
            ", VATNumber='" + VATNumber + '\'' +
            ", operations=" + operations +
            ", contacts=" + contacts +
            '}';
  }
}
