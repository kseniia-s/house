import java.util.ArrayList;
import java.util.List;

public class House {
  private List<Floor> floors = new ArrayList<>();
  private int bedroomCount;


  public Floor addFloor(int floorNumber) {
    Floor floor = new Floor(floorNumber);
    floors.add(floor);
    return floor;
  }


  public int getBedroomCount() {
    for (int i = 0; i < floors.size(); i++){
      Floor floor = floors.get(i);
      bedroomCount += floor.getBedroomCount();
    }
    return bedroomCount;
  }


  public double getLivingArea() {
    double houseLivingArea = 0.0;
    for (int i = 0; i < floors.size(); i++){
      Floor floor = floors.get(i);
      houseLivingArea += floor.getLivingArea();
    }
    return houseLivingArea;
  }

  public double getNonLivingArea() {
    double houseNonLivingArea = 0.0;
    for (int i = 0; i < floors.size(); i++){
      Floor floor = floors.get(i);
      houseNonLivingArea += floor.getNonLivingArea();
    }
    return houseNonLivingArea;
  }

  public double getTotalArea() {
    return getNonLivingArea() + getLivingArea();
  }

}
