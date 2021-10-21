import sandwich.PhoneNumber;
import sandwich.Sandwich;
import sandwich.SandwichMenu;
import store.Store;

import java.util.ArrayList;
import java.util.Collections;

public class Subway extends Store {
    //싱글턴

    private static final Subway INSTANCE = new Subway();

    public static Subway getInstance() {
        return INSTANCE;
    }

    @Override
    public void welcomeStore() {
        System.out.println("어서오세요, 서브웨이입니다~");
        ArrayList<SandwichMenu> sandwichMenus = new ArrayList<SandwichMenu>();

        SandwichMenu sandwich1 = new SandwichMenu.Builder(SandwichMenu.Size.LARGE)
                .addTopping(Sandwich.Topping.CUCUMBER)
                .addTopping(Sandwich.Topping.LETTUCE)
                .addMenu(SandwichMenu.Menu.CHICKEN)
                .build();
        sandwichMenus.add(sandwich1);

        SandwichMenu sandwich2 = new SandwichMenu.Builder(SandwichMenu.Size.REGULAR)
                .addTopping(Sandwich.Topping.LETTUCE)
                .addTopping(Sandwich.Topping.JALAPENOS)
                .addTopping(Sandwich.Topping.ONION)
                .addMenu(SandwichMenu.Menu.FORK)
                .build();
        sandwichMenus.add(sandwich2);

        SandwichMenu sandwich3 = new SandwichMenu.Builder(SandwichMenu.Size.LARGE)
                .addTopping(Sandwich.Topping.ONION)
                .addTopping(Sandwich.Topping.PICKLE)
                .addTopping(Sandwich.Topping.TOMATO)
                .addMenu(SandwichMenu.Menu.EGG)
                .build();
        sandwichMenus.add(sandwich3);

        SandwichMenu sandwich4 = new SandwichMenu.Builder(SandwichMenu.Size.LARGE)
                .addMenu(SandwichMenu.Menu.FORK)
                .build();
        sandwichMenus.add(sandwich4);

        SandwichMenu sandwich5 = new SandwichMenu.Builder(SandwichMenu.Size.REGULAR)
                .addTopping(Sandwich.Topping.PICKLE)
                .addTopping(Sandwich.Topping.OLIVE)
                .addTopping(Sandwich.Topping.PIMENTO)
                .build();
        sandwichMenus.add(sandwich5);


        SandwichMenu sandwich6 = new SandwichMenu.Builder(SandwichMenu.Size.REGULAR)
                .addTopping(Sandwich.Topping.ONION)
                .addTopping(Sandwich.Topping.JALAPENOS)
                .addTopping(Sandwich.Topping.CUCUMBER)
                .addTopping(Sandwich.Topping.TOMATO)
                .addTopping(Sandwich.Topping.LETTUCE)
                .addMenu(SandwichMenu.Menu.EGG)
                .build();
        sandwichMenus.add(sandwich6);

        System.out.println(sandwichMenus);
        Collections.sort(sandwichMenus, Collections.reverseOrder());
        System.out.println(sandwichMenus);

        System.out.println("핸드폰 번호를 입력해주세요~");

        PhoneNumber.isPhoneNumber("09876538273");
        PhoneNumber.isPhoneNumber("01098773456");
    }
}
