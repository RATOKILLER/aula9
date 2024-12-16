import java.util.Stack;

public class invertePalavra {

    public static String inverterPalavras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return "";
        }

        String[] palavras = frase.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }
            resultado.append(" ");
        }
        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        System.out.println("Frase 1 Original: " + frase1);
        System.out.println("Frase 1 Invertida: " + inverterPalavras(frase1));

        System.out.println("\nFrase 2 Original: " + frase2);
        System.out.println("Frase 2 Invertida: " + inverterPalavras(frase2));
    }
}
