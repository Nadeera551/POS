package dao.custom;

import dao.CrudDAO;
import entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDao extends CrudDAO<Item, String> {
    /*public boolean saveItem ( Item i) throws ClassNotFoundException, SQLException;
    public boolean updateItem ( Item i) throws ClassNotFoundException, SQLException;
    public boolean deleteItem ( String code) throws ClassNotFoundException, SQLException;
    public Item getItem ( String code) throws ClassNotFoundException, SQLException;
    public ArrayList<Item> getAllItem () throws ClassNotFoundException, SQLException;*/

}
