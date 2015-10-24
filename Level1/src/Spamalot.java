import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "level1.spam.530@gmail.com";
	static final String FAKE_PASSWORD = "password530";
	JButton button1 = new JButton("BAD");
	JButton button2 = new JButton("GOOD");
	JTextField field = new JTextField(15);

	public static void main(String[] args) {
		Spamalot spamalot = new Spamalot();
		spamalot.createUI();

	}

	void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(field);
		panel.add(button1);
		frame.add(panel);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(500, 400);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if (button1 == clickedButton) {
			// System.out.println("bad, " + field.getText());
			boolean spamSent = sendSpam(field.getText(), "bad spam", "youre annoying");
			System.out.println(spamSent);
			if (spamSent) {
				field.setBackground(Color.GREEN);
			} else {
				field.setBackground(Color.RED);
			}

		}
		if (button2 == clickedButton) {
			// System.out.println("good, " + field.getText());
			for (int i = 0; i < 10; i++) {
				boolean spamSent = sendSpam(field.getText(), "good spam" + i,"youre super cool" + i);
				
				System.out.println(spamSent);
				if (spamSent) {
					field.setBackground(Color.GREEN);
				} else {
					field.setBackground(Color.RED);

				}
			}
		}

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
