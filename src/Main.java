import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //ponto de partida do nosso programa
    public static void main(String[] args) {
        //Criando Lista
        ArrayList<String> nomesPessoas = new ArrayList();

        //Adicionando nomes na lista
        adicionaNaLista(nomesPessoas, "Anderson");
        adicionaNaLista(nomesPessoas, "Kaue");
        adicionaNaLista(nomesPessoas, "Paulo");

        //Imprimindo toda a lista
        System.out.println(nomesPessoas);

        //Lendo um ponto específico da lista
        System.out.println(lerLista(nomesPessoas, 0));

        //Removendo da lista e imprimindo toda a lista
        removerDaLista(nomesPessoas, 1);
        System.out.println(nomesPessoas);

        //Alterando a lista e retornando a parte alternanda para o mesmo index que foi retirado
        alterarLista(nomesPessoas,0,"João");
        System.out.println(nomesPessoas);
    }

    // Criar / Adicionar
    public static void adicionaNaLista (ArrayList<String> lista, String elemento){
        lista.add(elemento);
    }
    //Ler
    public static String lerLista(ArrayList < String > lista,int index){
        return lista.get(index);
    }
    // Remover
    public static void removerDaLista (ArrayList<String> lista, int index) {
        lista.remove(index);
    }
    //Alterar
    public static void alterarLista (ArrayList<String> lista, int index, String elemento) {
        lista.set(index, elemento);
    }
}