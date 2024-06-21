package week15_miniproject;

import java.io.IOException;

public interface iCRUD {
    public Object createItem();

    public int addItem();

    public int printItem();

    public int updateItem();

    public int deleteItem();

    public int searchItem();

    public void saveItem() throws IOException;

}
