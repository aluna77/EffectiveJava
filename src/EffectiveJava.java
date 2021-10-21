public class EffectiveJava {
    public static void main(String[] args) {
        Subway subway = Subway.getInstance();
        subway.welcomeStore();

        SnackShop cafe = SnackShop.getInstance();
        cafe.welcomeStore();

    }
}
