package eu.sig.training.ch05.buildandsendmail;

public class Mail {
    MailMan m;
    String firstName;
    String lastName;
    String division;
    String subject;
    MailFont font;
    String message1;
    String message2;
    String message3;
}

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(Mail mail) {
        // Format the email address
        String mId = mail.firstName.charAt(0) + "." + mail.lastName.substring(0, 7) + "@"
            + mail.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            mail.message1 + mail.message2 + mail.message3);
        // Send message
        mail.m.send(mId, mail.subject, mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}