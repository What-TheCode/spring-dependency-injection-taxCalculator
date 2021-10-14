package taxCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import taxCalculation.TaxCalculation;


@Component
public class TaxCalculator {

    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(@Qualifier("AmericanCalculation") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesBasedOnYearlyIncome(double yearlyIncome) {
        return this.taxCalculation.calculateTaxes(yearlyIncome);
    }

}
