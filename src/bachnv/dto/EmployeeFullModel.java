/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachnv.dto;

import bachnv.dao.EmployeeDAO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ngvba
 */
public class EmployeeFullModel extends AbstractTableModel {

    ArrayList<EmployeeDTO> employee;

    public EmployeeFullModel(ArrayList<EmployeeDTO> employee) {
        this.employee = employee;
    }

    public ArrayList<EmployeeDTO> getEmployee() {
        return employee;
    }
    
    @Override
    public int getRowCount() {
        return employee.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "EmpID";
                break;
            case 1:
                columnName = "Fullname";
                break;
            case 2:
                columnName = "Phone";
                break;
            case 3:
                columnName = "Email";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EmployeeDTO dto = employee.get(rowIndex);
        Object obj = null;
        switch (columnIndex) {
            case 0:
                obj = dto.getEmpID();
                break;
            case 1:
                obj = dto.getFullname();
                break;
            case 2:
                obj = dto.getPhone();
                break;
            case 3:
                obj = dto.getEmail();
                break;
        }
        return obj;
    }

}
