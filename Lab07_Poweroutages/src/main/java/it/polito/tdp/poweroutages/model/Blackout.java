package it.polito.tdp.poweroutages.model;

import java.time.LocalDateTime;

public class Blackout {

	private LocalDateTime data_inizio;
	private LocalDateTime data_fine;
	private int oreDisservizio;
	private int customersAffected;
	/**
	 * @param data_inizio
	 * @param data_fine
	 * @param oreDisservizio
	 * @param customersAffected
	 */
	public Blackout(LocalDateTime data_inizio, LocalDateTime data_fine, int oreDisservizio, int customersAffected) {
		super();
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.oreDisservizio = oreDisservizio;
		this.customersAffected = customersAffected;
	}
	public LocalDateTime getData_inizio() {
		return data_inizio;
	}
	public void setData_inizio(LocalDateTime data_inizio) {
		this.data_inizio = data_inizio;
	}
	public LocalDateTime getData_fine() {
		return data_fine;
	}
	public void setData_fine(LocalDateTime data_fine) {
		this.data_fine = data_fine;
	}
	public int getOreDisservizio() {
		return oreDisservizio;
	}
	public void setOreDisservizio(int oreDisservizio) {
		this.oreDisservizio = oreDisservizio;
	}
	public int getCustomersAffected() {
		return customersAffected;
	}
	public void setCustomersAffected(int customersAffected) {
		this.customersAffected = customersAffected;
	}
	
	@Override
	public String toString() {
		return data_fine.getYear()+" "+data_inizio.toString()+" "+data_fine.toString()+" "+oreDisservizio+" "+customersAffected+"\n";
	}
	
	
	
}

/*SELECT customers_affected, date_event_began,  date_event_finished, 
       TIMEDIFF(date_event_finished, date_event_began) AS blackoutHours
FROM poweroutages 
WHERE nerc_id = 3
*/