package cida;

import java.util.Stack;

public class TableStack {
    private Stack<HashTable> stack;

    public TableStack() {
        this.stack = new Stack<HashTable>();
        this.push();
    }

    // Adiciona uma tabela Hash a pilha
    public void push() {
        HashTable table = new HashTable(stack.size());
        stack.push(table);
        System.out.println("Tabela Hash {%d} criada com sucesso. Tamanho: %d".formatted(table.getScope(), Constants.SIZE));
        // this.printStack();
    }

    // Remove uma tabela Hash do topo pilha
    public HashTable pop() {
        HashTable removed = stack.pop();
        System.out.println("Tabela Hash {%d} removida com sucesso.".formatted(removed.getScope(), Constants.SIZE));
        this.printStack();
        return removed;
    }

    // Retorna a tabela no topo da pilha
    // public HashTable peek() {
    //     return stack.peek();
    // }

    // Insere uma nova entrada na tabela Hash no topo da pilha
    public void insert(Entry entry) {
        stack.peek().insert(entry);
        this.printStack();
    }

    // Busca e retorna uma entrada em todas as tabelas Hash da pilha
    public HashSearchResult getEntry(String id) {
        Stack<HashTable> tempStack = new Stack<HashTable>();
        tempStack.addAll(stack);

        HashSearchResult result;
        do {
            HashTable tempHashTable = tempStack.pop();
            result = tempHashTable.get(id);
        } while (!tempStack.empty() && result == null);

        if(result == null) {
            System.out.println("Valor: {%s} não encontrado nas tabelas de simbolos".formatted(id));
        }

        return result;
    }

    public void printStack() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String print = "";

        Stack<HashTable> tempStack = new Stack<HashTable>();
        tempStack.addAll(stack);

        while (!tempStack.empty()) {
            HashTable tempHashTable = tempStack.pop();
            print += "------{%d}------\n%s".formatted(tempStack.size(),tempHashTable);
        }

        return print;
    }
}
