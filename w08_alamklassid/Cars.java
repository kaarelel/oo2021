public abstract class Cars {
    
    String color;
    String manufacturer;
    Integer year;
    Integer price;

    public Cars(String color, String manufacturer, Integer year, Integer price) {
        this.color=color;
        this.manufacturer=manufacturer;
        this.year=year;
        this.price=price;
    }

	public void VehicleDetails(String manufacturer2, Integer year2) {
        System.out.println("Auto andmed: " + "\nVärv: " +  color + "\nTootja: " +  manufacturer + "\nLoodud " + year + " hinnaga " + price + " EUR");
	}

}