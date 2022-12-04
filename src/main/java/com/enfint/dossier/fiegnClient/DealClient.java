package com.enfint.dossier.fiegnClient;

import com.enfint.dossier.dto.ApplicationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "dealClient",url = "http://localhost:8082/deal/admin/application")
public interface DealClient {

    @PostMapping("/{applicationId}/status")
    void updateApplicationStatus(@PathVariable("applicationId") Long applicationId);

    @GetMapping("/{applicationId}")
    ApplicationDTO getApplicationById(@PathVariable("applicationId") Long applicationId);

}
