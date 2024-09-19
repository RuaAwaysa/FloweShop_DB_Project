/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author EASY LIFE
 */
@Entity
@Table(name = "LOGINUSER")
@NamedQueries({
    @NamedQuery(name = "Loginuser.findAll", query = "SELECT l FROM Loginuser l"),
    @NamedQuery(name = "Loginuser.findByUserName", query = "SELECT l FROM Loginuser l WHERE l.userName = :userName"),
    @NamedQuery(name = "Loginuser.findByUseid", query = "SELECT l FROM Loginuser l WHERE l.useid = :useid"),
    @NamedQuery(name = "Loginuser.findByBd", query = "SELECT l FROM Loginuser l WHERE l.bd = :bd"),
    @NamedQuery(name = "Loginuser.findByPhonenum", query = "SELECT l FROM Loginuser l WHERE l.phonenum = :phonenum"),
    @NamedQuery(name = "Loginuser.findByEmail", query = "SELECT l FROM Loginuser l WHERE l.email = :email")})
public class Loginuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USEID")
    private Integer useid;
    @Column(name = "BD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bd;
    @Column(name = "PHONENUM")
    private Long phonenum;
    @Column(name = "EMAIL")
    private String email;

    public Loginuser() {
    }

    public Loginuser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUseid() {
        return useid;
    }

    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    public Long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loginuser)) {
            return false;
        }
        Loginuser other = (Loginuser) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Loginuser[ userName=" + userName + " ]";
    }
    
}
