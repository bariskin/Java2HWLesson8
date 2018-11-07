import java.util.*;
import java.lang.String;

public class Item {

    private final int data;

    public Item(int data) {

        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return true;
    }

   @Override
    public int hashCode(){
        return data;
   }
   @Override
   public String toString(){
      return("Item {"
              +"data=" + data
              +"}");

   }

}