package com.sda.tallinn6.evgenii.July_6th.task2;


public class App {

    public static void main(String[] args) {
        Multiply simpleMultiplyer = new Multiply() {
            @Override
            public Integer doThis(Integer operand1, Integer operand2) {
                return operand1 * operand2;
            }
        };

        Multiply lambdaMultiplier = (operand1, operand2) -> operand1 * operand2;


        Integer result1 = simpleMultiplyer.doThis(12, 10);
        System.out.println(result1);

        Integer result2 = lambdaMultiplier.doThis(9, 11);
        System.out.println(result2);
    }

}
