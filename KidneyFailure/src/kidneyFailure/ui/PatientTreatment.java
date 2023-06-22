package kidneyFailure.ui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import kidneyFailure.ExpertSystem.Diagnosis;
import kidneyFailure.ExpertSystem.Treatment;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;

public class PatientTreatment extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PatientTreatment(JFrame patientDiagnosis, Diagnosis diagnosis) {
		patientDiagnosis.setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Diagnosis");
		lblNewLabel_1.setBounds(10, 11, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Treatments");
		lblNewLabel_1_1.setBounds(10, 223, 99, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(diagnosis.getAnalytics().toString());
		lblNewLabel_1_2.setBounds(40, 71, 534, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Renal insufficiency index : " + diagnosis.getRenalInsufficiencyIndex());
		lblNewLabel_1_3.setBounds(40, 135, 237, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Glomerular filtration rate : " + diagnosis.getGfr());
		lblNewLabel_1_3_3.setBounds(40, 110, 237, 14);
		contentPane.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Renal insufficiency risk : " + diagnosis.getFailureRisk());
		lblNewLabel_1_3_1.setBounds(40, 160, 327, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Renal insufficiency type : " + diagnosis.getRenalInsufficiencyType());
		lblNewLabel_1_3_2.setBounds(40, 185, 428, 14);
		contentPane.add(lblNewLabel_1_3_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(91, 262, 428, 95);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultTableModel model = new DefaultTableModel() {
			public boolean isCellEditable(int fil, int col) {
				return false;
			}
		};
		table.setAutoCreateRowSorter(true);
		model.addColumn("Description");
		
		for(Treatment t : diagnosis.getTreatments()) {
			Object[] data = new Object[] { t.getDescription()};
			model.addRow(data);
		}
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(diagnosis.getPatient().toString());
		lblNewLabel_1_2_1.setBounds(40, 46, 582, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
	}
}
