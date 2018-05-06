import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SendMessage {

	protected Shell shlSendMessage;

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
		shlSendMessage.setSize(450, 300);
		shlSendMessage.setText("Send Message");

	}

}
