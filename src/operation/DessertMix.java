package operation;

import org.junit.Test;

import java.util.*;

public enum DessertMix implements Mix {
    SHAKE("shake") {
        public String apply(String x, String y) {
            return x + y + "shake";
        }
    },
    CAKE("cake") {
        public String apply(String x, String y) {
            return x + y + "cake";
        }
    };
    private final String symbol;

    DessertMix(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    // 컬렉션 인스턴스를 이용해 확장된 열거 타입의 모든 원소를 사용하는 예 (235쪽)
    public static void main(String[] args) {
        test(Arrays.asList(DessertMix.values()), "딸기", "바나나");
        test(Arrays.asList(DessertMix.values()), "키위", "바나나");
        test(Arrays.asList(DessertMix.values()), "무화과", "바나나");

    }

    @Test
    private static void test(Collection<? extends Mix> opSet,
                             String x, String y) {
        for (Mix op : opSet)
            System.out.printf("%s( %s %s ) = %s%n",
                    op,x, y,  op.apply(x, y));
    }
}