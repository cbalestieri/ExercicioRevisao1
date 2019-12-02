public class IntegerSet {
    public static void main(String[] args) {

        int[] conjunto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int[] conjunto2 = {120, 122, 93, 52, 11, 0, 1};

        int[] conjunto3 = {1, 2, 3, 4, 40, 51, 53};
        int[] conjunto4 = {11,22,33,44,55,66};

        int[] uniao = new int[conjunto.length + conjunto2.length];
        System.out.println(uniao);

        int[] interseccao;
        interseccao = new int[conjunto.length + conjunto3.length];

            for (int i = 0; i < conjunto.length; i++) {
                if (conjunto[i] == conjunto3[i]) {
                    System.out.println(interseccao);
                }
            }

            int [] diferenca;
            diferenca = new int[conjunto.length + conjunto4.length];

        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] != conjunto3[i]) {
                System.out.println(diferenca);
                }
            }

            int inserir;
            inserir =;
        }
    }