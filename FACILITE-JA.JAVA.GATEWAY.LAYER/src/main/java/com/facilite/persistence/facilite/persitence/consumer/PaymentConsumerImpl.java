package com.facilite.persistence.facilite.persitence.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.facilite.persistence.facilite.persitence.dto.PaymentDTO;

@Component
public class PaymentConsumerImpl implements PaymentConsumer{
	
    @RabbitListener(queues = "queuePayment")
    public void handleMessage(PaymentDTO message) {
    	listenerPayment(message);
    }

	@Override
	public void listenerPayment(PaymentDTO message) {
		
		System.out.print("Enviar o pagamento para a fila, e salvar os dados do pagamento para analises");
		
	}
}
