public class App {

  public static void main(String[] args) {
//    Flat flat = new Flat();
//    flat.addArea(AreaType.BATHROOM, 5.5);
//    flat.addArea(AreaType.RESTROOM, 2.0);
//    flat.addArea(AreaType.BEDROOM, 15.5);
//    flat.addArea(AreaType.BEDROOM, 17.5);
//    flat.addArea(AreaType.BEDROOM, 14.2);
//    flat.addArea(AreaType.KITCHEN, 8.1);
//    flat.addArea(AreaType.BALCONY, 3.0);
//    flat.addArea(AreaType.DINNERROOM, 7.1);
    House house = new House();
    Floor floor0 = house.addFloor(0);
    floor0.addArea(AreaType.BEDROOM, 20.2);
    floor0.addArea(AreaType.BATHROOM, 5.5);
    floor0.addArea(AreaType.RESTROOM, 2.0);
    floor0.addArea(AreaType.KITCHEN, 8.1);
    floor0.addArea(AreaType.DINNERROOM, 7.1);

    Floor floor1 = house.addFloor(1);
    floor1.addArea(AreaType.BATHROOM, 5.5);
    floor1.addArea(AreaType.RESTROOM, 2.0);
    floor1.addArea(AreaType.BEDROOM, 15.5);
    floor1.addArea(AreaType.BEDROOM, 17.5);
    floor1.addArea(AreaType.BEDROOM, 14.2);
    floor1.addArea(AreaType.BALCONY, 3.0);

    Floor floor2 = house.addFloor(2);
    floor2.addArea(AreaType.ATTIC, 15);
    floor2.addArea(AreaType.BALCONY, 3.0);

    System.out.println("Bedrooms in house: " + house.getBedroomCount());
    System.out.println("LivingArea of house: " + house.getLivingArea());
    System.out.println("Non-livingArea of house: " + house.getNonLivingArea());
    System.out.println("House totalArea: " + house.getTotalArea());

    System.out.println("Bedrooms on the floor " + floor0.getFloorNumber() + "\t\t\t: " + floor0.getBedroomCount());
    System.out.println("LivingArea on the floor " +floor0.getFloorNumber()+ "\t\t: " + floor0.getLivingArea());
    System.out.println("Non-livingArea on the floor " +floor0.getFloorNumber()+ "\t: " + floor0.getNonLivingArea());
    System.out.println("TotalArea of the floor " +floor0.getFloorNumber()+ "\t\t: " + floor0.getTotalArea());

    System.out.println("Bedrooms on the floor " +floor1.getFloorNumber()+ "\t\t\t: " + floor1.getBedroomCount());
    System.out.println("LivingArea on the floor " +floor1.getFloorNumber()+ "\t\t: " + floor1.getLivingArea());
    System.out.println("Non-livingArea on the floor " +floor1.getFloorNumber()+ "\t: " + floor1.getNonLivingArea());
    System.out.println("TotalArea of the floor " +floor1.getFloorNumber()+ "\t\t: " + floor1.getTotalArea());

  }

}
