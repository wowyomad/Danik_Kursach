package Kursach.shared.objects;

public class ProductDto1 {
    private int id;
    private String name;
    private double price;
    private ProductCategory category;
    private Manufacturer manufacturer;
    private Provider provider;

    public ProductDto1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return category.getId();
    }

    public void setCategoryId(int id) {
        category.setId(id);
    }

    public String getCategoryName() {
        return category.getCategory();
    }

    public void setCategoryName(String name) {
        category.setCategory(name);
    }

    public String getCategoryDifinition() {
        return category.getDefinition();
    }

    public void setCategoryDifinition(String difinition) {
        category.setDefinition(difinition);
    }

    public int getManufacturerId() {
        return manufacturer.getId();
    }

    public void setManufacturerId(int id) {
        manufacturer.setId(id);
    }

    public String getManufacturerName() {
        return manufacturer.getName();
    }

    public void setManufacturerName(String name) {
        manufacturer.setName(name);
    }

    public int getManufacturerCountryId() {
        return manufacturer.getCountryId();
    }

    public void setManufacturerCountryId(int countryId) {
        manufacturer.setCountryId(countryId);
    }

    public int getProviderId() {
        return provider.getId();
    }

    public void setProviderId(int id) {
        provider.setId(id);
    }

    public String getProviderName() {
        return provider.getName();
    }

    public void setProviderName(String name) {
        provider.setName(name);
    }

    public String getProviderEmail() {
        return provider.getEmail();
    }

    public void setProviderEmail(String email) {
        provider.setEmail(email);
    }

}
