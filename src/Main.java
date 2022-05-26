public class Main {

    public static void main(String[] args) {

        SuperList intList = new SuperList();

        intList.addElement(1);
        intList.addElement(2);
        intList.addElement(3);
        intList.addElement(4);

        intList.removeElement(3);

        intList.showElements();
        intList.showReversedElements();

    }

}
