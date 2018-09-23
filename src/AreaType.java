public enum AreaType {

  BEDROOM(true),
  KITCHEN(false),
  BALCONY(false),
  RESTROOM(false),
  BATHROOM(false),
  DINNERROOM(false),
  ATTIC(false);

  AreaType(boolean living) {
    this.living = living;
  }

  private boolean living;
  public boolean isLiving() {
    return living;
  }

}
