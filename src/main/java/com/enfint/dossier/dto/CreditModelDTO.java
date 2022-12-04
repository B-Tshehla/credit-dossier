package com.enfint.dossier.dto;

import com.enfint.dossier.dataEnum.CreditStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditModelDTO {
    private Long id;
    private BigDecimal amount;
    private Integer term;
    private BigDecimal rate;
    private BigDecimal flc;
    private List<PaymentScheduleElement> paymentSchedule;
    private Boolean isInsuranceEnabled;
    private Boolean isSalaryClient;
    private CreditStatus creditStatus;

}
