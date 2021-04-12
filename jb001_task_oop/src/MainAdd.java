import address.Address;

public class MainAdd {
    public static void main(String[] args) {
        Address myAddress = new Address();

        myAddress.setIndex(27507);
        myAddress.setCountry("Ukraine");
        myAddress.setCity("Kremenchug");
        myAddress.setStreet("Shevchenka");
        myAddress.setHouse(34);
        myAddress.setApartment(5);

        System.out.print("My full address is: \n");
        System.out.println("index: " + myAddress.getIndex());
        System.out.println("country: " + myAddress.getCountry());
        System.out.println(("city: " + myAddress.getCity()));
        System.out.println(("street: " + myAddress.getStreet()));
        System.out.println(("house: " + myAddress.getHouse()));
        System.out.println(("apartment: " + myAddress.getApartment()));
    }
}
