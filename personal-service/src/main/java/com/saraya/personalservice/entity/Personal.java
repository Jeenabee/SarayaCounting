package com.saraya.personalservice.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Personal {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int NSS;
    private String fName;
    private String lName;
    private Date dateOfBirth;
    private String profession;
    private String maritalStatus;
    private int numOfChild;
    private String email;
    private String tel;


    public Personal() {
    }


    public Personal(int nSS, String fName, String lName, Date dateOfBirth, String profession, String maritalStatus,
            int numOfChild, String email, String tel) {
        NSS = nSS;
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.profession = profession;
        this.maritalStatus = maritalStatus;
        this.numOfChild = numOfChild;
        this.email = email;
        this.tel = tel;
    }


    public int getNSS() {
        return NSS;
    }


    public void setNSS(int nSS) {
        NSS = nSS;
    }


    public String getfName() {
        return fName;
    }


    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getlName() {
        return lName;
    }


    public void setlName(String lName) {
        this.lName = lName;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getProfession() {
        return profession;
    }


    public void setProfession(String profession) {
        this.profession = profession;
    }


    public String getMaritalStatus() {
        return maritalStatus;
    }


    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    public int getNumOfChild() {
        return numOfChild;
    }


    public void setNumOfChild(int numOfChild) {
        this.numOfChild = numOfChild;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTel() {
        return tel;
    }


    public void setTel(String tel) {
        this.tel = tel;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + NSS;
        result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((fName == null) ? 0 : fName.hashCode());
        result = prime * result + ((lName == null) ? 0 : lName.hashCode());
        result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
        result = prime * result + numOfChild;
        result = prime * result + ((profession == null) ? 0 : profession.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
        Personal other = (Personal) obj;
        if (NSS != other.NSS)
            return false;
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null)
                return false;
        } else if (!dateOfBirth.equals(other.dateOfBirth))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fName == null) {
            if (other.fName != null)
                return false;
        } else if (!fName.equals(other.fName))
            return false;
        if (lName == null) {
            if (other.lName != null)
                return false;
        } else if (!lName.equals(other.lName))
            return false;
        if (maritalStatus == null) {
            if (other.maritalStatus != null)
                return false;
        } else if (!maritalStatus.equals(other.maritalStatus))
            return false;
        if (numOfChild != other.numOfChild)
            return false;
        if (profession == null) {
            if (other.profession != null)
                return false;
        } else if (!profession.equals(other.profession))
            return false;
        if (tel == null) {
            if (other.tel != null)
                return false;
        } else if (!tel.equals(other.tel))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Personal [NSS=" + NSS + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", fName=" + fName
                + ", lName=" + lName + ", maritalStatus=" + maritalStatus + ", numOfChild=" + numOfChild
                + ", profession=" + profession + ", tel=" + tel + "]";
    }


    

    
    

    


    
    
}
