package com.lyr.shoppingmall.utils;



public class MailUtils {

public static void sendMail(String email, String emailMsg){
		/*	throws AddressException, MessagingException {
		// 1.����һ���������ʼ��������Ự���� Session

		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "SMTP");
		props.setProperty("mail.host", "smtp.126.com");
		props.setProperty("mail.smtp.auth", "true");// ָ����֤Ϊtrue

		// ������֤��
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("haohao_itcast", "hao12345");
			}
		};

		Session session = Session.getInstance(props, auth);

		// 2.����һ��Message�����൱�����ʼ�����
		Message message = new MimeMessage(session);

		message.setFrom(new InternetAddress("haohao_itcast@126.com")); // ���÷�����

		message.setRecipient(RecipientType.TO, new InternetAddress(email)); // ���÷��ͷ�ʽ�������

		message.setSubject("�û�����");
		// message.setText("����һ�⼤���ʼ�����<a href='#'>���</a>");

		message.setContent(emailMsg, "text/html;charset=utf-8");

		// 3.���� Transport���ڽ��ʼ�����

		Transport.send(message);*/
	}
}