package com.example.rate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrncRateController {
    @Autowired
    private CrncRateRepository crncRateRepository;

    /**
     * @return
     */
    @GetMapping("/crncrate")
    public List<CrncRate> getAllCrncRates() {
        return crncRateRepository.findAll();
    }
}
