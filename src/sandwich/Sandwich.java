package sandwich;

import java.util.*;

public abstract class Sandwich {
    public enum Topping {OLIVE, PICKLE, ONION, PIMENTO, TOMATO, JALAPENOS, CUCUMBER, LETTUCE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public abstract Sandwich build();

        protected abstract T self();
    }

    // private 생성자
    private void Sandwich(){}


    public Sandwich(Builder<?> builder){
        toppings = builder.toppings.clone();
    }

}
