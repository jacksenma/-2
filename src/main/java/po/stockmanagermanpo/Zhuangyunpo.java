package po.stockmanagermanpo;

import java.io.Serializable;

public enum Zhuangyunpo implements Serializable{
   Plane ,Train,Car;
	
	public String toString() {
        if(this == Plane) return "飞机";
        else if(this == Train) return "火车";
        else return "汽车";
    }
}
