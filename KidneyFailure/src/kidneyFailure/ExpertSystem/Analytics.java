package kidneyFailure.ExpertSystem;

public class Analytics {
	
	private float serumCreatinine;
	private float urea;
	private float albumin_creatinine;
	private Boolean recurrent;
	
	
	//CONSTRUCTORS
	
	public Analytics() {
		super();
	}

	public Analytics(float serumCreatinine, float urea, float albumin_creatinine, Boolean recurrent) {
		super();
		this.serumCreatinine = serumCreatinine;
		this.urea = urea;
		this.albumin_creatinine = albumin_creatinine;
		this.recurrent = recurrent;
	}

	
	//GETTERS AND SETTERS
	
	public float getSerumCreatinine() {
		return serumCreatinine;
	}

	public void setSerumCreatinine(float serumCreatinine) {
		this.serumCreatinine = serumCreatinine;
	}

	public float getUrea() {
		return urea;
	}

	public void setUrea(float urea) {
		this.urea = urea;
	}

	public float getAlbumin_creatinine() {
		return albumin_creatinine;
	}

	public void setAlbumin_creatinine(float albumin_creatinine) {
		this.albumin_creatinine = albumin_creatinine;
	}
	
	public Boolean getRecurrent() {
		return recurrent;
	}

	public void setRecurrent(Boolean recurrent) {
		this.recurrent = recurrent;
	}

	@Override
	public String toString() {
		return "Analytics [serumCreatinine=" + serumCreatinine + ", urea=" + urea + ", albumin_creatinine="
				+ albumin_creatinine + ", recurrent=" + recurrent + "]";
	}
	
	
}
