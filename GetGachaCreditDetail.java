package businessFunction.gacha; 

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tools.Connector;
import tools.Dto; 

public class GetGachaCreditDetail { 

	@SuppressWarnings("rawtypes")
	public static Dto execute(Dto param){ 

		Dto result = new Dto(); 
		String registryNumber = param.getString("registryNumber"); 

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT ID, \n");
		sb.append("    header_id, \n");
		sb.append("    due_date, \n");
		sb.append("    payment_date, \n");
		sb.append("    installment_count, \n");
		sb.append("    print_officer, \n");
		sb.append("    print_flag, \n");
		sb.append("    direct_take \n");
		sb.append("FROM gacha_kredit_detail \n");
		sb.append("WHERE print_flag = '"+registryNumber+"' \n");

		List<String> keyList = new ArrayList<String>();
		List<Class> classList = new ArrayList<Class>();

		keyList.add("id");
		classList.add(String.class);

		keyList.add("headerId");
		classList.add(String.class);

		keyList.add("dueDate");
		classList.add(Date.class);

		keyList.add("paymentDate");
		classList.add(Date.class);

		keyList.add("installmentCount");
		classList.add(Integer.class);

		keyList.add("printOfficer");
		classList.add(String.class);

		keyList.add("printFlag");
		classList.add(String.class);
		
		keyList.add("takeBy");
		classList.add(String.class);

		List<Dto> resList = Connector.selectStatement(sb.toString(), keyList, classList); 
		if(resList!=null){ 
			if(!resList.isEmpty()){ 
				result = resList.get(0);	 
			} 
		} 
		return result; 
	} 
} 
