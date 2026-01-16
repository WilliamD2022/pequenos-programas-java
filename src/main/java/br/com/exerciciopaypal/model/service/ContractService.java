package br.com.exerciciopaypal.model.service;


import br.com.exerciciopaypal.model.entities.Contract;
import br.com.exerciciopaypal.model.entities.Installment;

import java.time.LocalDate;
import java.util.List;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicQuota + paymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + paymentService.paymentFee(updatedQuota);
            LocalDate dueDate = contract.getDate().plusMonths(i);

            contract.addInstallment(new Installment(dueDate, fullQuota));
        }


    }
}

