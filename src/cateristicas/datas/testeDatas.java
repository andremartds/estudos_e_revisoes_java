package cateristicas.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testeDatas {

	public static void main(String[] args) {

		Calendar dtc = Calendar.getInstance();


		if (dtc.after(getDataHoje())) {
			System.out.println("entrou na condição");
		} else{
			
			System.out.println("não entrou na condição");
		}
	}

	private static Date getDataHoje() {
		Calendar dataHoje = Calendar.getInstance();
		dataHoje.set(Calendar.HOUR_OF_DAY, 0);
		dataHoje.set(Calendar.MINUTE, 0);
		dataHoje.set(Calendar.SECOND, 0);
		dataHoje.set(Calendar.MILLISECOND, 0);
		return dataHoje.getTime();
	}
}
