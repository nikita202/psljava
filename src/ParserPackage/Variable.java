package ParserPackage;

public class Variable extends JSONToString {
    private Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Variable(Value value) {
        this.value = value;
    }

    public Value get(String key) throws Exception {
        return value.get(key);
    }

    public Value put(String key, Value value) throws Exception {
        return this.value.put(key, value);
    }
}
