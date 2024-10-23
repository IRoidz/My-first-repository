public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String web) {
        System.out.println("browsing: " + web);
    }

    public String findPosition() {
        return "random gps location";
    }

    @Override
    public void call(String number) {
        if (number.charAt(0) == '0' && number.charAt(1) == '0') {
            System.out.println("Calling " + number + " through the internet to save money.");
        } else {
            super.call(number);
        }
    }

}
