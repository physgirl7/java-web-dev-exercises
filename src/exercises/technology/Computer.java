package exercises.technology;

public class Computer extends AbstractEntity {
    private String processorType;
    private Integer theRAM;
    private Double processorSpeed;
    private String operatingSystem;

    public Computer(String processorType, Double processorSpeed, Integer theRAM, String operatingSystem){
        super();
        this.processorType = processorType;
        this.processorSpeed = processorSpeed;
        this.theRAM = theRAM;
        this.operatingSystem = operatingSystem;

    }

    public Computer (){
        super();
        this.processorType = "Intel i7";
        this.processorSpeed = 4.7;
        this.theRAM = 8;
        this.operatingSystem = "Windows 11";
    }


    public Integer upgradeRAM(Integer addRAM){
        return this.theRAM + addRAM;
    }

    public String switchOperatingSystem(String newOperatingSystem){
        return this.operatingSystem = newOperatingSystem;
    }

    public String getProcessorType(){
        return processorType;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public Integer getTheRAM(){
        return theRAM;
    }

    public Double getProcessorSpeed(){
        return processorSpeed;
    }

}
