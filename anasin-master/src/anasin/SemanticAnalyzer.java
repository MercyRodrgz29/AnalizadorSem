package semantic.analyzer;

public class SemanticAnalyzer {
    private SymbolTable symbolTable;

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void analyze(ASTNode root) throws SemanticException {
        checkNode(root);
    }

    private void checkNode(ASTNode node) throws SemanticException {
        if (node.getType().equals("variable_declaration")) {
            String varName = node.getValue();
            if (symbolTable.containsSymbol(varName)) {
                throw new SemanticException("Variable " + varName + " ya declarada.");
            } else {
                symbolTable.addSymbol(varName, new Symbol(node.getType(), null));
            }
        }

        for (ASTNode child : node.getChildren()) {
            checkNode(child);
        }
    }
}
