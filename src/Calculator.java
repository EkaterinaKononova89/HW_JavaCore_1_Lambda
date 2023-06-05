import java.util.function.*;

public class Calculator {


    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devideNew = (x, y) -> {
        // Вариант 1
        try {
            return x / y;
        } catch (ArithmeticException exception) {
            System.out.print("ОШИБКА: Деление на ноль ");
        }
        return y; //?????? код выше вылавливает ошибку, но что тогда должно быть в return?
    };
        // Вариант 2
//        if (y == 0) { // выдает ошибку, программа "умирает"
//            throw new ArithmeticException ("Деление на ноль");
//        } else {
//            return  x / y;
//        }
//    };

        // Вариант 3
//    if (y == 0) {
//        System.out.print ("Невозможно выполнить действие. Деление на ");
//        } else {
//            return  x / y;
//        }
//        return y;
//    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
