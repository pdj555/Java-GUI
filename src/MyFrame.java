
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox comboBox;
	JFreeChart chart = null;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		// COMBO BOX
		String[] tabs = {"--select chart--", "Unique Miners", "Transaction Cost", "Time Difference"};
		comboBox = new JComboBox(tabs);
		add(comboBox);
		comboBox.addActionListener(this);
		
		
		this.pack();
		this.setVisible(true);
		this.setTitle("Project 5 - Preston Jones");
	}


	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		String selectedChart = (String)comboBox.getSelectedItem();
		
		if (selectedChart.equals("Unique Miners")) {
			// PIE CHART
			//HashMap minerAddressAndFrequency = Blocks.calUniqMiners();
			
			DefaultPieDataset piedataset = new DefaultPieDataset();
			
			HashMap<String, Integer> mF = null;
			
			String miner = null;
			int freq = 0;
			
		
			
			try {
				mF = Blocks.calUniqMiners();
				
				for (String s : mF.keySet()) {
					miner = s;
					freq = mF.get(s);
					
					piedataset.setValue(miner, freq);
					
				}
						
			}
			catch(Exception IOException) {
				
			}
			

			chart = ChartFactory.createPieChart("Each Unique Miner and its Frequency", piedataset, true, true, false);

			add(new ChartPanel(chart));
			pack();
		}
		else if (selectedChart.equals("Transaction Cost")) {
			// LINE GRAPH
			// Create a dataset
			DefaultXYDataset datasetl = new DefaultXYDataset();
			
			Blocks block1 = null;
			Blocks block2 = null;
			Blocks block3 = null;
			Blocks block4 = null;
			Blocks block5 = null;
			Blocks block6 = null;
			Blocks block7 = null;
			Blocks block8 = null;
			Blocks block9 = null;
			Blocks block10 = null;
			Blocks block11 = null;
			Blocks block12 = null;
			Blocks block13 = null;
			Blocks block14 = null;
			Blocks block15 = null;
			
			double block1Num = 0;
			double block2Num = 0;
			double block3Num = 0;
			double block4Num = 0;
			double block5Num = 0;
			double block6Num = 0;
			double block7Num = 0;
			double block8Num = 0;
			double block9Num = 0;
			double block10Num = 0;
			double block11Num = 0;
			double block12Num = 0;
			double block13Num = 0;
			double block14Num = 0;
			double block15Num = 0;
			
			double block1ETH = 0;
			double block2ETH = 0;
			double block3ETH = 0;
			double block4ETH = 0;
			double block5ETH = 0;
			double block6ETH = 0;
			double block7ETH = 0;
			double block8ETH = 0;
			double block9ETH = 0;
			double block10ETH = 0;
			double block11ETH = 0;
			double block12ETH = 0;
			double block13ETH = 0;
			double block14ETH = 0;
			double block15ETH = 0;
			
			try {
				block1 = Blocks.getBlockByNumber(15049308);
				block2 = Blocks.getBlockByNumber(15049309);
				block3 = Blocks.getBlockByNumber(15049310);
				block4 = Blocks.getBlockByNumber(15049311);
				block5 = Blocks.getBlockByNumber(15049312);
				block6 = Blocks.getBlockByNumber(15049313);
				block7 = Blocks.getBlockByNumber(15049314);
				block8 = Blocks.getBlockByNumber(15049315);
				block9 = Blocks.getBlockByNumber(15049316);
				block10 = Blocks.getBlockByNumber(15049317);
				block11 = Blocks.getBlockByNumber(15049318);
				block12 = Blocks.getBlockByNumber(15049319);
				block13 = Blocks.getBlockByNumber(15049320);
				block14 = Blocks.getBlockByNumber(15049321);
				block15 = Blocks.getBlockByNumber(15049322);
				
				block1Num = 15049308;
				block2Num = 15049309;
				block3Num = 15049310;
				block4Num = 15049311;
				block5Num = 15049312;
				block6Num = 15049313;
				block7Num = 15049314;
				block8Num = 15049315;
				block9Num = 15049316;
				block10Num = 15049317;
				block11Num = 15049318;
				block12Num = 15049319;
				block13Num = 15049320;
				block14Num = 15049321;
				block15Num = 15049322;
				
				block1ETH = block1.avgTransactionCost();
				block2ETH = block2.avgTransactionCost();
				block3ETH = block3.avgTransactionCost();
				block4ETH = block4.avgTransactionCost();
				block5ETH = block5.avgTransactionCost();
				block6ETH = block6.avgTransactionCost();
				block7ETH = block7.avgTransactionCost();
				block8ETH = block8.avgTransactionCost();
				block9ETH = block9.avgTransactionCost();
				block10ETH = block10.avgTransactionCost();
				block11ETH = block11.avgTransactionCost();
				block12ETH = block12.avgTransactionCost();
				block13ETH = block13.avgTransactionCost();
				block14ETH = block14.avgTransactionCost();
				block15ETH = block15.avgTransactionCost();
				
				
						
			}
			catch(Exception IOException) {
				
			}
			
			double[][] data = { { block1Num, block2Num, block3Num, block4Num, block5Num, block6Num, block7Num, block8Num, block9Num, block10Num, block11Num, block12Num, block13Num, block14Num, block15Num }, // X-values
					{ block1ETH, block2ETH, block3ETH, block4ETH, block5ETH, block6ETH, block7ETH, block8ETH, block9ETH, block10ETH, block11ETH, block12ETH, block13ETH, block14ETH, block15ETH } // Y-values
			};
			datasetl.addSeries("Avg Transaction Cost", data);

			// Create the chart
			chart = ChartFactory.createXYLineChart("Transaction Cost of Blocks", // Chart title
					"Block Number", // X-axis label
					"Transaction Cost ETH", // Y-axis label
					datasetl, // Dataset
					PlotOrientation.VERTICAL, true, // Include legend
					true, // Show tooltips
					false // Configure chart to generate URLs?
			);

			add(new ChartPanel(chart));
			pack();
		}
		else if (selectedChart.equals("Time Difference")) {
			// BAR CHART
			// Create a dataset
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			Blocks block1 = null;
			Blocks block2 = null;
			ArrayList<Integer> timeDiff = null;
			int timeHr = 0;
			int timeMin = 0;
			int timeSec = 0;
			try {
				block1 = Blocks.getBlockByNumber(15049308);
				block2 = Blocks.getBlockByNumber(15049407);
				timeDiff = Blocks.timeDiff(block1, block2);
				timeHr = timeDiff.get(0);
				timeMin = timeDiff.get(1);
				timeSec = timeDiff.get(2);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String diff = block1.getNumber() + " - " + block2.getNumber();
			
			dataset.addValue(timeHr, "", "Hours");
			dataset.addValue(timeMin, "", diff);
			dataset.addValue(timeSec, "", "Seconds");
			
			try {
				block1 = Blocks.getBlockByNumber(15049308);
				block2 = Blocks.getBlockByNumber(15049407);
				timeDiff = Blocks.timeDiff(block1, block2);
				timeHr = timeDiff.get(0);
				timeMin = timeDiff.get(1);
				timeSec = timeDiff.get(2);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			diff = block1.getNumber() + " - " + block2.getNumber();
			
			dataset.addValue(timeSec, "", "Hours");
			dataset.addValue(timeSec, "", diff);
			dataset.addValue(timeSec, "", "Seconds");
			
//			try {
//				block1 = Blocks.getBlockByNumber(15049308);
//				block2 = Blocks.getBlockByNumber(15049407);
//				timeDiff = Blocks.timeDiff(block1, block2);
//				timeHr = timeDiff.get(0);
//				timeMin = timeDiff.get(1);
//				timeSec = timeDiff.get(2);
//				
//			} catch (FileNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			diff = block1.getNumber() + " - " + block2.getNumber();
//			
//			dataset.addValue(timeSec, "", "Hours");
//			dataset.addValue(timeSec, "", diff);
//			dataset.addValue(timeSec, "", "Seconds");

			// Create the chart
			chart = ChartFactory.createBarChart("Time Difference Between Blocks", // Chart title
					"Blocks", // X-axis label
					"Time Units (hrs, mins, secs)", // Y-axis label
					dataset, // Dataset
					PlotOrientation.VERTICAL, false, // Include legend
					true, // Show tooltips
					false // Configure chart to generate URLs?
			);
			
			add(new ChartPanel(chart));
			pack();
			
		}
//		else if (selectedChart.equals("--select chart--")) {
//			
//		}
		
	}
	
}
