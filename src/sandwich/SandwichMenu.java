package sandwich;

import java.util.Comparator;
import java.util.Objects;

public class SandwichMenu extends Sandwich implements Comparable {
    // 열거가 많다면 빌더를 사용
    public enum Size {LARGE, REGULAR}

    public enum Menu {EGG, CHICKEN, HAM, FORK}

    private final Size size;
    private final Menu menu;

    public static class Builder extends Sandwich.Builder<Builder> {
        private final Size size;
        private Menu menu;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        public Builder addMenu(Menu menu) {
            this.menu = Objects.requireNonNull(menu);
            return this;
        }

        @Override
        public SandwichMenu build() {
            return new SandwichMenu(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public SandwichMenu(Builder builder) {
        super(builder);
        this.size = builder.size;
        this.menu = builder.menu;
    }

    // toString 정의
    @Override
    public String toString() {
        return toppings + " (" + size + "," + menu + ")";
    }

    // equals 정의
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SandwichMenu))
            return false;
        SandwichMenu sandwichMenu = (SandwichMenu) obj;
        return sandwichMenu.toppings.equals(this.toppings);
    }

    private final static Comparator<SandwichMenu> COMPARATOR =
            Comparator.comparing((SandwichMenu sandwichMenu) -> sandwichMenu.size)
                    .thenComparing(sandwichMenu -> sandwichMenu.toppings.size());

    // compareTo 정의
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof SandwichMenu))
            return -1;
        return COMPARATOR.compare(this, (SandwichMenu) o);
    }

}
