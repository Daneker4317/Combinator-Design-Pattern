import java.time.LocalDate;

public class Customer {
    private String name;
    private String eamil;
    private String phone;
    private LocalDate dob;

    public Customer(String name, String eamil, String phone, LocalDate dob) {
        this.name = name;
        this.eamil = eamil;
        this.phone = phone;
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
