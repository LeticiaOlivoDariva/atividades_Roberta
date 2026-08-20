import java.util.*;

public class NaoLeTudo {
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
        String[] texto= new String[quantFuncionarios];  
        //TECLADO.nextLine();
        for (int i = 0; i < quantFuncionarios; i++) {
            soma=0;
            texto[i]=TECLADO.nextLine();
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
