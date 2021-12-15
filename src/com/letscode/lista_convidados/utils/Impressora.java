package com.letscode.lista_convidados.utils;

public class Impressora {

    private final static String MENSAGEM_ENTRADA_CONVIDADOS = "Por favor, insira o " +
            "nome de um convidado .....: ";
    private final static String MENSAGEM_MAIOR_NOME = "O maior nome é .....: ";

    public static void imprimirMensagemConvidado() {
        System.out.print(MENSAGEM_ENTRADA_CONVIDADOS);
    }

    public static void imprimirMaiorNome(String nome) {
        System.out.println(MENSAGEM_MAIOR_NOME + nome);
    }

}
