package home.automation;

public class Sensor {
    private boolean isActive = false;
    private int objectKey;

    public Sensor (int objectKey){
        this.objectKey = objectKey;
    }


    public boolean isActive(){
        return this.isActive;
    }

    public void toggle(){
        this.isActive = !isActive;
    }

    public int getObjectKey(){
        return this.objectKey;
    }
}
