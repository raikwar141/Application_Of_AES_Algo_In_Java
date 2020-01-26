import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {
JProgressBar pb;
	
	public Main() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 15));
		Icon icon = new ImageIcon(getClass().getResource("/images/Logo.jpg"));
		add(new JLabel(icon), BorderLayout.CENTER);
		pb = new JProgressBar(0, 100);
		pb.setForeground(new Color(34, 255, 0));
		pb.setString("LOADING....");
		pb.setStringPainted(true);
		add(pb, BorderLayout.SOUTH);
	}
	public void setProgress(int progress) {
		pb.setValue(progress);
	}
	public static void main(String args[]) {
		Main p = new Main();
		JWindow win = new JWindow();
		win.setContentPane(p);
		win.pack();
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		try {
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(50);
				p.setProgress(i);
			}
		} catch (Exception e) {
		}
		win.setVisible(false);
		win.dispose();
		Screen frame = new Screen();
		frame.setVisible(true);
	}
}