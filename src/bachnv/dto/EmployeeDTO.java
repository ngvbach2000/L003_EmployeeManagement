/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachnv.dto;

import java.util.Date;

/**
 *
 * @author ngvba
 */
public class EmployeeDTO {
    private String EmpID;
    private String Fullname;
    private String Phone;
    private String Email;
    private String Address;
    private Date DateOfBirth;
    private boolean IsDelete;

    public EmployeeDTO(String EmpID, String Fullname, String Phone, String Email, String Address, Date DateOfBirth, boolean IsDelete) {
        this.EmpID = EmpID;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DateOfBirth = DateOfBirth;
        this.IsDelete = IsDelete;
    }

    /**
     * @return the EmpID
     */
    public String getEmpID() {
        return EmpID;
    }

    /**
     * @param EmpID the EmpID to set
     */
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    /**
     * @return the Fullname
     */
    public String getFullname() {
        return Fullname;
    }

    /**
     * @param Fullname the Fullname to set
     */
    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the DateOfBirth
     */
    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * @param DateOfBirth the DateOfBirth to set
     */
    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * @return the IsDelete
     */
    public boolean isIsDelete() {
        return IsDelete;
    }

    /**
     * @param IsDelete the IsDelete to set
     */
    public void setIsDelete(boolean IsDelete) {
        this.IsDelete = IsDelete;
    }
    
}
