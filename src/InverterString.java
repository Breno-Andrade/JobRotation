public class InverterString {

    public static void main(String[] args) {
        String original = "exemplo de string";
        String invertida = inverterString(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}
