public class Vehicle extends Cars {

    public Vehicle(String color, String manufacturer, Integer year, Integer price) {
        super(color, manufacturer, year, price);

    }

        public void VehicleDetails() {
            super.VehicleDetails(manufacturer,year);
        }
       
    
}