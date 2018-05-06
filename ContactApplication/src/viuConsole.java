import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class viuConsole {

	protected Shell shlViewinsertupdate;
	private Text txtSearch;
	private Text txtFName;
	private Text txtLName;
	private Text txtEmail;
	private Text txtAddress;
	private Text txtFileBrowse;
	private Text txtStatus;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			viuConsole window = new viuConsole();
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
		shlViewinsertupdate.open();
		shlViewinsertupdate.layout();
		while (!shlViewinsertupdate.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlViewinsertupdate = new Shell();
		shlViewinsertupdate.setSize(678, 330);
		shlViewinsertupdate.setText("View/Insert/Update");
		
		txtSearch = new Text(shlViewinsertupdate, SWT.BORDER);
		txtSearch.setBounds(10, 10, 151, 21);
		
		Button btnSearch = new Button(shlViewinsertupdate, SWT.NONE);
		btnSearch.setBounds(167, 6, 75, 25);
		btnSearch.setText("Search");
		
		Group grpUserInfo = new Group(shlViewinsertupdate, SWT.NONE);
		grpUserInfo.setText("User Info");
		grpUserInfo.setBounds(10, 37, 642, 148);
		
		txtFName = new Text(grpUserInfo, SWT.BORDER);
		txtFName.setEditable(false);
		txtFName.setBounds(85, 27, 138, 21);
		
		Label lblFirstName = new Label(grpUserInfo, SWT.NONE);
		lblFirstName.setBounds(10, 30, 69, 15);
		lblFirstName.setText("First Name");
		
		Label lblLastName = new Label(grpUserInfo, SWT.NONE);
		lblLastName.setBounds(10, 57, 62, 15);
		lblLastName.setText("Last Name");
		
		txtLName = new Text(grpUserInfo, SWT.BORDER);
		txtLName.setEditable(false);
		txtLName.setBounds(85, 54, 138, 21);
		
		txtEmail = new Text(grpUserInfo, SWT.BORDER);
		txtEmail.setEditable(false);
		txtEmail.setBounds(85, 81, 138, 21);
		
		Label lblEmailAddress = new Label(grpUserInfo, SWT.NONE);
		lblEmailAddress.setText("Email");
		lblEmailAddress.setBounds(33, 84, 37, 15);
		
		txtAddress = new Text(grpUserInfo, SWT.BORDER);
		txtAddress.setToolTipText("Edit the address by selecting edit and then hitting the \"Edit Address\" button.");
		txtAddress.setEditable(false);
		txtAddress.setBounds(85, 108, 138, 21);
		
		Label lblAddress = new Label(grpUserInfo, SWT.NONE);
		lblAddress.setBounds(21, 111, 47, 15);
		lblAddress.setText("Address");
		
		Button btnEditUser = new Button(grpUserInfo, SWT.NONE);
		btnEditUser.setBounds(391, 106, 75, 25);
		btnEditUser.setText("Edit User");
		
		Button btnSave = new Button(grpUserInfo, SWT.NONE);
		btnSave.setText("Save");
		btnSave.setBounds(472, 106, 75, 25);
		
		Button btnNewUser = new Button(grpUserInfo, SWT.NONE);
		btnNewUser.setText("New User");
		btnNewUser.setBounds(310, 106, 75, 25);
		
		Button btnChangeAddress = new Button(grpUserInfo, SWT.NONE);
		btnChangeAddress.setEnabled(false);
		btnChangeAddress.setText("Edit Address");
		btnChangeAddress.setBounds(229, 106, 75, 25);
		
		Button btnCancel = new Button(grpUserInfo, SWT.NONE);
		btnCancel.setText("Cancel");
		btnCancel.setBounds(553, 106, 75, 25);
		
		text = new Text(grpUserInfo, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		text.setBounds(229, 27, 399, 73);
		
		Group grpMultiUserUpload = new Group(shlViewinsertupdate, SWT.NONE);
		grpMultiUserUpload.setText("Multi User Upload");
		grpMultiUserUpload.setBounds(10, 191, 282, 92);
		
		Button btnBrowse = new Button(grpMultiUserUpload, SWT.NONE);
		btnBrowse.setBounds(10, 23, 75, 25);
		btnBrowse.setText("Browse");
		
		txtFileBrowse = new Text(grpMultiUserUpload, SWT.BORDER);
		txtFileBrowse.setEditable(false);
		txtFileBrowse.setBounds(91, 25, 165, 21);
		
		Button btnUpload = new Button(grpMultiUserUpload, SWT.NONE);
		btnUpload.setBounds(10, 54, 75, 25);
		btnUpload.setText("Upload");
		
		txtStatus = new Text(grpMultiUserUpload, SWT.BORDER);
		txtStatus.setEnabled(false);
		txtStatus.setEditable(false);
		txtStatus.setBounds(91, 56, 165, 21);

	}
}
