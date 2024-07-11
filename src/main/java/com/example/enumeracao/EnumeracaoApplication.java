package com.example.enumeracao;

import com.example.enumeracao.entitie.Order;
import com.example.enumeracao.entities.enums.OrderStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Date;

@SpringBootApplication
public class EnumeracaoApplication {

    public static void main(String[] args) {
        // por padrão a saida do enum vai ser conforme definido na classe enum
        Order order = new Order(1080,new Date(), OrderStatus.DELIVERED);
        System.out.println(order);

        //conversão de String para enum, pois o usuario vai entrar em fomra de string o dado do enum.
        //usamos o metodo .valueOF("")
        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }

}
