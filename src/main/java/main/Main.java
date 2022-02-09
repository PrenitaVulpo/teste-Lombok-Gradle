package main;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Conta conta = Conta.builder()
                .numero("123")
                .saldo(BigDecimal.ZERO)
                .titular("zezo")
                .build();

        System.out.println(conta.toString());
    }
}
