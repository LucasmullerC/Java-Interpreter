package main;

public enum TokenTypes {

    IDENTIFICADOR(10),
    DIFERENTE(11),
    MENOR_IGUAL(12),
    MENOR(13),
    MAIOR_IGUAL(14),
    MAIOR(15),
    ABRE_PARENTESES(16),
    FECHA_PARENTESES(17),
    ABRE_CHAVE(18),
    FECHA_CHAVE(19),
    VIRGULA(20),
    PONTO_VIRGULA(21),
    SOMA(22),
    SUBTRACAO(23),
    MULTIPLICACAO(24),
    IGUAL(25),
    ATRIBUICAO(26),
    DIVISAO(27),
    EOF(28),
    INT(29),
    FLOAT(30),
    CHAR(31),
    ASPAS(32),
    ABRE_COLCHETE(33),
    FECHA_COLCHETE(34),
    AND(36),
    OR(37);
    // falta adicionar main,if,else...etc

    public final int valor;

    TokenTypes(int valor) {
        this.valor = valor;
    }

    public int getNumber() {
        return this.valor;
    }

}
