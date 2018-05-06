import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SendMessage {

	protected Shell shlSendMessage;
	private Text txtUserCount;
	private Text txtSingleEmail;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SendMessage window = new SendMessage();
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
		shlSendMessage.open();
		shlSendMessage.layout();
		while (!shlSendMessage.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSendMessage = new Shell();
		shlSendMessage.setSize(690, 431);
		shlSendMessage.setText("Send Message");
		
		Combo cmbSelectMessage = new Combo(shlSendMessage, SWT.NONE);
		cmbSelectMessage.setBounds(10, 10, 654, 23);
		cmbSelectMessage.setText("Select Message");
		
		Browser brwsPreview = new Browser(shlSendMessage, SWT.NONE);
		brwsPreview.setBounds(10, 39, 654, 171);
		
		Group grpUserSelection = new Group(shlSendMessage, SWT.NONE);
		grpUserSelection.setText("User Selection");
		grpUserSelection.setBounds(10, 216, 654, 136);
		
		Combo cmbUserQueries = new Combo(grpUserSelection, SWT.NONE);
		cmbUserQueries.setBounds(10, 27, 104, 23);
		cmbUserQueries.setText("User Queries");
		
		txtUserCount = new Text(grpUserSelection, SWT.BORDER);
		txtUserCount.setEditable(false);
		txtUserCount.setBounds(10, 56, 104, 21);
		
		Label lblUserCount = new Label(grpUserSelection, SWT.NONE);
		lblUserCount.setBounds(120, 59, 69, 15);
		lblUserCount.setText("User Count");
		
		txtSingleEmail = new Text(grpUserSelection, SWT.BORDER);
		txtSingleEmail.setBounds(10, 83, 104, 21);
		
		Label lblSingleEmail = new Label(grpUserSelection, SWT.NONE);
		lblSingleEmail.setBounds(120, 86, 80, 15);
		lblSingleEmail.setText("Single Email");
		
		Button btnSendMessage = new Button(shlSendMessage, SWT.NONE);
		btnSendMessage.setBounds(10, 358, 98, 25);
		btnSendMessage.setText("Send Message");
		
		Button btnSendSample = new Button(shlSendMessage, SWT.NONE);
		btnSendSample.setBounds(114, 358, 98, 25);
		btnSendSample.setText("Send Sample");
		
		Button btnNewButton = new Button(shlSendMessage, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(218, 358, 98, 25);
		btnNewButton.setText("Cancel");

	}

}
