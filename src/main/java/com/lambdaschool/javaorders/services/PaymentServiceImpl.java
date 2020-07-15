package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Payment;
import com.lambdaschool.javaorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentService")
public class PaymentServiceImpl implements PaymentService
{
    @Autowired
    private PaymentRepository paymentrepos;

    @Override
    public Payment save(Payment payment){
        return paymentrepos.save(payment);
    }

}
