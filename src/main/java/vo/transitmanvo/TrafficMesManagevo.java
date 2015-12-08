package vo.transitmanvo;

import java.io.Serializable;
import java.util.List;
import vo.couriervo.Datevo;

public class TrafficMesManagevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7263412829341090963L;

        public final Datevo date;
        
        public final String cenID;
        
        public final String begin;
        
        public final String target;
        
        public final String tafficID;
        
        public final String counter;
        
        public final String person;
        
        public String cargoman;
        
        public final int tafficType;
        
        public List<String> allID;
        
        public TrafficMesManagevo(Datevo d , String c , List<String> a, 
                String b , String tar , String taf , String coun , String p,
                 int ty){
                 date = d;
                 cenID = c;
                 allID = a;
                 begin = b;
                 target = tar;
                 tafficID = taf;
                 counter = coun;
                 person = p;
                 tafficType = ty;
        }
}
