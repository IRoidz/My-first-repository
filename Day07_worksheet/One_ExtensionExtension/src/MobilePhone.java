public class MobilePhone extends OldPhone{

    private String[] numbersCalled = new String[10];
    private int index = 0;

    public MobilePhone(String brand) {
        super(brand);
    }

    public void ringAlarm(String alarm) {
        System.out.println("Ring alarm: " + alarm);
    }

    public void playGame(String game) {
        System.out.println("playing game: " + game);
    }

    @Override
    public void call(String number) {
        super.call(number);

        if (numbersCalled.length == 10) {
            numbersCalled[index] = number;
            index = (index + 1) % 10;
        }
    }

    public void printLastNumbers() {
        System.out.println("last 10 numbers called: ");
        for (String s : numbersCalled) {
            if (s == null) {
                continue;
            }
            System.out.println(s);
        }
    }
}
