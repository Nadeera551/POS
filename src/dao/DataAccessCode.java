package dao;

import db.DBConnection;
import entity.Customer;
import entity.Item;

import java.sql.*;
import java.util.ArrayList;

public class DataAccessCode {
/*
    // customer
    public boolean saveCustomer(Customer c) throws ClassNotFoundException, SQLException {

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
    public boolean updateCustomer(Customer c) throws ClassNotFoundException, SQLException {

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
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
    String sql = "DELETE FROM Customer WHERE id=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1, id);

        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }
    public Customer getCustomer(String id) throws ClassNotFoundException, SQLException {

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
    public ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
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

    //item

    public boolean saveItem(Item i) throws ClassNotFoundException, SQLException {
     String sql = "INSERT INTO Item VALUES (?,?,?,?)";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        stm.setObject(1,i.getCode());
        stm.setObject(2,i.getDescription());
        stm.setObject(3,i.getUnitPrice());
        stm.setObject(4,i.getQtyOnHand());
        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }
    public boolean updateItem(Item i) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE Item SET description=?,  unitPrice=?, qtyOnHand=? WHERE code=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1,i.getDescription());
        stm.setObject(2,i.getUnitPrice());
        stm.setObject(3,i.getQtyOnHand());
        stm.setObject(4,i.getCode());
        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }
    public boolean deleteItem(String code) throws ClassNotFoundException, SQLException {
     String sql = "DELETE FROM Item WHERE code=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1, code);

        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }
    public Item getItem(String code) throws ClassNotFoundException, SQLException {
    String sql = "SELECT * FROM Item WHERE code=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1, code);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new Item(
                    rst.getString(1),
                    rst.getNString(2),
                    rst.getDouble(3),
                    rst.getInt(4)
            );
        }
        return null;

    }
    public ArrayList<Item> getAllItem() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Item";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        ArrayList<Item> list=new ArrayList<>();
        while (rst.next()){
            list.add(new Item(
                    rst.getString(1),
                    rst.getNString(2),
                    rst.getDouble(3),
                    rst.getInt(4)
            ));
        }
        return list;

    }*/
}

