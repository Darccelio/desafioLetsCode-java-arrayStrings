package com.letscode.lista_convidados.service;

import com.letscode.lista_convidados.utils.Impressora;
import com.letscode.lista_convidados.utils.Leitor;

public class Operacoes {

    private static final int TAM = 5;
    private static String[] listaConvidados = new String[TAM];
    private static String maiorNome = "";

    public static void armazenarConvidados() {
        for(int i=0; i<TAM; i++) {
            Impressora.imprimirMensagemConvidado();
            listaConvidados[i] = Leitor.receberListaConvidados();
        }
    }

    public static void maiorString() {
        maiorNome = listaConvidados[0];
        for(int i=0; i<TAM; i++) {
            if(maiorNome.length() < listaConvidados[i].length()) {
                maiorNome = listaConvidados[i];
            }
        }
        Impressora.imprimirMaiorNome(maiorNome);
    }



}
