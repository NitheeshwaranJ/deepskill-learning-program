import java.util.*;

public class FinancialForecast {
    public static List<Double> forecastRevenue(double currentRevenue, double monthlyGrowthRate, int months) {
       
        List<Double> forecast = new ArrayList<>();

        for (int i = 1; i <= months; i++) {
          
            currentRevenue += currentRevenue * (monthlyGrowthRate / 100);
            forecast.add(currentRevenue);
        }

        return forecast;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter current monthly revenue (in ₹): ");
        double revenue = scanner.nextDouble();

        
        System.out.print("Enter expected monthly growth rate (%): ");
        double growthRate = scanner.nextDouble();

        int months = 12;  
        List<Double> forecast = forecastRevenue(revenue, growthRate, months);

        System.out.println("\n📈 Revenue Forecast for Next 12 Months:");
        for (int i = 0; i < forecast.size(); i++) {
           
            System.out.printf("Month %2d: ₹%.2f\n", i + 1, forecast.get(i));
        }

        scanner.close();
    }
}
