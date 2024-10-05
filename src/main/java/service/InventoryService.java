package service;

import entity.Item;

import java.util.List;

public interface InventoryService {

    public A  addItem(Item item);

    public List<Item> addItem(List<Item> itemList);

    public  void  removeItem(int itemId);

    public  B searchItem(int itemId);
    public  Item searchItem(int itemId,String itemColour);
    public  Item searchItem(int itemId,String itemColour,String price);

}
