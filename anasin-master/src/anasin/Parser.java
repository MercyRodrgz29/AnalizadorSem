package semantic.analyzer;

public class Parser {
    public ASTNode parse(String code) {
        ASTNode root = new ASTNode("program", "");

        String[] lines = code.split("\n");
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("int ")) {
                String varName = line.substring(4, line.indexOf(';')).trim();
                ASTNode varDecl = new ASTNode("variable_declaration", varName);
                varDecl.addChild(new ASTNode("type", "int"));
                varDecl.addChild(new ASTNode("name", varName));
                root.addChild(varDecl);
            }
        }

        return root;
    }
}
