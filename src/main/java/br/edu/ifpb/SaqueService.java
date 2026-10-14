package br.edu.ifpb;

public class SaqueService {

    public boolean podeSacar(int valor){
        //maior igual a 10; menor = 3000; nota de 10
        return ((valor>=10)
                && (valor<=3000)
                && (valor %10 == 0));
    }
}
