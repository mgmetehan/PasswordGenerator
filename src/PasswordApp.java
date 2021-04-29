import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasswordApp extends JFrame {

	private JPanel w_panel;
	private JLabel lblHoþgeldin = new JLabel("\u015Eifre Olu\u015Fturucuya Ho\u015Fgeldiniz");
	private JLabel lblKarakter = new JLabel("\u015Eifreniz Ka\u00E7 Karakterden Olu\u015Fsun: ");
	private JTextField txtKarakter = new JTextField();
	private JLabel lblHarf = new JLabel("Harf Olsun mu ?");
	private JLabel lblOzelKarakter = new JLabel("\u00D6zel Karakter Olsun mu ?");
	private JButton btnGonder = new JButton("G\u00F6nder");
	private JLabel lblSifre = new JLabel("\u015Eifreniz: ");
	private JTextField txtSifre = new JTextField();
	private JRadioButton rdBtnHarf = new JRadioButton("Evet");
	private JRadioButton rdBtnOzelKarakter = new JRadioButton("Evet");
	private JLabel lblHarfBoyut = new JLabel("B\u00FCy\u00FCk Harf Olsun mu ?");
	private JRadioButton rdBtnHarfBoyut = new JRadioButton("Evet");
	private JLabel lblSayi = new JLabel("Sayi Olsun mu ?");
	private JRadioButton rdBtnSayi = new JRadioButton("Evet");
	private JLabel lblBG = new JLabel("");

	public JPanel getW_panel() {
		return w_panel;
	}

	public void setW_panel(JPanel w_panel) {
		this.w_panel = w_panel;
	}

	public JLabel getLblHoþgeldin() {
		return lblHoþgeldin;
	}

	public void setLblHoþgeldin(JLabel lblHoþgeldin) {
		this.lblHoþgeldin = lblHoþgeldin;
	}

	public JLabel getLblKarakter() {
		return lblKarakter;
	}

	public void setLblKarakter(JLabel lblKarakter) {
		this.lblKarakter = lblKarakter;
	}

	public JTextField getTxtKarakter() {
		return txtKarakter;
	}

	public void setTxtKarakter(JTextField txtKarakter) {
		this.txtKarakter = txtKarakter;
	}

	public JLabel getLblHarf() {
		return lblHarf;
	}

	public void setLblHarf(JLabel lblHarf) {
		this.lblHarf = lblHarf;
	}

	public JLabel getLblOzelKarakter() {
		return lblOzelKarakter;
	}

	public void setLblOzelKarakter(JLabel lblOzelKarakter) {
		this.lblOzelKarakter = lblOzelKarakter;
	}

	public JButton getBtnGonder() {
		return btnGonder;
	}

	public void setBtnGonder(JButton btnGonder) {
		this.btnGonder = btnGonder;
	}

	public JLabel getLblSifre() {
		return lblSifre;
	}

	public void setLblSifre(JLabel lblSifre) {
		this.lblSifre = lblSifre;
	}

	public JTextField getTxtSifre() {
		return txtSifre;
	}

	public void setTxtSifre(JTextField txtSifre) {
		this.txtSifre = txtSifre;
	}

	public JRadioButton getRdBtnHarf() {
		return rdBtnHarf;
	}

	public void setRdBtnHarf(JRadioButton rdBtnHarf) {
		this.rdBtnHarf = rdBtnHarf;
	}

	public JRadioButton getRdBtnOzelKarakter() {
		return rdBtnOzelKarakter;
	}

	public void setRdBtnOzelKarakter(JRadioButton rdBtnOzelKarakter) {
		this.rdBtnOzelKarakter = rdBtnOzelKarakter;
	}

	public JLabel getLblHarfBoyut() {
		return lblHarfBoyut;
	}

	public void setLblHarfBoyut(JLabel lblHarfBoyut) {
		this.lblHarfBoyut = lblHarfBoyut;
	}

	public JRadioButton getRdBtnHarfBoyut() {
		return rdBtnHarfBoyut;
	}

	public void setRdBtnHarfBoyut(JRadioButton rdBtnHarfBoyut) {
		this.rdBtnHarfBoyut = rdBtnHarfBoyut;
	}

	public JLabel getLblSayi() {
		return lblSayi;
	}

	public void setLblSayi(JLabel lblSayi) {
		this.lblSayi = lblSayi;
	}

	public JRadioButton getRdBtnSayi() {
		return rdBtnSayi;
	}

	public void setRdBtnSayi(JRadioButton rdBtnSayi) {
		this.rdBtnSayi = rdBtnSayi;
	}

	public JLabel getLblBG() {
		return lblBG;
	}

	public void setLblBG(JLabel lblBG) {
		this.lblBG = lblBG;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordApp frame = new PasswordApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String SayiFonk() {// yoksa a döndür
		Boolean SayiOlsunMu = rdBtnSayi.isSelected();
		if (SayiOlsunMu == true) {
			int rand = (int) (Math.random() * 9);
			return String.valueOf(rand);
		} else {
			return "a";
		}
	}

	public String OzelKarakterFonk() {// yoksa 0 döndür
		Boolean OzelKarakterOlsunMu = rdBtnOzelKarakter.isSelected();
		if (OzelKarakterOlsunMu == true) {
			String[] List = { "-", "_", "|", "*", "?", "=", "}", ")", "]", "(", "[", "{", "&", "%", "½", "+", "$", "#",
					"£", "!", "@" };// 21
			int random = (int) (Math.random() * 21);
			return List[random];
		} else {
			return "0";
		}
	}

	public String HarfFonk() {// yoksa 1 döndür
		Boolean HarfOlsunMu = rdBtnHarf.isSelected();
		if (HarfOlsunMu == true) {
			String[] List = { "q", "w", "e", "r", "t", "y", "u", "ý", "o", "p", "ð", "ü", "a", "s", "d", "f", "g", "h",
					"j", "k", "l", "þ", "i", "z", "x", "c", "v", "b", "n", "m", "ö", "ç" };// 32
			int rand = (int) (Math.random() * 32);
			Boolean BuyukHarfOlsunMu = rdBtnHarfBoyut.isSelected();
			if (BuyukHarfOlsunMu == true) {
				int r = (int) (Math.random() * 1);
				if (r == 0) {
					return List[rand].toUpperCase();
				} else {
					return List[rand];
				}
			}
			return List[rand];
		} else {
			return "1";
		}
	}

	public String w_fonk() {
		int x = Integer.valueOf(txtKarakter.getText());
		String sifre = "";
		for (int i = 0; i < x;) {
			int rand = (int) (Math.random() * 3 + 1);
			if (rand == 1) {
				if (SayiFonk().equals("a")) {
					continue;
				} else {
					sifre += SayiFonk();
					i++;
				}
			} else if (rand == 2) {
				if (OzelKarakterFonk().equals("0")) {
					continue;
				} else {
					sifre += OzelKarakterFonk();
					i++;
				}
			} else if (rand == 3) {
				if (HarfFonk().equals("1")) {
					continue;
				} else {
					sifre += HarfFonk();
					i++;
				}
			}
		}
		return sifre;
	}

	public PasswordApp() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 728);
		w_panel = new JPanel();
		w_panel.setBackground(Color.BLACK);
		w_panel.setForeground(Color.BLACK);
		w_panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_panel);
		w_panel.setLayout(null);

		lblHoþgeldin.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		lblHoþgeldin.setLabelFor(lblHoþgeldin);
		lblHoþgeldin.setForeground(Color.WHITE);
		lblHoþgeldin.setFont(new Font("Yu Gothic Medium", Font.BOLD, 25));
		lblHoþgeldin.setBounds(422, 36, 381, 88);
		w_panel.add(lblHoþgeldin);

		lblKarakter.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblKarakter.setForeground(Color.WHITE);
		lblKarakter.setBounds(68, 173, 364, 65);
		w_panel.add(lblKarakter);

		txtKarakter.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		txtKarakter.setBounds(463, 173, 250, 49);
		w_panel.add(txtKarakter);
		txtKarakter.setColumns(10);

		lblHarf.setForeground(Color.WHITE);
		lblHarf.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblHarf.setBounds(68, 260, 364, 65);
		w_panel.add(lblHarf);

		lblOzelKarakter.setForeground(Color.WHITE);
		lblOzelKarakter.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblOzelKarakter.setBounds(68, 481, 364, 65);
		w_panel.add(lblOzelKarakter);

		btnGonder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSifre.setText(w_fonk());
				txtKarakter.setText("");
				rdBtnHarf.setSelected(false);
				rdBtnHarfBoyut.setSelected(false);
				rdBtnOzelKarakter.setSelected(false);
				rdBtnSayi.setSelected(false);
			}
		});
		btnGonder.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		btnGonder.setBounds(219, 578, 289, 49);
		w_panel.add(btnGonder);

		lblSifre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSifre.setForeground(Color.WHITE);
		lblSifre.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblSifre.setBounds(688, 279, 289, 65);
		w_panel.add(lblSifre);

		txtSifre.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		txtSifre.setColumns(10);
		txtSifre.setBounds(648, 383, 364, 49);
		w_panel.add(txtSifre);

		rdBtnHarf.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		rdBtnHarf.setBounds(463, 279, 111, 23);
		rdBtnHarf.setActionCommand("Y");
		w_panel.add(rdBtnHarf);

		rdBtnOzelKarakter.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		rdBtnOzelKarakter.setBounds(463, 502, 111, 23);
		rdBtnOzelKarakter.setActionCommand("Y");
		w_panel.add(rdBtnOzelKarakter);

		lblHarfBoyut.setForeground(Color.WHITE);
		lblHarfBoyut.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblHarfBoyut.setBounds(68, 336, 364, 65);
		w_panel.add(lblHarfBoyut);

		rdBtnHarfBoyut.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		rdBtnHarfBoyut.setBounds(463, 357, 111, 23);
		rdBtnHarfBoyut.setActionCommand("Y");
		w_panel.add(rdBtnHarfBoyut);

		lblSayi.setForeground(Color.WHITE);
		lblSayi.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblSayi.setBounds(68, 412, 364, 65);
		w_panel.add(lblSayi);

		rdBtnSayi.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		rdBtnSayi.setBounds(463, 433, 111, 23);
		rdBtnSayi.setActionCommand("Y");
		rdBtnSayi.setSelected(true);
		w_panel.add(rdBtnSayi);

		lblBG.setIcon(new ImageIcon(PasswordApp.class.getResource("/img/bg.jpg")));
		lblBG.setForeground(Color.WHITE);
		lblBG.setBounds(0, 0, 1062, 703);
		w_panel.add(lblBG);
	}
}
