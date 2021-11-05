import java.util.ArrayList;
import java.util.List;

public class LightTruck extends Vehicle {

  public class TransferCase {

    private int numGears;

    public TransferCase() {
      this.numGears = 4;
    }

    public TransferCase(int gears) {
      this.numGears = gears;
    }

    public int getNumGears() {
      return this.numGears;
    }
  }

  // Class Variables
  public TransferCase xferCase;
  private boolean is4wd;
  String licensePlate;
  double someNum;
  double anotherNum;
  int year;
  String make;
  String model;
  String color;
  long aLong;
  long anotherLong;

  // in the constructor, manage if the truck object will have
  // a transfer case
  public LightTruck(boolean is4wd) {
    // other ctor statements
    this.is4wd = is4wd;
    if (this.is4wd == true) {
      this.xferCase = new TransferCase();
    }
  }

  public LightTruck(String licensePlate, double someNum, double anotherNum, int year, String make, String model,
      String color, long aLong, long anotherLong, boolean is4wd) {
    this.licensePlate = licensePlate;
    this.someNum = someNum;
    this.anotherNum = anotherNum;
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.aLong = aLong;
    this.anotherLong = anotherLong;
    this.is4wd = is4wd;
    if (this.is4wd == true) {
      this.xferCase = new TransferCase();
    }

  }

  public static void main(String[] args) {
    LightTruck lt = new LightTruck("16896XCKJE8", 48000.00, 62000.00, 2019, "Chevrolet", "Silverado", "Silver", 10000L,
        90000L, true);

    if (lt.is4wd) {
      int gears = lt.xferCase.numGears;
      System.out.println("This truck has " + gears + " gears!");
    }

    // referring to an enum in the main() method
    VehicleClassification vc = VehicleClassification.SHUTTLE;

    // setting the classification of a vehicle
    lt.setVehicleClass(VehicleClassification.NEW);

    Department sd = DepartmentFactory.CreateDepartment(DepartmentNames.SERVICE);
    Department fd = DepartmentFactory.CreateDepartment(DepartmentNames.FINANCE);

    List<Department> depts = new ArrayList<Department>();
    depts.add(sd);
    depts.add(fd);

    Leaseable l = LeaseVehicleFactory.getLeasableVehicleByVin("16896XCKJE8");

    System.out.println("Can be leased? " + l.isLeaseable());

  }

}
