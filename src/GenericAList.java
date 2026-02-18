public class GenericAList<T> {


    private T[] elements;
    private int size;
    private int maxSize;

    public GenericAList() {
        maxSize = 10;
        elements = (T[]) new Object[maxSize];
        size = 0;


    }

    public void addy(T item) {
        if (size == maxSize){
            maxSize *= 2;
            T[] newList = (T[]) new Object[maxSize];

            for (int i = 0; i < size; i++){
                newList[i] = elements[i];
            }

            elements = newList;
        }

        elements[size] = item;
        size++;
    }

    public void removy(int pos) {

        for(int i = pos; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
    }

    public String toString() {
        if (size == 0) return "Empty List\n";

        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i].toString() + "\n";
        }
        return result;

    }
}

/*
Sources:
https://www.w3schools.com/java/java_generics.asp
https://www.geeksforgeeks.org/java/how-to-create-a-generic-array-in-java/
https://docs.oracle.com/javase/tutorial/java/generics/types.html

 */