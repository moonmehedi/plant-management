package com.example.demo4.ArifJavaClass;

import com.example.demo4.Start;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class HelpAndSupportController {

    @FXML
    private TextField mail;

    @FXML
    private TextField phone;

    @FXML
    private TextField message;

    public void connect(ActionEvent event) {
        // Save the contact information to the CSV file
        saveContactInfo(mail.getText(), phone.getText(), message.getText());

        // Call the method to send an email
        sendEmail(mail.getText());
    }

    private void saveContactInfo(String email, String phone, String messageContent) {
        // Format the data to write to CSV
        String dataLine = String.join(",", email, phone, messageContent);

        // Try-with-resources to ensure the file is closed properly
        try (FileWriter fw = new FileWriter("CSVFILES/ArifCSVFiles/contacts.csv", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(dataLine);
        } catch (IOException e) {
            System.err.println("There was a problem writing to the contacts file: " + e.getMessage());
            // Consider how you want to handle this error. Maybe show a dialog to the user.
        }
    }

    private void sendEmail(String recipient) {
        final String username = "arif465109@gmail.com"; // Replace with your email
        final String password = "keji yppt nfgo aqzg"; // Replace with your password

        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object
        Session session = Session.getInstance(props,
                new jakarta.mail.Authenticator() {
                    protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new jakarta.mail.PasswordAuthentication(username, password);
                    }
                });

        try {
            Message emailMessage = new MimeMessage(session);

            emailMessage.setFrom(new InternetAddress("arif465109@gmail.com"));
            emailMessage.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recipient));
            emailMessage.setSubject("\uD835\uDCD0\uD835\uDCF0\uD835\uDCFB\uD835\uDCF2\uD835\uDCEC\uD835\uDCFE\uD835\uDCF5\uD835\uDCFD\uD835\uDCFE\uD835\uDCFB\uD835\uDCEA\uD835\uDCF5 \uD835\uDCD8\uD835\uDCF7\uD835\uDCFD\uD835\uDCEE\uD835\uDCF5\uD835\uDCF5\uD835\uDCF2\uD835\uDCF0\uD835\uDCEE\uD835\uDCF7\uD835\uDCEC\uD835\uDCEE \uD835\uDCD7\uD835\uDCE4\uD835\uDCD1");
            emailMessage.setText("\uD835\uDE4F\uD835\uDE5D\uD835\uDE56\uD835\uDE63\uD835\uDE60 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A \uD835\uDE5B\uD835\uDE64\uD835\uDE67 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A\uD835\uDE67 \uD835\uDE60\uD835\uDE5E\uD835\uDE63\uD835\uDE59 \uD835\uDE56\uD835\uDE69\uD835\uDE69\uD835\uDE5A\uD835\uDE63\uD835\uDE69\uD835\uDE5E\uD835\uDE64\uD835\uDE63. \uD835\uDE44\uD835\uDE5B \uD835\uDE6E\uD835\uDE64\uD835\uDE6A \uD835\uDE63\uD835\uDE5A\uD835\uDE5A\uD835\uDE59 \uD835\uDE56\uD835\uDE63\uD835\uDE6E \uD835\uDE5D\uD835\uDE5A\uD835\uDE61\uD835\uDE65 \uD835\uDE69\uD835\uDE5D\uD835\uDE5A\uD835\uDE63 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A \uD835\uDE62\uD835\uDE56\uD835\uDE6E \uD835\uDE58\uD835\uDE64\uD835\uDE62\uD835\uDE5A \uD835\uDE69\uD835\uDE64 \uD835\uDE64\uD835\uDE6A\uD835\uDE67 \uD835\uDE64\uD835\uDE5B\uD835\uDE5B\uD835\uDE5E\uD835\uDE58\uD835\uDE5A \uD835\uDE59\uD835\uDE5E\uD835\uDE67\uD835\uDE5A\uD835\uDE58\uD835\uDE69\uD835\uDE61\uD835\uDE6E \uD835\uDE5B\uD835\uDE64\uD835\uDE67 \uD835\uDE56 \uD835\uDE61\uD835\uDE5E\uD835\uDE6B\uD835\uDE5A \uD835\uDE68\uD835\uDE5A\uD835\uDE68\uD835\uDE68\uD835\uDE5E\uD835\uDE64\uD835\uDE63.\n\n\n" +
                    "\uD835\uDE4A\uD835\uDE6A\uD835\uDE67 \uD835\uDE64\uD835\uDE5B\uD835\uDE5B\uD835\uDE5E\uD835\uDE58\uD835\uDE5A \uD835\uDE56\uD835\uDE59\uD835\uDE59\uD835\uDE67\uD835\uDE5A\uD835\uDE68\uD835\uDE68 \uD835\uDE5E\uD835\uDE68 \uD835\uDE5C\uD835\uDE5E\uD835\uDE6B\uD835\uDE5A\uD835\uDE63 \uD835\uDE57\uD835\uDE5A\uD835\uDE61\uD835\uDE64\uD835\uDE6C:\n" +
                    "\uD835\uDE48\uD835\uDE44\uD835\uDE47\uD835\uDE44\uD835\uDE4F\uD835\uDE3C\uD835\uDE4D\uD835\uDE54 \uD835\uDE44\uD835\uDE49\uD835\uDE4E\uD835\uDE4F\uD835\uDE44\uD835\uDE4F\uD835\uDE50\uD835\uDE4F\uD835\uDE40 \uD835\uDE4A\uD835\uDE41 \uD835\uDE4E\uD835\uDE3E\uD835\uDE44\uD835\uDE40\uD835\uDE49\uD835\uDE3E\uD835\uDE40 \uD835\uDE3C\uD835\uDE49\uD835\uDE3F \uD835\uDE4F\uD835\uDE40\uD835\uDE3E\uD835\uDE43\uD835\uDE49\uD835\uDE4A\uD835\uDE47\uD835\uDE4A\uD835\uDE42\uD835\uDE54, \n" +
                    " \uD835\uDE48\uD835\uDE44\uD835\uDE4D\uD835\uDE4B\uD835\uDE50\uD835\uDE4D \uD835\uDE3E\uD835\uDE3C\uD835\uDE49\uD835\uDE4F\uD835\uDE4A\uD835\uDE49\uD835\uDE48\uD835\uDE40\uD835\uDE49\uD835\uDE4F, \uD835\uDE3F\uD835\uDE43\uD835\uDE3C\uD835\uDE46\uD835\uDE3C.\n\n" +
                    "\n" +
                    "\uD835\uDE4F\uD835\uDE43\uD835\uDE3C\uD835\uDE49\uD835\uDE46 \uD835\uDE54\uD835\uDE4A\uD835\uDE50 \uD835\uDE3C\uD835\uDE49\uD835\uDE3F \uD835\uDE4E\uD835\uDE4F\uD835\uDE3C\uD835\uDE54 \uD835\uDE52\uD835\uDE44\uD835\uDE4F\uD835\uDE43 \uD835\uDE50\uD835\uDE4E\n\n" +
                    "\uD835\uDC00\uD835\uDC11\uD835\uDC08\uD835\uDC05 \uD835\uDC00\uD835\uDC01\uD835\uDC03\uD835\uDC14\uD835\uDC0B\uD835\uDC0B\uD835\uDC00\uD835\uDC07\n" +
                    "\uD835\uDC02\uD835\uDC04\uD835\uDC0E \uD835\uDC0E\uD835\uDC05 \uD835\uDC00\uD835\uDC08\uD835\uDC07");

            Transport.send(emailMessage);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            e.printStackTrace(); // Or handle the exception in a way that's appropriate for your application
        }
    }

    @FXML
    void onHomeBtnClk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/Functions.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();

    }
}


