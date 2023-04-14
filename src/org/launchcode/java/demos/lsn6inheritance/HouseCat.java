package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";


    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName){
        name = aName;
    }

    public HouseCat(double aWeight){
        super(aWeight);
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise();
        }
    }

        public String purr () {
            return "I'm a HouseCat";
        }


    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());//prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());//prints 13

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

//        cheshireCat.setHungry(true);

        System.out.println(plainCat.noise()); //prints "Meeeeeoooowww!"
        System.out.println(cheshireCat.noise()); //prints "Hello, my name is Cheshire!"
    }
}
