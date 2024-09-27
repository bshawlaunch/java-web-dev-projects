public class Main {

    public static void main(String[] args) {
        HouseCat myCat = new HouseCat("Whiskers", 8.5);
        Cat otherCat = new Cat(10.0);
        System.out.println("Family: " + myCat.getFamily());
        if(!myCat.isHungry()) {

            System.out.println(myCat.getName() + " is hungry");

        }
        System.out.println(myCat.noise());
        System.out.println(otherCat.noise());

    }

}

