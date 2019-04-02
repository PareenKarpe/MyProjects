/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analysis;

import Business.Baseline;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.SoilTestWorkRequest;
import Business.WorkQueue.WaterTestingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author cc130tx
 */
public class PopulateChart {
    private Baseline base = new Baseline();
    
    public ChartFrame populatePieChart(Enterprise enterprise, Double pollutant1, Double pollutant2, Double pollutatnt3, Double pollutant4, Double  pollutatnt5)
    {
        DefaultPieDataset dataset = new DefaultPieDataset();
          //dataset.setValue("One", new Integer(10)); vi 
        
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("soil"))
        {
            dataset.setValue("PVC", pollutant1);
            dataset.setValue("Aluminium",pollutant2);
            dataset.setValue("HydroCarbons",pollutatnt3 );
            dataset.setValue("DDT",pollutant4 );
            dataset.setValue("PCBS",pollutatnt5 );

            JFreeChart chart = ChartFactory.createPieChart("Analysis", dataset, true, true, true);
            PiePlot P = (PiePlot)chart.getPlot();
              //P.setForegroundAlpha(TOP_ALIGNMENT);
            ChartFrame frame = new ChartFrame("Pie Chart",chart);
            frame.setSize(400,450);
            frame.setVisible(true);
            frame.setVisible(false);
            return frame;
        }
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Water"))
        {
            dataset.setValue("Lead", pollutant1);
            dataset.setValue("Mercury",pollutant2);
            dataset.setValue("CrudeOil",pollutatnt3 );
            dataset.setValue("Uranium",pollutant4 );
            dataset.setValue("Plastic",pollutatnt5 );
            
            JFreeChart chart = ChartFactory.createPieChart("Analysis", dataset, true, true, true);
            PiePlot P = (PiePlot)chart.getPlot();
              //P.setForegroundAlpha(TOP_ALIGNMENT);
            ChartFrame frame = new ChartFrame("Pie Chart",chart);
            frame.setSize(400,450);
            frame.setVisible(true);
            frame.setVisible(false);
            return frame;
        }
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("air"))
        {
            dataset.setValue("CarbonMonoxide", pollutant1);
            dataset.setValue("Ozone",pollutant2);
            dataset.setValue("RSPM",pollutatnt3 );
            dataset.setValue("Nitrogen Oxide",pollutant4 );
            dataset.setValue("Sulphur Oxide",pollutatnt5 );

            JFreeChart chart = ChartFactory.createPieChart("Analysis", dataset, true, true, true);
            PiePlot P = (PiePlot)chart.getPlot();
              //P.setForegroundAlpha(TOP_ALIGNMENT);
            ChartFrame frame = new ChartFrame("Pie Chart",chart);
            frame.setSize(400,450);
            frame.setVisible(true);
            frame.setVisible(false);
            return frame;
        }
        
        return null;
    }
    
    
    // Generate Bar Graph
    // Generate Bar Graph
    public ChartFrame populateBarGraph(Network network, Enterprise enterprise, WorkRequest request1)
    {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
            if(enterprise.getName().equalsIgnoreCase("Water")){
                dataset = generateBarChartforWater(dataset, request1);
            }   
            else if(enterprise.getName().equalsIgnoreCase("Soil")){
                dataset = generateBarChartforSoil(dataset, request1);
            }
            else if(enterprise.getName().equalsIgnoreCase("Air")){
                dataset= generateBarChartforAir(dataset, request1);
            }

             JFreeChart chart = ChartFactory.createBarChart3D("Report Comaparison with last reading", "Pollutants", "Severity", dataset, PlotOrientation.VERTICAL, true, true, false);
                CategoryPlot plot = (CategoryPlot)chart.getPlot();
                plot.setRangeGridlinePaint(Color.BLACK);

                ChartFrame frame = new ChartFrame("Bar Chart comparison",chart, true);
                frame.setSize(400,450);
                frame.setVisible(true);
                frame.setVisible(false);
                ChartPanel panel = new ChartPanel(chart);
//                reportPanel.removeAll();
//                reportPanel.add(panel);
//                reportPanel.updateUI();
                return frame;
    }
    
    public DefaultCategoryDataset generateBarChartforWater(DefaultCategoryDataset dataset, WorkRequest request1){
        WaterTestingWorkRequest waterReq1 = (WaterTestingWorkRequest)request1;
//        WaterTestingWorkRequest waterReq2 = (WaterTestingWorkRequest)request2;
        
                dataset.setValue(waterReq1.getLeadReading(), "CurrentRequest", "Lead");
                dataset.setValue(waterReq1.getMercuryReading(), "CurrentRequest", "Mercury");
                dataset.setValue(waterReq1.getCrudeOilReading(), "CurrentRequest", "CrudeOil");
                dataset.setValue(waterReq1.getPlasticReading(), "CurrentRequest", "Plastic");
                dataset.setValue(waterReq1.getUraniumReading(), "CurrentRequest", "Uranium");

                dataset.setValue(base.getBaseLead(), "PreviousRequest", "Lead");
                dataset.setValue(base.getBaseMercury(), "PreviousRequest", "Mercury");
                dataset.setValue(base.getBaseCrude(), "PreviousRequest", "CrudeOil");
                dataset.setValue(base.getBasePlastic(), "PreviousRequest", "Plastic");
                dataset.setValue(base.getBaseUranium(), "PreviousRequest", "Uranium");
                
            return dataset;
    }
    
    //GENERATE BAR CHART FOR SOIL
    public DefaultCategoryDataset generateBarChartforSoil(DefaultCategoryDataset dataset, WorkRequest request1){
        SoilTestWorkRequest soilReq1 = (SoilTestWorkRequest)request1;
//        SoilTestWorkRequest soilReq2 = (SoilTestWorkRequest)request2;
        
                dataset.setValue(soilReq1.getPvc(), "CurrentRequest", "PVC");
                dataset.setValue(soilReq1.getDdt(), "CurrentRequest", "DDT");
                dataset.setValue(soilReq1.getAluminium(), "CurrentRequest", "Aluminium");
                dataset.setValue(soilReq1.getHydrocarbons(), "CurrentRequest", "HydroCarbons");
                dataset.setValue(soilReq1.getPcbs(), "CurrentRequest", "PCB");

                dataset.setValue(base.getBasePVC(), "PreviousRequest", "PVC");
                dataset.setValue(base.getBaseDDT(), "PreviousRequest", "DDT");
                dataset.setValue(base.getBaseAluminium(), "PreviousRequest", "Aluminium");
                dataset.setValue(base.getBaseHydrocarbons(), "PreviousRequest", "HydroCarbons");
                dataset.setValue(base.getBasePCBS(), "PreviousRequest", "PCB");
                
            return dataset;
    }
    
    //GENERATE BAR CHART FOR AIR 
     public DefaultCategoryDataset generateBarChartforAir(DefaultCategoryDataset dataset, WorkRequest request1){
        LabTestWorkRequest airReq1 = (LabTestWorkRequest)request1;
//        LabTestWorkRequest airReq2 = (LabTestWorkRequest)request2;
        
                dataset.setValue(airReq1.getResultAirOzone(), "CurrentRequest", "Ozone");
                dataset.setValue(airReq1.getResultAirCarbonM(), "CurrentRequest", "CarbonMonoOxide");
                dataset.setValue(airReq1.getResultAirNitrogenO(), "CurrentRequest", "NitrogenOxide");
                dataset.setValue(airReq1.getResultAirRspm(), "CurrentRequest", "RSPM");
                dataset.setValue(airReq1.getResultAirSulphurO(), "CurrentRequest", "Sulphur");
                
                dataset.setValue(base.getBaseAirOzone(), "PreviousRequest", "Ozone");
                dataset.setValue(base.getBaseAirCarbonM(), "PreviousRequest", "CarbonMonoOxide");
                dataset.setValue(base.getBaseAirNitrogenO(), "PreviousRequest", "NitrogenOxide");
                dataset.setValue(base.getBaseAirRspm(), "PreviousRequest", "RSPM");
                dataset.setValue(base.getBaseAirSulphurO(), "PreviousRequest", "Sulphur");
                
            return dataset;
    }

}
