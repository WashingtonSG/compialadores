package cida;

import java.util.ArrayList;

enum Category {
	ALTERABLE,
	UNATERABLE,
	DECLARACAO,
	COMANDO
}

enum Type {
	NUMBER,
	SYMBOL,
	ANSWER,
	VECTOR,
	VECTOR_SYMBOL
}

public class Entry {

	int hashIndex; // Posicao no vetor
	String id; // nome da variavel
	Type type; // Tipo de armazenamento do indentificador
	Boolean defined; // Se o Identificador foi inicializado ou nao
	Category category; // Indica se eh var, const, funcao ou procedimento
	int dimension; // Indica se é um array( > 1) ou nao( = 0)

	// Construtor geral
	Entry(String id, Type type, Boolean defined, Category category, int dimension) {
		this.id = id;
		this.type = type;
		this.defined = defined;
		this.category = category;
		this.dimension = dimension;
	}

	public void setPosicao(int hashIndex) {
		this.hashIndex = hashIndex;
	}

	// posicao id tipo definido? parametros categoria
	public String toString() {
		return "(HashIndex: " + hashIndex + ", Id: " + id + ", Tipo: " + type + ", Definido: " + defined
				+ ", Categoria: " + category + ", Dimencao:"
				+ dimension + ")";
	}

}
