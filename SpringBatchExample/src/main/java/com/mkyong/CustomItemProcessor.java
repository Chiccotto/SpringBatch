package com.mkyong;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		int ii = item.getQty()*100;
		item.setQty(ii);
		return item;
	}

}