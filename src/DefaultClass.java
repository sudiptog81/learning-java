public class DefaultClass {
    public static void main(String[] args) {
        Function function = new Function("Function");
        function.simpleMethod();
        function.greet();

        Function dumbFunction = new Function("Dumb Function");
        dumbFunction.greet();
    }
}
