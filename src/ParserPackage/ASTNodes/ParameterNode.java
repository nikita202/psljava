package ParserPackage.ASTNodes;

import ParserPackage.Collection;

public class ParameterNode extends Node {
    private String name;
    private Node defaultValue;
    private boolean expanded;
    @Override
    public String getType() {
        return "parameter";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Node defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
