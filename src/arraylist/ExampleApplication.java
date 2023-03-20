package arraylist;

public class ExampleApplication {
    public static void main(String[] args){
        CustomList<String> myCustomList = new CustomArrayList<>();
        for(int i = 0;i<10;i++ ){
            myCustomList.add("element " + (i+1));
        }

        myCustomList.add("element Test");
        System.out.println("This the maximum amount " + myCustomList.getSize());
        System.out.println("Get the value " + myCustomList.getSize());
        System.out.println("Get the value " + myCustomList.get(20));



        for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i));
        }



    }
}
