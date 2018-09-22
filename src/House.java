import java.util.ArrayList;
import java.util.List;

public class House {
  List<Floor> floors = new ArrayList<>();
  private int bedroomCount;


  public Floor addFloor(int floorNumber) {
    Floor floor = new Floor(floorNumber);
    floors.add(floor);
    return floor;
  }


  public int getBedroomCount() {
    //вычислить на каждом этаже сколько ванных комнат
    for (int i = 0; i < floors.size(); i++){
      Floor floor = floors.get(i);
      List<Area> floorAreas = floor.areas;
      for (int j = 0; j < floorAreas.size(); j++){
        if (floorAreas.get(j).getType().equals(AreaType.BEDROOM)){
          bedroomCount++;
        }
      }
    }
    return bedroomCount;
  }


  public double getLivingArea() {
  // посчитать на каждом этаже площать помещений типа ЛивингАреа
    double houseLivingArea = 0.0;
    for (int i = 0; i < floors.size(); i++){
      Floor floor = floors.get(i);
      List<Area> floorAreas = floor.areas;
      for (int j = 0; j < floorAreas.size(); j++){
        if (floorAreas.get(j).getType().isLiving()){
          houseLivingArea += floorAreas.get(j).getSquare();
        }
      }
    }
    return houseLivingArea;
  }

  public double getNonLivingArea() {
    // посчитать на каждом этаже площать помещений типа NoЛивингАреа
    double houseNonLivingArea = 0.0;
    for (int i = 0; i < floors.size(); i++){
      Floor floor = floors.get(i);
      List<Area> floorAreas = floor.areas;
      for (int j = 0; j < floorAreas.size(); j++){
        if (!floorAreas.get(j).getType().isLiving()){
          houseNonLivingArea += floorAreas.get(j).getSquare();
        }
      }
    }
    return houseNonLivingArea;
  }

  public double getTotalArea() {
    //сложить все площади всех помещений на всех этажах
    return getNonLivingArea() + getLivingArea();
  }
}
