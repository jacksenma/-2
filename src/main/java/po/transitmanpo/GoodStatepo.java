package po.transitmanpo;

public enum GoodStatepo {
	
	Complete , Damage , Lose ;
	
	public static GoodStatepo getState(int i){
		if(i == 1) return Complete;
		else if(i == 2) return Damage;
		else return Lose;
	} 

}
