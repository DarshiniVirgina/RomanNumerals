package com.roman.conversion.RomanNumerals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConversionController{

    @Autowired
    ConversionService service = new ConversionService();

    @GetMapping("/roman-numerals")
	public void digitsToNumerals() {
        service.digitsToNumerals();
    }
    @GetMapping("/digits")
	public void numeralsToDigits(){
        service.numeralsToDigits();
    }


} 
