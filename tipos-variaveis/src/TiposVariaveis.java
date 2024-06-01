public class TiposVariaveis {
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        @SuppressWarnings("unused")
        short numeroCurto2 = (short) numeroNormal;

    }

}
