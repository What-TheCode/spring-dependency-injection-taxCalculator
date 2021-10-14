import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import taxCalculator.TaxCalculator;

@ComponentScan(basePackages = {"taxCalculator", "taxCalculation"})
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
        TaxCalculator taxCalculator = context.getBean(TaxCalculator.class);

        System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(23000));
    }

}
