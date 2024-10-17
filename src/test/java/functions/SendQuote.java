package functions;

import pages.TricentsForm;

public class SendQuote {

	public void setSendQuote(TricentsForm form, String email, String phone, String username, 
			String password, String confirmPassword) throws InterruptedException {
		form.getFormTabSendQuote().setEmail(email);
		form.getFormTabSendQuote().setPhone(phone);
		form.getFormTabSendQuote().setUsername(username);
		form.getFormTabSendQuote().setPassword(password);
		form.getFormTabSendQuote().setConfirmPassword(confirmPassword);
	}

}
