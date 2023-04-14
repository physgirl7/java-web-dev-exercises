package exercises.technology;

public class Laptop extends Computer {
    private Double screenSize;

    public Laptop(Double screenSize){
        super();
        this.screenSize = screenSize;

    }

    public Laptop(Double screenSize, String processorType, Double processorSpeed, Integer theRAM, String operatingSystem) {
        super(processorType, processorSpeed, theRAM, operatingSystem);
        this.screenSize = screenSize;

    }

    public Boolean isGamingReady() {
        Boolean gamingReady = false;
        if (getProcessorType() == "Intel i7" && getTheRAM() >= 8) {
            gamingReady = true;
        } return gamingReady;
    }

    @Override
    public String toString(){
        return "This laptop has a screensize of " +screenSize+" inches, a " + getProcessorType() +" processor type," +
                "a processor speed of " +getProcessorSpeed() + " GHz and " +getTheRAM()+ " GB of RAM";
    }

    public static void main(String[] args) {
        Laptop alethia = new Laptop(15.7);
        Laptop zeus = new Laptop(20.2, "Yippee 4.5", 5.5, 8, "Windows 11");

        System.out.println(alethia.toString());
        System.out.println(zeus.toString());
        System.out.println(alethia.isGamingReady());
        System.out.println(zeus.isGamingReady());
        System.out.println(alethia.getUniqueId());
        System.out.println(zeus.getUniqueId());
    }

}