/*package com.example.share;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField mail;

    @FXML
    private TextField phone;

    @FXML
    private TextField message;

    @FXML
    private Label invalid;

    // This method is called when the FXML file is loaded
//    public void initialize() {
//        // Initially hide the invalid email label
//    }

    public void connect(ActionEvent event) {
        // Validate the email and act accordingly
        if (isValidEmail(mail.getText())) {
            invalid.setVisible(false);
            saveContactInfo(mail.getText(), phone.getText(), message.getText());
            sendEmail(mail.getText());
        } else {
            invalid.setVisible(true);
        }
    }

    private boolean isValidEmail(String email) {
        return email.contains("@")
                && email.contains(".")
                && email.equals(email.toLowerCase())
                || email.matches(".*\\d.*");
    }


    private void saveContactInfo(String email, String phoneNumber, String messageContent) {
        String dataLine = String.join(",", email, phoneNumber, messageContent);
        try (FileWriter fw = new FileWriter("contacts.csv", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(dataLine);
        } catch (IOException e) {
            System.err.println("There was a problem writing to the contacts file: " + e.getMessage());
        }
    }

    private void sendEmail(String recipient) {
        final String username = "arif465109@gmail.com"; // Replace with your email
        final String password = "keji yppt nfgo aqzg"; // Replace with your password

        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object
        Session session = Session.getInstance(props,
                new jakarta.mail.Authenticator() {
                    protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new jakarta.mail.PasswordAuthentication(username, password);
                    }
                });

        try {
            Message emailMessage = new MimeMessage(session);

            emailMessage.setFrom(new InternetAddress("arif465109@gmail.com"));
            emailMessage.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recipient));
            emailMessage.setSubject("\uD835\uDCD0\uD835\uDCF0\uD835\uDCFB\uD835\uDCF2\uD835\uDCEC\uD835\uDCFE\uD835\uDCF5\uD835\uDCFD\uD835\uDCFE\uD835\uDCFB\uD835\uDCEA\uD835\uDCF5 \uD835\uDCD8\uD835\uDCF7\uD835\uDCFD\uD835\uDCEE\uD835\uDCF5\uD835\uDCF5\uD835\uDCF2\uD835\uDCF0\uD835\uDCEE\uD835\uDCF7\uD835\uDCEC\uD835\uDCEE \uD835\uDCD7\uD835\uDCE4\uD835\uDCD1");
            emailMessage.setText("\uD835\uDE4F\uD835\uDE5D\uD835\uDE56\uD835\uDE63\uD835\uDE60 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A \uD835\uDE5B\uD835\uDE64\uD835\uDE67 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A\uD835\uDE67 \uD835\uDE60\uD835\uDE5E\uD835\uDE63\uD835\uDE59 \uD835\uDE56\uD835\uDE69\uD835\uDE69\uD835\uDE5A\uD835\uDE63\uD835\uDE69\uD835\uDE5E\uD835\uDE64\uD835\uDE63. \uD835\uDE44\uD835\uDE5B \uD835\uDE6E\uD835\uDE64\uD835\uDE6A \uD835\uDE63\uD835\uDE5A\uD835\uDE5A\uD835\uDE59 \uD835\uDE56\uD835\uDE63\uD835\uDE6E \uD835\uDE5D\uD835\uDE5A\uD835\uDE61\uD835\uDE65 \uD835\uDE69\uD835\uDE5D\uD835\uDE5A\uD835\uDE63 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A \uD835\uDE62\uD835\uDE56\uD835\uDE6E \uD835\uDE58\uD835\uDE64\uD835\uDE62\uD835\uDE5A \uD835\uDE69\uD835\uDE64 \uD835\uDE64\uD835\uDE6A\uD835\uDE67 \uD835\uDE64\uD835\uDE5B\uD835\uDE5B\uD835\uDE5E\uD835\uDE58\uD835\uDE5A \uD835\uDE59\uD835\uDE5E\uD835\uDE67\uD835\uDE5A\uD835\uDE58\uD835\uDE69\uD835\uDE61\uD835\uDE6E \uD835\uDE5B\uD835\uDE64\uD835\uDE67 \uD835\uDE56 \uD835\uDE61\uD835\uDE5E\uD835\uDE6B\uD835\uDE5A \uD835\uDE68\uD835\uDE5A\uD835\uDE68\uD835\uDE68\uD835\uDE5E\uD835\uDE64\uD835\uDE63.\n\n\n" +
                    "\uD835\uDE4A\uD835\uDE6A\uD835\uDE67 \uD835\uDE64\uD835\uDE5B\uD835\uDE5B\uD835\uDE5E\uD835\uDE58\uD835\uDE5A \uD835\uDE56\uD835\uDE59\uD835\uDE59\uD835\uDE67\uD835\uDE5A\uD835\uDE68\uD835\uDE68 \uD835\uDE5E\uD835\uDE68 \uD835\uDE5C\uD835\uDE5E\uD835\uDE6B\uD835\uDE5A\uD835\uDE63 \uD835\uDE57\uD835\uDE5A\uD835\uDE61\uD835\uDE64\uD835\uDE6C:\n" +
                    "\uD835\uDE48\uD835\uDE44\uD835\uDE47\uD835\uDE44\uD835\uDE4F\uD835\uDE3C\uD835\uDE4D\uD835\uDE54 \uD835\uDE44\uD835\uDE49\uD835\uDE4E\uD835\uDE4F\uD835\uDE44\uD835\uDE4F\uD835\uDE50\uD835\uDE4F\uD835\uDE40 \uD835\uDE4A\uD835\uDE41 \uD835\uDE4E\uD835\uDE3E\uD835\uDE44\uD835\uDE40\uD835\uDE49\uD835\uDE3E\uD835\uDE40 \uD835\uDE3C\uD835\uDE49\uD835\uDE3F \uD835\uDE4F\uD835\uDE40\uD835\uDE3E\uD835\uDE43\uD835\uDE49\uD835\uDE4A\uD835\uDE47\uD835\uDE4A\uD835\uDE42\uD835\uDE54, \n" +
                    " \uD835\uDE48\uD835\uDE44\uD835\uDE4D\uD835\uDE4B\uD835\uDE50\uD835\uDE4D \uD835\uDE3E\uD835\uDE3C\uD835\uDE49\uD835\uDE4F\uD835\uDE4A\uD835\uDE49\uD835\uDE48\uD835\uDE40\uD835\uDE49\uD835\uDE4F, \uD835\uDE3F\uD835\uDE43\uD835\uDE3C\uD835\uDE46\uD835\uDE3C.\n\n" +
                    "\n" +
                    "\uD835\uDE4F\uD835\uDE43\uD835\uDE3C\uD835\uDE49\uD835\uDE46 \uD835\uDE54\uD835\uDE4A\uD835\uDE50 \uD835\uDE3C\uD835\uDE49\uD835\uDE3F \uD835\uDE4E\uD835\uDE4F\uD835\uDE3C\uD835\uDE54 \uD835\uDE52\uD835\uDE44\uD835\uDE4F\uD835\uDE43 \uD835\uDE50\uD835\uDE4E\n\n" +
                    "\uD835\uDC00\uD835\uDC11\uD835\uDC08\uD835\uDC05 \uD835\uDC00\uD835\uDC01\uD835\uDC03\uD835\uDC14\uD835\uDC0B\uD835\uDC0B\uD835\uDC00\uD835\uDC07\n" +
                    "\uD835\uDC02\uD835\uDC04\uD835\uDC0E \uD835\uDC0E\uD835\uDC05 \uD835\uDC00\uD835\uDC08\uD835\uDC07");

            Transport.send(emailMessage);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            e.printStackTrace(); // Or handle the exception in a way that's appropriate for your application
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        invalid.setVisible(false);

    }
}
*/