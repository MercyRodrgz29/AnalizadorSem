package semantic.analyzer;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Symbol> symbols = new HashMap<>();

    public void addSymbol(String name, Symbol symbol) {
        symbols.put(name, symbol);
    }

    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }

    public boolean containsSymbol(String name) {
        return symbols.containsKey(name);
    }
}
