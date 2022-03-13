package com.mtit.service;

import java.util.ArrayList;
//import java.util.date;
import java.util.List;
import java.util.Scanner;

import model.Mail;

public class ServicePublishimpl implements ServicePublish {
	
	List<Mail> mailList = new ArrayList<Mail>();

	@Override
	public String publishService() {

		return "execute the service publisher";
	}

//	@Override
//	public void addMail(  String mailTitle, String sender, String date, double time, String content) {
//
//        int mailID = 0;
//		
//		if(!mailList.isEmpty()) {
//			mailID = mailList.size() + 1;
//		}else {
//			mailID = 1;
//		}
//		mailList.add(new Mail(mailID, mailTitle, sender,date, time, content));
//		System.out.println("email added");
//	}

	@Override
	public void viewMailList() {
		System.out.println("Email List");
		for(int i=0;i<mailList.size();i++) {
			System.out.println("title" + mailList.get(i));
			System.out.println("content" + mailList.get(i));
			System.out.println("....................");
		}
		
	}

	@Override
	public void viewMaildetails(int mailID) {

		Mail selectMail = new Mail();
		
		for(int i=0;i<mailList.size();i++) {
			if(mailList.get(i).getMailID()== mailID) {
				selectMail = mailList.get(i);
			}
	}
		System.out.println("title" + selectMail.getMailTitle());
		System.out.println("date" + selectMail.getDate());
		System.out.println("time" + selectMail.getTime());

	}

	@Override
	public void addMail() {
		// TODO Auto-generated method stub
		Mail mail = new Mail();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the mail title");
		mail.setMailTitle(scanner.next());
		
		System.out.println("enter the date");
		mail.setDate(scanner.next());
		
		System.out.println("enter the content");
		mail.setContent(scanner.next());
		
		System.out.println("enter the time");
		mail.setTime(scanner.nextDouble());
		
		System.out.println("enter the sender");
		mail.setSender(scanner.next());
		
		mailList.add(mail);
	}
}