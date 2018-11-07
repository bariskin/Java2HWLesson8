public class HashTable {

     private Item [] hashArray;
     private int currentSize;

     public  HashTable(int MaxSize){
         this.hashArray = new Item[MaxSize];
         currentSize = 0;
     }

     public void insert (Item item ){
         int index = hashFunction(item);
         while(hashArray[index]!=null) {
             ++index;
             index %= hashArray.length;
          }
             hashArray[index] = item;
     }
     public boolean  remove(Item item ){

       return remove(item.getData())!=null;
     }

     public Item remove (int key ){

       int index = hashFunction(key);

       while(hashArray[index]!=null)
           if (hashArray[index].getData()==key) {
               Item removedItem = hashArray[index];
               hashArray[index]= null;
               return removedItem;
           }
           return null;
     }

     public Item find (int key ){

         int index = hashFunction(key);
          while(hashArray[index]!=null){
              if(hashArray[index].getData()==key)
                  return hashArray[index];
          }
          ++index;
           index%=hashArray.length;
     return null;
}
     public int hashFunction(int key){
         return key % hashArray.length;

     }

     public int hashFunction(Item item ){
         return hashFunction(item.hashCode());
     }
     public void display(){
         for (int i = 0 ; i < hashArray.length; i++){
             System.out.println(hashArray[i]);
         }
     }
}
