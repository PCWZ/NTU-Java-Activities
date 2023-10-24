package Activity6.building;

public class School implements Building{

    private String name;
    private int numberOfFloors;
    private String address;


    public School(String name, String address, int numberOfFloors) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void addFloor(int floors) {
        this.numberOfFloors = floors;
    }

    @Override
    public void describe() {
        System.out.println(this.name + ", " + this.address);
    }

    
}
