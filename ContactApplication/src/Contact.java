import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Contact {

	protected Shell shlTazzotechContact;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Contact window = new Contact();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlTazzotechContact.open();
		shlTazzotechContact.layout();
		while (!shlTazzotechContact.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlTazzotechContact = new Shell();
		shlTazzotechContact.setSize(340, 153);
		shlTazzotechContact.setText("TazzoTech - Contact Application");
		
		Button btnSendMessage = new Button(shlTazzotechContact, SWT.NONE);
		btnSendMessage.setBounds(10, 10, 304, 25);
		btnSendMessage.setText("Send Message");
		
		Button btnViuAdmin = new Button(shlTazzotechContact, SWT.NONE);
		btnViuAdmin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnViuAdmin.setText("VIU Admin");
		btnViuAdmin.setBounds(10, 41, 304, 25);
		
		Button btnContentManagement = new Button(shlTazzotechContact, SWT.NONE);
		btnContentManagement.setText("Content Management");
		btnContentManagement.setBounds(10, 72, 304, 25);

	}
}
