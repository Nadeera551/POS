package dao.custom.impl;

import dao.custom.CustomerDao;
import db.DBConnection;
import entity.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDaoIMPL implements CustomerDao {
    @Override
    public boolean save(Customer c) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO Customer VALUES (?,?,?,?)";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        stm.setObject(1,c.getId());
        stm.setObject(2,c.getName());
        stm.setObject(3,c.getAddress());
        stm.setObject(4,c.getSalary());
        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Customer c) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE Customer SET name=?, address=?, salary=? WHERE id=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1,c.getName());
        stm.setObject(2,c.getAddress());
        stm.setObject(3,c.getSalary());
        stm.setObject(4,c.getId());
        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM Customer WHERE id=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1, id);

        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }

    @Override
    public Customer get(String id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Customer WHERE id=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new Customer(
                    rst.getString(1),
                    rst.getNString(2),
                    rst.getString(3),
                    rst.getDouble(4)
            );
        }
        return null;

    }

    @Override
    public ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Customer ";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        ArrayList<Customer> list=new ArrayList<>();
        while (rst.next()){
            list.add(new Customer(
                    rst.getString(1),
                    rst.getNString(2),
                    rst.getString(3),
                    rst.getDouble(4)
            ));
        }
        return list;
    }

   /* @Override
    public boolean save(Customer customer) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public boolean update(Customer customer) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public Customer get(String s) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException {
        return null;
    }*/
}
