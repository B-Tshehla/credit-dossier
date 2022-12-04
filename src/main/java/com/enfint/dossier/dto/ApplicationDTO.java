package com.enfint.dossier.dto;

import com.enfint.dossier.dataEnum.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationDTO {
    private Long id;
    private Status status;
    private LocalDate creationDate;
    private LoanOfferDTO appliedOffer;
    private LocalDate signDate;
    private int sesCode;
    private List<ApplicationStatusHistoryDTO> statusHistory;
    private ClientDTO client;
}
