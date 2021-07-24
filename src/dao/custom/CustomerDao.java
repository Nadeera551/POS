package dao.custom;

import dao.CrudDAO;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDao extends CrudDAO<Customer, String> {
   /* public boolean saveCustomer ( Customer c) throws ClassNotFoundException, SQLException;
    public boolean updateCustomer ( Customer c) throws ClassNotFoundException, SQLException;
    public boolean deleteCustomer ( String id) throws ClassNotFoundException, SQLException;
    public Customer getCustomer ( String id) throws ClassNotFoundException, SQLException;
    public ArrayList<Customer> getAllCustomer () throws ClassNotFoundException, SQLException;
*/
}
