public class Adress  {
    private String Street;
    private String Zip;
    private String City;
    private String Country;

    public Adress(String street, String zip, String city, String country) {
        Street = street;
        Zip = zip;
        City = city;
        Country = country;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "Street='" + Street + '\'' +
                ", Zip='" + Zip + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
