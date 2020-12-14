package Problem4;

public class MyPair {

    public Integer First = null;
    public Integer Second = null;

    public void print() {
        if (First == null)
            System.out.println("NULL");
        System.out.println("First: " + First + " Second: " + Second);
    }
}
