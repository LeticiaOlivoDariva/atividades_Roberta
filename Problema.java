import java.util.*;

public class Problema {
    final static Scanner TECLADO= new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Integer> cargos = new HashMap<>();
        int quantPalavras=TECLADO.nextInt();
        int quantFuncionarios=TECLADO.nextInt();

        
        for (int i = 0; i < quantPalavras; i++) {
            cargos.put(TECLADO.next(), TECLADO.nextInt());
        }
        int soma=0;
        //String regex="([a-z]+\s)";
        TECLADO.nextLine();
        String tudo="";
        while(TECLADO.hasNext()){
            tudo+=TECLADO.nextLine();
        }
        String[] texto=tudo.split(".");
        System.out.println(texto.length);
        for (int i = 0; i < quantFuncionarios; i++) {
            soma=0;
            String[] palavras=texto[i].split(" ");
            // Pattern pattern = Pattern.compile(regex);
            // Matcher m = pattern.matcher(texto[i]);
            for (String palavra : palavras){
               // if(m.find()){
                    if(cargos.containsKey(palavra)){
                        soma += cargos.get(palavra);
                    }
               // }
                
            }
            System.out.println(soma);
        }

    }
}
