package com.company;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Electric_DriveSet implements Set<Electric_Drive> {
    private static final int MAX_CAPACITY = 15;
    private Electric_Drive electric_drive[] = new Electric_Drive[MAX_CAPACITY];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public boolean contains(Object o) {
        Iterator<Electric_Drive> electric_driveIterator = iterator();
        while (electric_driveIterator.hasNext()){
            if(o.equals(electric_driveIterator.next())){
                return true;
            }
        }
        return false;
    }
    @Override
    public Iterator<Electric_Drive> iterator(){
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Electric_Drive next() {
                return electric_drive[index++];
            }
        };
    }
    @Override
    public Object[] toArray(){
        Iterator<Electric_Drive>electric_driveIterator = iterator();
        Object[]xd =new Object[size];
        int index = 0;
        while(electric_driveIterator.hasNext()){
            xd[index++]=electric_driveIterator.next();
        }
    return xd;
    }
    public <K> K[] toArray(K[] a){
        if(a.length >= size && a instanceof electric_drive[]){
            for(int i =0;i<a.length;i++){
                try{
                    a[i]=(K) electric_drive[i];
                }
                catch (IndexOutOfBoundsException e){
                    a[i]=null;
                }
            }
        }
        else{
            a=(K[])toArray();
        }
    return a;
    }
   @Override
   public boolean add(Electric_Drive addedTrain) {
       boolean ka = false;
       electric_drive[size++] = addedTrain;
       return true;
   }
}
