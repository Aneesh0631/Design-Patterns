package Visitor;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        FixedPrice projectA = new FixedPrice(10000);
        SupportContract projectB = new SupportContract(500);
        TimeAndMaterials projectG = new TimeAndMaterials(150,10);

        TimeAndMaterials projectD = new TimeAndMaterials(50, 50);

        List<ReportElement> projexts = List.of(projectA,projectB,projectD,projectG);

        MonthlyCostRepoert monthlyCostRepoert = new MonthlyCostRepoert();
        YearlyCostReportVisitor yearlyCostReportVisitor = new YearlyCostReportVisitor();

        long monthlyCost =0;
        long yearly =0;

        for(ReportElement project : projexts){
            monthlyCost += project.accept(monthlyCostRepoert);
            yearly += project.accept(yearlyCostReportVisitor);
        }
        System.out.println("Montly cost is " + monthlyCost);
        System.out.println("Yearly cost is " + yearly);
    }
}
