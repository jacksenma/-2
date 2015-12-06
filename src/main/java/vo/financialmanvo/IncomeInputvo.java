package vo.financialmanvo;

import java.io.Serializable;

public class IncomeInputvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5025369575395173760L;
	public final Datevo date;
	public final Incomevo income;
	public IncomeInputvo(Datevo d,Incomevo i){
		date=d;
		income=i;
	}

}
