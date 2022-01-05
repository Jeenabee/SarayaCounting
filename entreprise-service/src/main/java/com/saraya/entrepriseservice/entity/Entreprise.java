package com.saraya.entrepriseservice.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Entreprise {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int NE;
    private String name;
    private String domaine;
    private String adress;
    private String profession;
    private String email;
    private String tel;


    public Entreprise() {
    }


    public Entreprise(int nE, String name, String domaine, String adress, String profession, String email, String tel) {
        NE = nE;
        this.name = name;
        this.domaine = domaine;
        this.adress = adress;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
    }


    public int getNE() {
        return NE;
    }


    public void setNE(int nE) {
        NE = nE;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDomaine() {
        return domaine;
    }


    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }


    public String getAdress() {
        return adress;
    }


    public void setAdress(String adress) {
        this.adress = adress;
    }


    public String getProfession() {
        return profession;
    }


    public void setProfession(String profession) {
        this.profession = profession;
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
        result = prime * result + NE;
        result = prime * result + ((adress == null) ? 0 : adress.hashCode());
        result = prime * result + ((domaine == null) ? 0 : domaine.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Entreprise other = (Entreprise) obj;
        if (NE != other.NE)
            return false;
        if (adress == null) {
            if (other.adress != null)
                return false;
        } else if (!adress.equals(other.adress))
            return false;
        if (domaine == null) {
            if (other.domaine != null)
                return false;
        } else if (!domaine.equals(other.domaine))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
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
        return "Entreprise [NE=" + NE + ", adress=" + adress + ", domaine=" + domaine + ", email=" + email + ", name="
                + name + ", profession=" + profession + ", tel=" + tel + "]";
    }


    


    


    

    


    
}
