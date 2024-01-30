package com.facilite.persistence.facilite.persitence.consumer;

import com.facilite.persistence.facilite.persitence.dto.PaymentDTO;

public interface PaymentConsumer  {
	
	public void listenerPayment(PaymentDTO message);
	
}
