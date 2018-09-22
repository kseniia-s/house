import java.util.ArrayList;
import java.util.List;

public class Floor {
  private int floorNumber;
  private int bedroomCount;
  private double livingArea;
  private double nonLivingArea;
  private double totalArea;

  List<Area> areas = new ArrayList<>();


  public Floor(int floor){
    this.floorNumber = floor;
  }

  public int getFloorNumber(){
    return floorNumber;
  }

  public void addArea(AreaType type, double square) {
    areas.add(new Area(type, square));
    if (type == AreaType.BEDROOM) {
      bedroomCount++;
    }
    if (type.isLiving()) {
      livingArea += square;
    } else {
      nonLivingArea += square;
    }
    totalArea += square;
  }

  public int getBedroomCount() {
    return bedroomCount;
  }

  public double getLivingArea() {
    return livingArea;
  }

  public double getNonLivingArea() {
    return nonLivingArea;
  }

  public double getTotalArea() {
    return totalArea;
  }
}
