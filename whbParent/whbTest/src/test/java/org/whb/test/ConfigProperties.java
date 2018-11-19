package org.whb.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.annotation.Resource;

import org.junit.Test;
import org.whb.test.model.Student;

public class ConfigProperties {
	
	@Resource
	private Student student;

	@Test
	public void test() {
//		System.out.println(student.getDruid());
		
		System.out.println(new SimpleDateFormat("YYYYMM", Locale.ENGLISH).format(Calendar.getInstance().getTime()));
		
		System.out.println(new SimpleDateFormat("YYYYMM", Locale.ENGLISH).format(new Date()));
		
		synchronized (student) {
			
		}
		
	}

}
