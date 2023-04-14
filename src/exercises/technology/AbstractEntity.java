package exercises.technology;

public abstract class AbstractEntity {
    private static int idNumber = 1;

    private int uniqueId;


    public AbstractEntity(){
        this.uniqueId = idNumber++;
    }

    public int getUniqueId(){
        return uniqueId;
    }
}
