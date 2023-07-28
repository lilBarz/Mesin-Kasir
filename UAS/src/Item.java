public class Item {
    private Object[][] itemDB = {
            {101,"Beng Beng",2000,0},
            {102,"Cheetos",1500,0},
            {103,"Teh Pucuk",3500,0},
            {104,"Coca Cola",6000,0}
    };

    public void setItemDB(int itemDB, int i) {
        this.itemDB[i][3] = itemDB;
    }

    public Object[][] getItemDB() {
        return itemDB;
    }


}
