package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        LocalDate date = contract.getDate();
        double amount = contract.getTotalValue() / months;

        for(int i=1; i<=months; i++){
            LocalDate installmentDate = date.plusMonths(i);
            
            double interest = onlinePaymentService.interest(amount, i);
            double fee = onlinePaymentService.paymentFee(amount + interest);

            Double installmentAmount = amount + interest + fee;

            contract.getInstallments().add(new Installment(installmentDate, installmentAmount));
        }
    }
}
