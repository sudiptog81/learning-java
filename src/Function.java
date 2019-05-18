class Function {
    private String _name;

    Function(String name) {
        setName(name);
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public void simpleMethod() {
        System.out.println("This is an instance of Function class");
    }

    public void greet() {
        System.out.println("Hello " + getName() + "!");
    }
}
