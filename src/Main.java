public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b); // делитель b равен 0, невозможно выполнить данное действие
        int c1 = calc.devideNew.apply(a, b);

        //calc.println.accept(c);
        calc.println.accept(c1);
    }
}