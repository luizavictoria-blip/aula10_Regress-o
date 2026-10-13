package br.edu.ifpb;

public class SaqueService {

    public boolean podeSacar(int valor){
        //maior igual a 10; menor = 2000; nota de 10
        return ((valor>=10)
                && (valor<=2000)
                && (valor %10 == 0));
    }
}
