package encapsulation.task1;

public class House {
    // Pole
    private String address;
    private int numberOfRooms;
    private double area;

    // Bez parametr constructor
    public House() {
    }

    // S parametr constructor
    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }


    // Getter Setter

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getArea(){
        return area;
    }

    // dop methods
    public double calculatePrice(int price){
        return area * price;
    }

    // toString
    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", area=" + area +
                '}';
    }
}
