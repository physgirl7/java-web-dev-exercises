package exercises.technology;

public class SmartPhone extends Computer{
    private String color;
    private Integer cameraMegaPixels;

    public SmartPhone(String color, Integer cameraMegaPixels){
        super();
        this.color = color;
        this.cameraMegaPixels = cameraMegaPixels;
    }

    public SmartPhone(String color, Integer cameraMegaPixels, String processorType,
                      Double processorSpeed, Integer theRAM, String operatingSystem){
        super(processorType, processorSpeed, theRAM, operatingSystem);
        this.color = color;
        this.cameraMegaPixels = cameraMegaPixels;

    }

    public Integer cameraRating() {
        if (cameraMegaPixels >= 50) {
            return 5;
        } else if (cameraMegaPixels >= 25) {
            return 2;
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "This smartphone is " + color+ ", has a camera with " + cameraMegaPixels+ " MegaPixels, a processor" +
                "type of " + getProcessorType() + ", a processor speed of " +getProcessorSpeed() +"Gz ,"
                + getTheRAM() + " of RAM and is using the " + getOperatingSystem() + " operating system.";
    }

    public static void main(String[] args) {
        SmartPhone einstein = new SmartPhone("Blue",108);
        SmartPhone benny = new SmartPhone("Red",15, "SnapDragon 8",
                13.0, 16,"Android");

        System.out.println(einstein.toString());
        System.out.println(benny.toString());
        System.out.println(einstein.cameraRating());
        System.out.println(benny.cameraRating());
    }
}
