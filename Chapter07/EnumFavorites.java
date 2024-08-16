public class EnumFavorites {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        /**
         *  es un método definido en la clase Enum que devuelve el índice (posición) del valor enum en la declaración.
         *  El primer valor tiene un índice de 0, el segundo un índice de 1, y así sucesivamente.
         */
        for (final var e : Flavors.values())
            System.out.print(e.ordinal() + " ");
    }
}
