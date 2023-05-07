package arraylist;

import java.util.Arrays;
import java.util.stream.Stream;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int size = 0;
    @Override
    public boolean add(T item) {
        //TODO Auto-generated method stub

        //This if statement is what resizes once array is full
        if(size == items.length){
            items = Arrays.copyOf(items,size*2);
            //items is now new list
            items[size] = item;
            size++;
            return true;
        }
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Item doesn't exists");
        }
        if(size == items.length){
            items = Arrays.copyOf(items,size*2);
            //items is now new list
        }
        Object[] insert = new Object[1];
        insert[0] = item;

        items = Stream.concat(Stream.concat(Arrays.stream(Arrays.copyOfRange(items,0,index)),
                        Arrays.stream(Arrays.copyOfRange(insert,0,insert.length)))
                ,Arrays.stream(Arrays.copyOfRange(items,index,items.length))).toArray();
        size++;

        return true;
    }

    @Override
    public int getSize() {
        //TODO Auto-generated method stub

        return size;
    }

    @Override
    public T get(int index) {
        //TODO Auto-generated method stub
        //Return null if value doesn't exists
        return (index>=items.length)?null:((T) items[index]!=null)?(T) items[index]:null;
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {

        if (index > size || index < 0){

            throw new IndexOutOfBoundsException("Item doesn't exists ");

        }
        //I could have done this with loops and should be less operations
        items = Stream.concat(Arrays.stream(Arrays.copyOfRange(items,0,index)),
                        Arrays.stream(Arrays.copyOfRange(items,index+1,items.length)))
                .toArray();
        size--;

        return (T) items;
    }
}
