package ExercicioInterfaces.services.impl;

import ExercicioInterfaces.entities.Contract;
import ExercicioInterfaces.entities.Installment;
import ExercicioInterfaces.services.ContractService;
import ExercicioInterfaces.services.OnlinePaymentService;

import java.time.LocalDate;

public class ContractServiceImpl implements ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractServiceImpl(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    @Override
    public void processContract(Contract contract, Integer months) {

        LocalDate startDate = contract.getDate();
        Double baseAmountPerMonth  = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {

            LocalDate dueDate = startDate.plusMonths(i);

            Double interest = onlinePaymentService.interest(baseAmountPerMonth, i);
            Double amountWithInterest = baseAmountPerMonth + interest;

            Double fee = onlinePaymentService.paymentFee(amountWithInterest);
            Double totalInstallmentAmount = amountWithInterest + fee;

            Installment installment = new Installment(dueDate, totalInstallmentAmount);

            contract.addInstallment(installment);
        }
    }
}
