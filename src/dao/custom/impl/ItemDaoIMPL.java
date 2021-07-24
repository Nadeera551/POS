package dao.custom.impl;

import dao.custom.ItemDao;
import db.DBConnection;
import entity.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDaoIMPL implements ItemDao {
    @Override
    public boolean save(Item i) throws ClassNotFoundException, SQLException {
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

    @Override
    public boolean update(Item i) throws ClassNotFoundException, SQLException {
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

    @Override
    public boolean delete(String code) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM Item WHERE code=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        stm.setObject(1,code);

        int isSave = stm.executeUpdate();
        if (isSave>0){
            return true;
        }
        return false;
    }

    @Override
    public Item get(String code) throws ClassNotFoundException, SQLException {
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

    @Override
    public ArrayList<Item> getAll() throws ClassNotFoundException, SQLException {
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


}



}
