import java.util.HashSet;
import java.util.Set;

public class Flat {
  Set<Area> areaSet = new HashSet<>();

  double livingArea = 0;
  double nonLivingArea = 0;
  double totalArea = 0;
  int bedroomCount = 0;

  public void addArea(AreaType type, double square) {
    areaSet.add(new Area(type, square));
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


//  List<Area> areas = new ArrayList<>();
//
//
//  protected void addArea(String type, double square) {
//    Area area = new Area();
//    area.square = square;
//    area.type = type;
//
//    areas.add(area);
//  }
//
//  public double getLivingArea(){
//    double areaSquare = 0;
//    for (int i = 0; i < areas.size(); i++){
//      Area area = areas.get(i);
//      if (area.isLiving()){
//       areaSquare = areaSquare + area.square;
//      }
//    }
//    return areaSquare;
//  }
//
//  public double getNonLivingArea(){
//    double areaSquare = 0;
//    for (int i = 0; i < areas.size(); i++){
//      Area area = areas.get(i);
//      if (!area.isLiving()){
//        areaSquare = areaSquare + area.square;
//      }
//    }
//    return areaSquare;
//  }
//
//  public double getTotalArea(){
//    return getNonLivingArea() + getLivingArea();
//  }
//
//  public int getBedroomCount() {
//    int bedroomCount = 0;
//    for (int i = 0; i < areas.size(); i++){
//      Area area = areas.get(i);
//      if (area.isLiving()){
//        bedroomCount++;
//      }
//    }
//    return bedroomCount;
//  }

}
