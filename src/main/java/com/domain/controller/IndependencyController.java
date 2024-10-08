package com.domain.controller;

import java.time.Period;
import java.util.Optional;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.Country;
import com.domain.models.CountryResponse;
import com.domain.repositories.CountryRepository;
import com.domain.util.DiferenciaEntreFechas;

@RestController()
public class IndependencyController {

    CountryResponse countryResponse;
    Optional<Country> country;
    CountryRepository countryRepository;
    DiferenciaEntreFechas diferenciaEntreFechas;

    public IndependencyController(CountryRepository countryRepository,DiferenciaEntreFechas diferenciaEntreFechas) {
        this.countryRepository = countryRepository;
        this.diferenciaEntreFechas = diferenciaEntreFechas;
    }
    
    @GetMapping(path = "/product")
    public List<Country> getAllProducts() {
        return (List<Country>) countryRepository.findAll();

    }

    @GetMapping(path = "/product/{productId}")
    public ResponseEntity<CountryResponse> getCountryDetails(@PathVariable("productId") String countryId) {
        country = Optional.of(new Country());
        countryResponse = new CountryResponse();
        country = Optional.ofNullable(countryRepository.findCountryByIsoCode(countryId.toUpperCase()));

        if (country.isPresent()) {
            Period period = diferenciaEntreFechas.calculateYearsOfIndependency(country.get().getproductIssueDate());
            countryResponse.setClientName(country.get().getClientName());
            countryResponse.setProductName(country.get().getProductName());
            countryResponse.setProductLine(country.get().getProductLine());
            countryResponse.setIssueDate(country.get().getproductIssueDate());
            /*  
            countryResponse.setDayssOfIndependency(period.getDays());
            countryResponse.setMonthsOfIndependency(period.getMonths());
            countryResponse.setYearsOfIndependency(period.getYears());
            */
        }
        return ResponseEntity.ok(countryResponse);
    }
}