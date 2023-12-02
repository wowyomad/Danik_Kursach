package Kursach.shared.objects;





public class ManufacturerDto {
    private int id;
    private String name;
    private Country country;

    public ManufacturerDto(int id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public ManufacturerDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return country.getCountry();
    }

    public void setCountryName(String country) {
        this.country.setCountry(country);
    }

    public int getCountryId() {
        return country.getId();
    }

    public void setCountryId(int id) {
        this.country.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
