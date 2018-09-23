public class Area {

  private AreaType type;
  private double square;

  Area(AreaType type, double square) {
    this.type = type;
    this.square = square;
  }

  public AreaType getType() {
    return type;
  }

  public double getSquare() {
    return square;
  }

}
