package kidneyFailure.ExpertSystem;

import javax.swing.JFrame;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

import kidneyFailure.ui.PatientRegister;

public class App {
	
	public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        
        JFrame frame = new PatientRegister(ks, kc);
		frame.setVisible(true);
		
	}

}
