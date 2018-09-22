public class Area {

  private AreaType type;
  private double square;

  public Area(AreaType type, double square) {
    this.type = type;
    this.square = square;
  }

  public AreaType getType() {
    return type;
  }

  public double getSquare() {
    return square;
  }

  //  public static final String BEDROOM = "badroom";
//  public static final String TOILET = "toilet";
//  public static final String BATHROOM = "bathroom";
//  public static final String KITCHEN = "badroom";
//  public static final String BALCONY = "badroom";
//
//  String type;
//  double square;
//
//  public boolean isLiving() {
//    if (type.equals(AreaType.BEDROOM))
//      return true;
//    else
//      return false;
//  }
}
