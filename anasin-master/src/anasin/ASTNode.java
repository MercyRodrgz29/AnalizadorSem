package semantic.analyzer;

import java.util.ArrayList;
import java.util.List;

public class ASTNode {
    private String type;
    private String value;
    private List<ASTNode> children;

    public ASTNode(String type, String value) {
        this.type = type;
        this.value = value;
        this.children = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public List<ASTNode> getChildren() {
        return children;
    }
}
