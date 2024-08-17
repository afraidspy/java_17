public class Bear {
    enum FOOD {
        BERRIES {
            @Override
            public boolean isHealthy() { return true; }
        },
        INSECTS {
            @Override
            public boolean isHealthy() { return true; }
        },
        FISH {
            @Override
            public boolean isHealthy() { return true; }
        },
        ROOTS {
            @Override
            public boolean isHealthy() { return true; }
        },
        COOKIES {
            @Override
            public boolean isHealthy() { return false; }
        },
        HONEY {
            @Override
            public boolean isHealthy() { return false; }
        };

        public abstract boolean isHealthy();
    }

    public static void main(String[] args) {
        System.out.println(FOOD.INSECTS);           // Imprime: INSECTS
        System.out.println(FOOD.INSECTS.ordinal()); // Imprime: 1
        System.out.println(FOOD.INSECTS.isHealthy());// Imprime: true
        System.out.println(FOOD.COOKIES.isHealthy());// Imprime: false
    }
}
