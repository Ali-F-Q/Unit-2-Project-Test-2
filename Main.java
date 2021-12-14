import java.util.ArrayList;
import java.util.*;

class Main {
  public static void main(String[] args) {
    float amount = 8;
    int index = 2;

    //Tax
    System.out.println((amount*index)*1.13f);

    ArrayList<Item> items = new ArrayList<>();
    ArrayList<String> sort = new ArrayList<String>();

    items.add(new Item("Rob", 25, 1));
    sort.add(new String("Rob"));

    items.add(new Item("Rayyan", 50, 2));
    sort.add(new String("Rayyan"));

    items.add(new Item("Ali", 100, 1));
    sort.add(new String("Ali"));

    items.add(new Item("Liam", 75, 1));
    sort.add(new String("Liam"));

    //First object in items list
    System.out.println(items.get(0).getName());

    //Collections.sort(sort);
    //Prints sorted list
    //System.out.println(sort);

    //for(int i=0; i<items.size();i++){
    //  for(int y=0; y<sort.size();y++){
    //    if (sort.get(i).equals(items.get(y).getName())){
    //      System.out.println(items.get(y));
    //    }
    //  }
    //}

    //Item temp;

    //for(int i=0; i<items.size()-1;i++){
    //  for(int y=0; y<items.size()-1;y++){
    //    if(items.get(y).getName().charAt(0) > items.get(y+1).getName().charAt(0)){
    //      temp = items.get(y);
    //      items.get(y) = items.get(y+1);
    //      items.get(y+1) = temp;
    //    }
    //  }
    //}

    Item temp;
    
    for (int x=0; x<items.size(); x++){
      for (int i=0; i < items.size()-x-i; i++){
        if (items.get(i).getName().charAt(0) > items.get(i+1).getName().charAt(0)){

          temp = items.get(i);
          items.set(i,items.get(i+1) );
          items.set(i+1, temp);

        }
      }
    }

    System.out.println(items);
  }
}