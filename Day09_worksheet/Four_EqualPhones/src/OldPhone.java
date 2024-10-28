public class OldPhone implements Phone{

    /** The brand of this OldPhone. */
    private String brand;

    /**
     * Creates a new OldPhone with a given brand.
     *
     * @param the brand of this OldPhone
     */
    public OldPhone(String brand) {
        this.brand = brand;
    }

    /**
     * @return the brand of this OldPhone
     */
    public String getBrand() {
        return brand;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (!(other.getClass() == this.getClass())) {
            return false;
        }
        return this.brand.equals(((OldPhone)other).brand);
    }

    @Override
    public int hashCode() {
        return this.brand.hashCode();
    }
}
