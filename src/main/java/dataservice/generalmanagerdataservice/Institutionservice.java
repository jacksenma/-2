package dataservice.generalmanagerdataservice;

import po.generalmanagepo.Institutionpo;

public interface Institutionservice {
boolean writeInstitution(Institutionpo ip);
Institutionpo getInstitution(String id);
void deleteInstitution(Institutionpo ip);
void modifyInstitution(Institutionpo oldip,Institutionpo ip);
}
