package main.java;

public enum Calculator {
    PLUS("+") {
        double apply(int x, int y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(int x, int y) {
            return x - y;
        }
    },
    TIMES("*") {
        double apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(int x, int y) {
            return (double)x / y;
        }
    };
    private final String symbol;
    Calculator(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
    abstract double apply(int x, int y);
}
