package kidneyFailure.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

import kidneyFailure.ExpertSystem.Patient;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PatientRegister extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField id;
	private JTextField age;
	private JButton btnRegister;

	/**
	 * Create the frame.
	 */
	public PatientRegister(KieServices ks, KieContainer kc) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!name.getText().isEmpty() && !id.getText().isEmpty() && !age.getText().isEmpty()) {
					btnRegister.setEnabled(true);
				} else {
					btnRegister.setEnabled(false);
				}
			}
		});
		name.setBounds(132, 60, 215, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		id = new JTextField();
		id.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!name.getText().isEmpty() && !id.getText().isEmpty() && !age.getText().isEmpty()) {
					btnRegister.setEnabled(true);
				} else {
					btnRegister.setEnabled(false);
				}
			}
		});
		id.setColumns(10);
		id.setBounds(132, 91, 215, 20);
		contentPane.add(id);
		
		JComboBox sex = new JComboBox();
		sex.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		sex.setMaximumRowCount(2);
		sex.setBounds(132, 153, 74, 22);
		contentPane.add(sex);
		
		age = new JTextField();
		age.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!name.getText().isEmpty() && !id.getText().isEmpty() && !age.getText().isEmpty()) {
					btnRegister.setEnabled(true);
				} else {
					btnRegister.setEnabled(false);
				}
			}
		});
		age.setColumns(10);
		age.setBounds(132, 122, 74, 20);
		contentPane.add(age);
		
		JCheckBox isBlackRace = new JCheckBox("Check for affirmation");
		isBlackRace.setBounds(185, 193, 163, 23);
		contentPane.add(isBlackRace);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(75, 66, 47, 14);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(75, 97, 47, 14);
		contentPane.add(lblId);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(75, 128, 47, 14);
		contentPane.add(lblAge);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setBounds(75, 161, 47, 14);
		contentPane.add(lblSex);
		
		JLabel lblBlackRace = new JLabel("Black Race :");
		lblBlackRace.setBounds(75, 197, 91, 14);
		contentPane.add(lblBlackRace);
		
		btnRegister = new JButton("Register");
		btnRegister.setEnabled(false);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Patient patient = new Patient();
					patient.setName(name.getText());
					patient.setId(Integer.parseInt(id.getText()));
					patient.setAge(Integer.parseInt(age.getText()));
					if(sex.getSelectedItem().toString().equalsIgnoreCase("female")) {
						patient.setSex("female");
					} else {
						patient.setSex("male");
					}
					if(isBlackRace.isSelected()) {
						patient.setIsBlackRace(true);
					} else {
						patient.setIsBlackRace(false);
					}
					
					JOptionPane.showMessageDialog(PatientRegister.this, "Register successfull", "Message",
							JOptionPane.PLAIN_MESSAGE);
					//System.out.println(patient);
					JFrame patientDiagnosis = new PatientDiagnosis(ks, kc, PatientRegister.this, patient);
					patientDiagnosis.setVisible(true);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(PatientRegister.this, "Invalid id or age - Must be integer type", "Message",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnRegister.setBounds(354, 236, 106, 30);
		contentPane.add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("Patient Registration");
		lblNewLabel.setBounds(10, 11, 129, 20);
		contentPane.add(lblNewLabel);
	}
}
