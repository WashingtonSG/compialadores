package cida;

import java.util.ArrayList;

import cida.Constants;
import cida.Entry;

public class HashTable {
	private ArrayList<Entry>[] table = new ArrayList[Constants.SIZE];
	private final int scope; // Posicao da tabela na pilha

	public int getScope() {
		return scope;
	}

	HashTable(int scope) {
		this.scope = scope;
		for (int i = 0; i < Constants.SIZE; i++) {
			table[i] = new ArrayList<Entry>(1);
		}
	}

	// Calcula o hash de um Id
	static int hash(String palavra) {
		int temp = 0;
		for (int i = 0; i < palavra.length(); i++) {
			temp = ((temp << Constants.SHIFT) + (int) palavra.charAt(i)) % Constants.SIZE;
		}
		return temp;
	}

	// Busca um id na tabela Hash
	HashSearchResult get(String id) {
		int hashIndex = HashTable.hash(id);

		ArrayList<Entry> result = table[hashIndex];

		try {
			for (int i = result.size() - 1; i >= 0; i--) {
				Entry elem = result.get(i);
				if (elem.id.equals(id)) {
					return new HashSearchResult(elem, scope, hashIndex, i);
				}
			}

			return null;
		} catch (Exception e) {
			return null;
		}

	}

	// Insere uma nova entrada na tabela Hash
	void insert(Entry identificador) {
		int chave = hash(identificador.id);
		identificador.setPosicao(chave);
		table[chave].add(identificador);
		System.out.println("Identificador criado: %s".formatted(identificador.toString()));
	}

	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i < Constants.SIZE; i++) {
			out += "" + i + ": ";
			out += table[i % Constants.SIZE] + "\n";
		}
		return out;
	}
}

class HashSearchResult {
	public Entry identificador; // Entrada na tabela
	public int scope; // Posicao da tabela na pilha
	public int hashIndex; // Posicao da entrada na tabela
	public int listIndex; // Posicao da entrada na lista encadeada

	public HashSearchResult(Entry identificador, int scope, int hashIndex, int listIndex) {
		this.identificador = identificador;
		this.scope = scope;
		this.hashIndex = hashIndex;
		this.listIndex = listIndex;
	}

	@Override
	public String toString() {
		return "-------------\nidentificador: %s\nscope: %d\nhashIndex: %d\nlistIndex: %d\n-------------\n"
				.formatted(this.identificador.toString(), scope, hashIndex, listIndex);
	}
}
