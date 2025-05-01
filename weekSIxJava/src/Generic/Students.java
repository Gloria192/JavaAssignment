package Generic;

import java.time.LocalDate;

public class Students {
    private  int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String gender;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Students() {

    }
    public Students(int id, String name, String phone, String email, String address, String gender, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
