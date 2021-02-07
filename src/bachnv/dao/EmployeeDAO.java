/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachnv.dao;

import bachnv.dto.EmployeeDTO;
import java.util.ArrayList;

/**
 *
 * @author ngvba
 */
public class EmployeeDAO extends ArrayList<EmployeeDTO> {

    public boolean createEmployee(EmployeeDTO dto) {
        if (dto != null) {
            this.add(dto);
            return true;
        }
        return false;
    }
    
    public boolean updateEmployee(EmployeeDTO dto){
        if (dto != null) {
            for (int i = 0; i < this.size(); i++) {
                if (dto.getEmpID().equals(this.get(i).getEmpID())) {
                   this.set(i, dto);
                   return true;
                }
            }
        }
        return false;
    }
    
    public boolean deleteEmployee(String id){
        if (id != null) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getEmpID().equals(id)) {
                    this.get(i).setIsDelete(true);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkCodeDuplicate(String id){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getEmpID().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public EmployeeDTO findByEmpID(String id){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getEmpID().equals(id) && this.get(i).isIsDelete() == false) {
                return this.get(i);
            }
        }
        return null;
    }
    
}
