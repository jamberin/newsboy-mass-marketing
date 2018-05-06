import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ContentUpload {

	protected Shell shlContentUpload;

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
		shlContentUpload.setSize(450, 300);
		shlContentUpload.setText("Content Upload");

	}

}
