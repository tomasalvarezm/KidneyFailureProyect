package kidneyFailure.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import kidneyFailure.ExpertSystem.Analytics;
import kidneyFailure.ExpertSystem.Diagnosis;
import kidneyFailure.ExpertSystem.Patient;
import kidneyFailure.ExpertSystem.Symptom;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class PatientDiagnosis extends JFrame {

	private JPanel contentPane;
	private JTextField serumCreatinine;
	private JTextField albumin_creatinine;
	private JTextField urea;
	private JButton diagnose;

	/**
	 * Create the frame.
	 */
	public PatientDiagnosis(KieServices ks, KieContainer kc, JFrame patientRegister, Patient patient) {
		patientRegister.setEnabled(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Patient : " + patient.getName());
		lblNewLabel.setBounds(10, 11, 268, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Analytics results");
		lblNewLabel_1.setBounds(10, 49, 99, 14);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Symptoms");
		lblNewLabel_1_1.setBounds(10, 194, 78, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Serum creatinine level :");
		lblNewLabel_2.setBounds(42, 91, 155, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Albumin creatinine ratio :");
		lblNewLabel_2_1.setBounds(42, 122, 155, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("urea level :");
		lblNewLabel_2_1_1.setBounds(42, 153, 155, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("mg/dL");
		lblNewLabel_2_1_1_1.setBounds(318, 156, 38, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("mg/g");
		lblNewLabel_2_1_1_1_1.setBounds(318, 125, 38, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("mg/dL");
		lblNewLabel_2_1_1_1_2.setBounds(318, 94, 38, 14);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		serumCreatinine = new JTextField();
		serumCreatinine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!serumCreatinine.getText().isEmpty() && !albumin_creatinine.getText().isEmpty() && !urea.getText().isEmpty()) {
					diagnose.setEnabled(true);
				} else {
					diagnose.setEnabled(false);
				}
			}
		});
		serumCreatinine.setBounds(214, 91, 66, 20);
		contentPane.add(serumCreatinine);
		serumCreatinine.setColumns(10);
		
		albumin_creatinine = new JTextField();
		albumin_creatinine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!serumCreatinine.getText().isEmpty() && !albumin_creatinine.getText().isEmpty() && !urea.getText().isEmpty()) {
					diagnose.setEnabled(true);
				} else {
					diagnose.setEnabled(false);
				}
			}
		});
		albumin_creatinine.setColumns(10);
		albumin_creatinine.setBounds(214, 122, 66, 20);
		contentPane.add(albumin_creatinine);
		
		urea = new JTextField();
		urea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!serumCreatinine.getText().isEmpty() && !albumin_creatinine.getText().isEmpty() && !urea.getText().isEmpty()) {
					diagnose.setEnabled(true);
				} else {
					diagnose.setEnabled(false);
				}
			}
		});
		urea.setColumns(10);
		urea.setBounds(214, 153, 66, 20);
		contentPane.add(urea);
		
		JCheckBox recurrent = new JCheckBox("recurrent");
		recurrent.setToolTipText("");
		recurrent.setBounds(123, 45, 97, 23);
		contentPane.add(recurrent);
		
		JCheckBox edemaBox = new JCheckBox("edema");
		edemaBox.setBounds(42, 229, 97, 23);
		contentPane.add(edemaBox);
		
		JCheckBox hypertensionBox = new JCheckBox("hypertension");
		hypertensionBox.setBounds(42, 255, 114, 23);
		contentPane.add(hypertensionBox);
		
		JCheckBox crampsBox = new JCheckBox("cramps");
		crampsBox.setBounds(42, 281, 97, 23);
		contentPane.add(crampsBox);
		
		JCheckBox fatigueBox = new JCheckBox("fatigue");
		fatigueBox.setBounds(42, 307, 97, 23);
		contentPane.add(fatigueBox);
		
		JCheckBox nauseaBox = new JCheckBox("nausea");
		nauseaBox.setBounds(183, 229, 97, 23);
		contentPane.add(nauseaBox);
		
		JCheckBox confusionBox = new JCheckBox("confusion");
		confusionBox.setBounds(183, 255, 114, 23);
		contentPane.add(confusionBox);
		
		JCheckBox seizuresBox = new JCheckBox("seizures");
		seizuresBox.setBounds(183, 281, 97, 23);
		contentPane.add(seizuresBox);
		
		JCheckBox lackOfAppetiteBox = new JCheckBox("lack of appetite");
		lackOfAppetiteBox.setBounds(183, 307, 140, 23);
		contentPane.add(lackOfAppetiteBox);
		
		JCheckBox skinItchBox = new JCheckBox("skin itch");
		skinItchBox.setBounds(345, 229, 97, 23);
		contentPane.add(skinItchBox);
		
		JCheckBox arrhythmiaBox = new JCheckBox("arrhythmia");
		arrhythmiaBox.setBounds(345, 255, 114, 23);
		contentPane.add(arrhythmiaBox);
		
		JCheckBox vomitingBox = new JCheckBox("vomiting");
		vomitingBox.setBounds(345, 281, 97, 23);
		contentPane.add(vomitingBox);
		
		JCheckBox feverBox = new JCheckBox("fever");
		feverBox.setBounds(345, 307, 140, 23);
		contentPane.add(feverBox);
		
		diagnose = new JButton("Diagnose");
		diagnose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Analytics analytics = new Analytics();
					analytics.setSerumCreatinine(Float.parseFloat(serumCreatinine.getText()));
					analytics.setAlbumin_creatinine(Float.parseFloat(albumin_creatinine.getText()));
					analytics.setUrea(Float.parseFloat(urea.getText()));
					analytics.setRecurrent(recurrent.isSelected());
					
					Diagnosis diagnosis = new Diagnosis(patient, analytics);
					
					KieSession ksession = kc.newKieSession("kidneyKS");
					ksession.insert(patient);
			        ksession.insert(analytics);
			        ksession.insert(diagnosis);
			        
			        if(edemaBox.isSelected()) {
			        	Symptom edema = new Symptom("edema", patient.getId());
			        	ksession.insert(edema);
			        }
			        if(hypertensionBox.isSelected()) {
			        	Symptom hypertension = new Symptom("hypertension", patient.getId());
			        	ksession.insert(hypertension);
			        }
			        if(crampsBox.isSelected()) {
			        	Symptom cramps = new Symptom("cramps", patient.getId());
			        	ksession.insert(cramps);
			        }
			        if(fatigueBox.isSelected()) {
			        	Symptom fatigue = new Symptom("fatigue", patient.getId());
			        	ksession.insert(fatigue);
			        }
			        if(nauseaBox.isSelected()) {
			        	Symptom nausea = new Symptom("nausea", patient.getId());
			        	ksession.insert(nausea);
			        }
			        if(confusionBox.isSelected()) {
			        	Symptom confusion = new Symptom("confusion", patient.getId());
			        	ksession.insert(confusion);
			        }
			        if(seizuresBox.isSelected()) {
			        	Symptom seizures = new Symptom("seizures", patient.getId());
			        	ksession.insert(seizures);
			        }
			        if(lackOfAppetiteBox.isSelected()) {
			        	Symptom lackOfAppetite = new Symptom("lack of appetite", patient.getId());
			        	ksession.insert(lackOfAppetite);
			        }
			        if(skinItchBox.isSelected()) {
			        	Symptom skinItch = new Symptom("skin itch", patient.getId());
			        	ksession.insert(skinItch);
			        }
			        if(arrhythmiaBox.isSelected()) {
			        	Symptom arrhythmia = new Symptom("arrhythmia", patient.getId());
			        	ksession.insert(arrhythmia);
			        }
			        if(vomitingBox.isSelected()) {
			        	Symptom vomiting = new Symptom("vomiting", patient.getId());
			        	ksession.insert(vomiting);
			        }
			        if(feverBox.isSelected()) {
			        	Symptom fever = new Symptom("fever", patient.getId());
			        	ksession.insert(fever);
			        }
			        
			        
			        ksession.fireAllRules();
			        ksession.dispose();
			        
			        JFrame patientTreatment = new PatientTreatment(PatientDiagnosis.this, diagnosis);
			        patientTreatment.setVisible(true);
					
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(PatientDiagnosis.this, "Invalid analytics values - Must be a number", "Message",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		diagnose.setEnabled(false);
		diagnose.setBounds(487, 339, 106, 30);
		contentPane.add(diagnose);
		
		
	}
}
