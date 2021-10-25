import sandwich.Table;
import store.Store;

import java.util.List;

public class SnackShop extends Store {
    private static final SnackShop INSTANCE = new SnackShop();
    private List<String> setMenus;

    private SnackShop() {
    }

    public static SnackShop getInstance() {
        return INSTANCE;
    }

    @Override
    public void welcomeStore() {
        System.out.println("어서오세요 분식집입니다.");
        Table table = Table.valueOf(2);
        System.out.println(table.getGuestCount() + "명 입니다.");
    }
}
