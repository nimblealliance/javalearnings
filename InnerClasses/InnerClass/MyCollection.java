public class MyCollection {

    String[] items = {"A", "B", "C", "D"};

    class Iterator{
      int index =0;

      public boolean hasNext(){
          return index < items.length;
      }

      public String next(){
          if(hasNext()){
              return items[index++];
          }
          return null;
      }
    }
}