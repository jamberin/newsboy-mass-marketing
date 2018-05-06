import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class ContentUpload {

	protected Shell shlContentUpload;
	private Text txtBrowse;
	private Text txtUpload;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ContentUpload window = new ContentUpload();
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
		shlContentUpload.open();
		shlContentUpload.layout();
		while (!shlContentUpload.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlContentUpload = new Shell();
		shlContentUpload.setSize(618, 409);
		shlContentUpload.setText("Content Upload");
		
		Combo combo = new Combo(shlContentUpload, SWT.NONE);
		combo.setBounds(10, 10, 582, 23);
		combo.setText("Message Name");
		
		Browser brwsContentViewer = new Browser(shlContentUpload, SWT.NONE);
		brwsContentViewer.setBounds(10, 39, 582, 230);
		
		Button btnBrowse = new Button(shlContentUpload, SWT.NONE);
		btnBrowse.setBounds(10, 275, 75, 25);
		btnBrowse.setText("Browse");
		
		txtBrowse = new Text(shlContentUpload, SWT.BORDER);
		txtBrowse.setBounds(91, 277, 501, 21);
		
		txtUpload = new Text(shlContentUpload, SWT.BORDER);
		txtUpload.setBounds(91, 304, 501, 21);
		
		Label lblMessageName = new Label(shlContentUpload, SWT.NONE);
		lblMessageName.setBounds(48, 307, 37, 15);
		lblMessageName.setText("Name");
		
		Button btnUpload = new Button(shlContentUpload, SWT.NONE);
		btnUpload.setBounds(10, 331, 75, 25);
		btnUpload.setText("Upload");
		
		Button btnCancel = new Button(shlContentUpload, SWT.NONE);
		btnCancel.setBounds(91, 331, 75, 25);
		btnCancel.setText("Cancel");
		
		Button btnNewButton = new Button(shlContentUpload, SWT.NONE);
		btnNewButton.setBounds(517, 331, 75, 25);
		btnNewButton.setText("Delete");

	}
}
