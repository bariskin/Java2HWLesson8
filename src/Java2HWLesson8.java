public class Java2HWLesson8 {

    public static void main (String [] args){

        HashTable item  = new HashTable(10);

        Item item1= new Item(1);
        Item item2= new Item(2);
        Item item3= new Item(3);
        Item item4= new Item(4);
        Item item5= new Item(5);
        Item item6= new Item(6);

        item.insert(item1);
        item.insert(item2);
        item.insert(item3);
        item.insert(item4);
        item.insert(item5);
        item.insert(item6);

        item.display();
    }
}
