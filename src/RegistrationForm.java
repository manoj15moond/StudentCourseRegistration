import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class RegistrationForm {
	int flag = 0;
	int s1 = 0, s2 = 0, s3 = 0, s4 = 0;
	ArrayList<String> al = new ArrayList<String>();
	private JFrame frame;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window = new RegistrationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public RegistrationForm() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Course Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(294, 25, 763, 61);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		panel.setBounds(67, 225, 472, 340);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblStudentPersonalInformation = new JLabel("Student Personal Information");
		lblStudentPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblStudentPersonalInformation.setBounds(55, 24, 343, 27);
		panel.add(lblStudentPersonalInformation);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(67, 80, 46, 14);
		panel.add(lblName);

		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(67, 120, 46, 14);
		panel.add(lblClass);

		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentId.setBounds(67, 165, 78, 14);
		panel.add(lblStudentId);

		JLabel lblEmail = new JLabel("Email ");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(67, 211, 46, 14);
		panel.add(lblEmail);

		textField_0 = new JTextField();
		textField_0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_0.setBounds(215, 74, 198, 27);
		panel.add(textField_0);
		textField_0.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(215, 114, 198, 27);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(215, 159, 198, 27);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(215, 205, 198, 27);
		panel.add(textField_3);

		JLabel lblRegistrationCode = new JLabel("Registration Code");
		lblRegistrationCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegistrationCode.setBounds(67, 257, 136, 27);
		panel.add(lblRegistrationCode);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(215, 257, 198, 27);
		panel.add(textField_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		panel_1.setBounds(643, 225, 592, 372);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblCourseSelection = new JLabel("Course Selection");
		lblCourseSelection.setBounds(197, 33, 186, 27);
		lblCourseSelection.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel_1.add(lblCourseSelection);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabbedPane.setBounds(10, 73, 563, 292);
		panel_1.add(tabbedPane);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Semester 1", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblMandatoryCourses = new JLabel("Mandatory Courses");
		lblMandatoryCourses.setBounds(21, 33, 156, 25);
		lblMandatoryCourses.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_2.add(lblMandatoryCourses);

		JLabel lblOptionalCourses = new JLabel("Optional Courses");
		lblOptionalCourses.setBounds(21, 179, 156, 25);
		lblOptionalCourses.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_2.add(lblOptionalCourses);

		JCheckBox checkBox1 = new JCheckBox("Java I");
		checkBox1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox1.setBounds(21, 65, 97, 23);
		panel_2.add(checkBox1);

		JCheckBox checkBox2 = new JCheckBox("Virtualization");
		checkBox2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox2.setBounds(21, 91, 97, 23);
		panel_2.add(checkBox2);

		JCheckBox checkBox3 = new JCheckBox("Operating System");
		checkBox3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox3.setBounds(21, 117, 144, 23);
		panel_2.add(checkBox3);

		JCheckBox checkBox4 = new JCheckBox("Networking I");
		checkBox4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox4.setBounds(21, 143, 97, 23);
		panel_2.add(checkBox4);

		JCheckBox checkBox5 = new JCheckBox("Big Data");
		checkBox5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox5.setBounds(286, 66, 97, 23);
		panel_2.add(checkBox5);

		JCheckBox checkBox6 = new JCheckBox("DBMS");
		checkBox6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox6.setBounds(286, 92, 97, 23);
		panel_2.add(checkBox6);

		JCheckBox checkBox7 = new JCheckBox("Liner Algebra");
		checkBox7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox7.setBounds(286, 118, 97, 23);
		panel_2.add(checkBox7);

		JCheckBox checkBox8 = new JCheckBox("Abstarct Algebra");
		checkBox8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox8.setBounds(286, 143, 117, 23);
		panel_2.add(checkBox8);

		JCheckBox checkBox9 = new JCheckBox("Communication Skills");
		checkBox9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox9.setBounds(21, 211, 144, 25);
		panel_2.add(checkBox9);

		JCheckBox checkBox10 = new JCheckBox("French A1");
		checkBox10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox10.setBounds(286, 211, 97, 23);
		panel_2.add(checkBox10);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Semester 2", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel label = new JLabel("Mandatory Courses");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(41, 25, 156, 25);
		panel_3.add(label);

		JCheckBox checkBox11 = new JCheckBox("Java II");
		checkBox11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox11.setBounds(41, 57, 97, 23);
		panel_3.add(checkBox11);

		JCheckBox checkBox12 = new JCheckBox("Cloud Computing I");
		checkBox12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox12.setBounds(41, 83, 156, 23);
		panel_3.add(checkBox12);

		JCheckBox checkBox13 = new JCheckBox("Operational Research");
		checkBox13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox13.setBounds(41, 109, 144, 23);
		panel_3.add(checkBox13);

		JCheckBox checkBox14 = new JCheckBox("Networking II");
		checkBox14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox14.setBounds(41, 135, 125, 23);
		panel_3.add(checkBox14);

		JLabel label_1 = new JLabel("Optional Courses");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(41, 171, 156, 25);
		panel_3.add(label_1);

		JCheckBox checkBox19 = new JCheckBox("Environmental Studies");
		checkBox19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox19.setBounds(41, 203, 188, 25);
		panel_3.add(checkBox19);

		JCheckBox checkBox20 = new JCheckBox("French A2");
		checkBox20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox20.setBounds(306, 203, 97, 23);
		panel_3.add(checkBox20);

		JCheckBox checkBox18 = new JCheckBox("Statistics I");
		checkBox18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox18.setBounds(306, 135, 117, 23);
		panel_3.add(checkBox18);

		JCheckBox checkBox17 = new JCheckBox("Inference");
		checkBox17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox17.setBounds(306, 110, 97, 23);
		panel_3.add(checkBox17);

		JCheckBox checkBox16 = new JCheckBox("Data Structure");
		checkBox16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox16.setBounds(306, 84, 117, 23);
		panel_3.add(checkBox16);

		JCheckBox checkBox15 = new JCheckBox("Machine Learning");
		checkBox15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox15.setBounds(306, 58, 150, 23);
		panel_3.add(checkBox15);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Semester 3", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel label_2 = new JLabel("Mandatory Courses");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(55, 29, 156, 25);
		panel_4.add(label_2);

		JCheckBox checkBox21 = new JCheckBox("Python");
		checkBox21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox21.setBounds(55, 61, 97, 23);
		panel_4.add(checkBox21);

		JCheckBox checkBox22 = new JCheckBox("Cloud Computing II");
		checkBox22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox22.setBounds(55, 87, 131, 23);
		panel_4.add(checkBox22);

		JCheckBox checkBox23 = new JCheckBox("Statistics II");
		checkBox23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox23.setBounds(55, 113, 144, 23);
		panel_4.add(checkBox23);

		JCheckBox checkBox24 = new JCheckBox("Advanced Networking ");
		checkBox24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox24.setBounds(55, 139, 156, 23);
		panel_4.add(checkBox24);

		JCheckBox checkBox28 = new JCheckBox("Advanced Mathematics");
		checkBox28.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox28.setBounds(320, 139, 156, 23);
		panel_4.add(checkBox28);

		JCheckBox checkBox27 = new JCheckBox("Differential Equations");
		checkBox27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox27.setBounds(320, 114, 173, 23);
		panel_4.add(checkBox27);

		JCheckBox checkBox26 = new JCheckBox("Software Development");
		checkBox26.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox26.setBounds(320, 88, 173, 23);
		panel_4.add(checkBox26);

		JCheckBox checkBox25 = new JCheckBox("Deep Learning");
		checkBox25.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox25.setBounds(320, 62, 131, 23);
		panel_4.add(checkBox25);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Semester 4", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel label_4 = new JLabel("Mandatory Courses");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(51, 32, 156, 25);
		panel_5.add(label_4);

		JCheckBox checkBox29 = new JCheckBox("Data Mining");
		checkBox29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox29.setBounds(51, 64, 97, 23);
		panel_5.add(checkBox29);

		JCheckBox checkBox30 = new JCheckBox("Discrete Mathematics");
		checkBox30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox30.setBounds(51, 90, 156, 23);
		panel_5.add(checkBox30);

		JCheckBox checkBox31 = new JCheckBox("Numerical Methods");
		checkBox31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox31.setBounds(51, 116, 144, 23);
		panel_5.add(checkBox31);

		JCheckBox checkBox32 = new JCheckBox("Sample Surveys ");
		checkBox32.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox32.setBounds(51, 142, 131, 23);
		panel_5.add(checkBox32);

		JCheckBox checkBox36 = new JCheckBox("Real Analysis");
		checkBox36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox36.setBounds(315, 142, 117, 23);
		panel_5.add(checkBox36);

		JCheckBox checkBox35 = new JCheckBox("Applied Statistics");
		checkBox35.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox35.setBounds(316, 117, 131, 23);
		panel_5.add(checkBox35);

		JCheckBox checkBox34 = new JCheckBox("Advanced Calculus ");
		checkBox34.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox34.setBounds(316, 91, 131, 23);
		panel_5.add(checkBox34);

		JCheckBox checkBox33 = new JCheckBox("Data Communication");
		checkBox33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox33.setBounds(316, 65, 167, 23);
		panel_5.add(checkBox33);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_6.setBounds(48, 582, 431, 57);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);

		JButton btnExit = new JButton("Exit");
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 23, 89, 23);
		panel_6.add(btnExit);

		JButton btnReset = new JButton("Reset");
		btnReset.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkBox1.setSelected(false);
				checkBox2.setSelected(false);
				checkBox3.setSelected(false);
				checkBox4.setSelected(false);
				checkBox5.setSelected(false);
				checkBox6.setSelected(false);
				checkBox7.setSelected(false);
				checkBox8.setSelected(false);
				checkBox9.setSelected(false);
				checkBox10.setSelected(false);
				checkBox11.setSelected(false);
				checkBox12.setSelected(false);
				checkBox13.setSelected(false);
				checkBox14.setSelected(false);
				checkBox15.setSelected(false);
				checkBox16.setSelected(false);
				checkBox17.setSelected(false);
				checkBox18.setSelected(false);
				checkBox19.setSelected(false);
				checkBox20.setSelected(false);
				checkBox21.setSelected(false);
				checkBox22.setSelected(false);
				checkBox23.setSelected(false);
				checkBox24.setSelected(false);
				checkBox25.setSelected(false);
				checkBox26.setSelected(false);
				checkBox27.setSelected(false);
				checkBox28.setSelected(false);
				checkBox29.setSelected(false);
				checkBox30.setSelected(false);
				checkBox31.setSelected(false);
				checkBox32.setSelected(false);
				checkBox33.setSelected(false);
				checkBox34.setSelected(false);
				checkBox35.setSelected(false);
				checkBox36.setSelected(false);
				textField_0.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				s1 = 0;
				s2 = 0;
				s3 = 0;
				s4 = 0;

			}
		});
		btnReset.setBounds(109, 23, 89, 23);
		panel_6.add(btnReset);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField_0.getText().toString();
				String cllass = textField_1.getText().toString();
				String studentid = textField_2.getText().toString();
				String email = textField_3.getText().toString();
				String Rcode = textField_4.getText().toString();
				//
				// check if subjects selected are less than 5
				//
				if (checkBox1.isSelected()) {
					s1++;
				}
				if (checkBox2.isSelected()) {
					s1++;
				}
				if (checkBox3.isSelected()) {
					s1++;
				}
				if (checkBox4.isSelected()) {
					s1++;
				}
				if (checkBox5.isSelected()) {
					s1++;
				}
				if (checkBox6.isSelected()) {
					s1++;
				}
				if (checkBox7.isSelected()) {
					s1++;
				}
				if (checkBox8.isSelected()) {
					s1++;
				}

				if (checkBox11.isSelected()) {
					s2++;
				}
				if (checkBox12.isSelected()) {
					s2++;
				}
				if (checkBox13.isSelected()) {
					s2++;
				}
				if (checkBox14.isSelected()) {
					s2++;
				}
				if (checkBox15.isSelected()) {
					s2++;
				}
				if (checkBox16.isSelected()) {
					s2++;
				}
				if (checkBox17.isSelected()) {
					s2++;
				}
				if (checkBox18.isSelected()) {
					s2++;

				}
				if (checkBox21.isSelected()) {
					s3++;
				}
				if (checkBox22.isSelected()) {
					s3++;
				}
				if (checkBox23.isSelected()) {
					s3++;
				}
				if (checkBox24.isSelected()) {
					s3++;
				}

				if (checkBox25.isSelected()) {
					s3++;
				}
				if (checkBox26.isSelected()) {
					s3++;
				}
				if (checkBox27.isSelected()) {
					s3++;
				}
				if (checkBox28.isSelected()) {
					s3++;
				}
				if (checkBox29.isSelected()) {
					s4++;
				}
				if (checkBox30.isSelected()) {
					s4++;
				}
				if (checkBox31.isSelected()) {
					s4++;
				}
				if (checkBox32.isSelected()) {
					s4++;
				}
				if (checkBox33.isSelected()) {
					s4++;
				}
				if (checkBox34.isSelected()) {
					s4++;
				}
				if (checkBox35.isSelected()) {
					s4++;
				}
				if (checkBox36.isSelected()) {
					s4++;
				}

				if (((studentid.equals("C0761023") && Rcode.equals("761023")
						|| (studentid.equals("C0761024") && Rcode.equals("761024"))
						|| (studentid.equals("C0761025") && Rcode.equals("761025"))
						|| (studentid.equals("C0761026") && Rcode.equals("761026"))
						|| (studentid.equals("C0761027") && Rcode.equals("761027"))
						|| (studentid.equals("C0761028") && Rcode.equals("761028"))
						|| (studentid.equals("C0761029") && Rcode.equals("761029"))))) {
					if (al.contains(studentid)) {
						JOptionPane.showMessageDialog(null, "StudentID already used");
					} else {
						if (name.equals("") || cllass.equals("") || email.equals("")) {
							JOptionPane.showMessageDialog(null, "Data Fields Empty");
						}
						if (s1 < 5 || s2 < 5 || s3 < 5 || s4 < 5) {
							JOptionPane.showMessageDialog(null, "Please select atlest 6 subjects in each semester");
						} else {
							JOptionPane.showMessageDialog(null, "Registration Done");
							al.add(studentid);
							flag = 1;
						}

					}
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Student ID or Registration Code");
				}
			}
		});

		btnSubmit.setBounds(213, 23, 89, 23);
		panel_6.add(btnSubmit);

		JButton btnSaveData = new JButton("Save Data");
		btnSaveData.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSaveData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaveData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String studentid = textField_2.getText().toString();
				if (flag == 1) {

					try {
						BufferedWriter bw = new BufferedWriter(
								new FileWriter("C:\\Users\\Vinay Moond\\Desktop\\" + studentid + ".txt"));
						bw.write("*** STUDENT DETAILS ***");
						bw.newLine();
						bw.write("Name - " + textField_0.getText());
						bw.newLine();
						bw.write("Class - " + textField_1.getText());
						bw.newLine();
						bw.write("StudentID - " + textField_2.getText());
						bw.newLine();
						bw.write("Email - " + textField_3.getText());
						bw.newLine();
						bw.newLine();
						bw.write("*** COURSE SELECTED ***");
						bw.newLine();
						bw.write("Semester 1 - ");
						bw.newLine();
						if (checkBox1.isSelected()) {
							bw.write("		Java I");
							bw.newLine();
						}
						if (checkBox2.isSelected()) {
							bw.write("		Virtualization");
							bw.newLine();
						}
						if (checkBox3.isSelected()) {
							bw.write("		Operating System");
							bw.newLine();
						}
						if (checkBox4.isSelected()) {
							bw.write("		Networking I");
							bw.newLine();
						}
						if (checkBox5.isSelected()) {
							bw.write("		Big Data");
							bw.newLine();
						}
						if (checkBox6.isSelected()) {
							bw.write("		DBMS");
							bw.newLine();
						}
						if (checkBox7.isSelected()) {
							bw.write("		Liner Algebra");
							bw.newLine();
						}
						if (checkBox8.isSelected()) {
							bw.write("		Abstarct Algebra");
							bw.newLine();
						}
						if (checkBox9.isSelected()) {
							bw.write("		Communication Skills (Optional)");
							bw.newLine();
						}
						if (checkBox10.isSelected()) {
							bw.write("		French A1 (Optional)");
							bw.newLine();
						}
						bw.newLine();
						bw.write("Semester 2 - ");
						bw.newLine();
						if (checkBox11.isSelected()) {
							bw.write("		Java II");
							bw.newLine();
						}
						if (checkBox12.isSelected()) {
							bw.write("		Cloud Computing I");
							bw.newLine();
						}
						if (checkBox13.isSelected()) {
							bw.write("		Operational Research");
							bw.newLine();
						}
						if (checkBox14.isSelected()) {
							bw.write("		Networking II");
							bw.newLine();
						}
						if (checkBox15.isSelected()) {
							bw.write("		Machine Learning");
							bw.newLine();
						}
						if (checkBox16.isSelected()) {
							bw.write("		Data Structure");
							bw.newLine();
						}
						if (checkBox17.isSelected()) {
							bw.write("		Inference");
							bw.newLine();
						}
						if (checkBox18.isSelected()) {
							bw.write("		Statistics I");
							bw.newLine();
						}
						if (checkBox19.isSelected()) {
							bw.write("		Environmental Studies (Optional)");
							bw.newLine();
						}
						if (checkBox20.isSelected()) {
							bw.write("		French A2 (Optional)");
							bw.newLine();
						}
						bw.newLine();
						bw.write("Semester 3 - ");
						bw.newLine();
						if (checkBox21.isSelected()) {
							bw.write("		Python");
							bw.newLine();
						}
						if (checkBox22.isSelected()) {
							bw.write("		Cloud Computing II");
							bw.newLine();
						}
						if (checkBox23.isSelected()) {
							bw.write("		Statistics II");
							bw.newLine();
						}
						if (checkBox24.isSelected()) {
							bw.write("		Advanced Networking");
							bw.newLine();
						}
						if (checkBox25.isSelected()) {
							bw.write("		Advanced Mathematics");
							bw.newLine();
						}
						if (checkBox26.isSelected()) {
							bw.write("		Differential Equations");
							bw.newLine();
						}
						if (checkBox27.isSelected()) {
							bw.write("		Software Development");
							bw.newLine();
						}
						if (checkBox28.isSelected()) {
							bw.write("		Deep Learning");
							bw.newLine();
						}
						bw.newLine();
						bw.write("Semester 4 - ");
						bw.newLine();
						if (checkBox29.isSelected()) {
							bw.write("		Data Mining");
							bw.newLine();
						}
						if (checkBox30.isSelected()) {
							bw.write("		Discrete Mathematics");
							bw.newLine();
						}
						if (checkBox31.isSelected()) {
							bw.write("		Numerical Methods");
							bw.newLine();
						}
						if (checkBox32.isSelected()) {
							bw.write("		Sample Surveys");
							bw.newLine();
						}
						if (checkBox33.isSelected()) {
							bw.write("		Real Analysis");
							bw.newLine();
						}
						if (checkBox34.isSelected()) {
							bw.write("		Applied Statistics");
							bw.newLine();
						}
						if (checkBox35.isSelected()) {
							bw.write("		Advanced Calculus");
							bw.newLine();
						}
						if (checkBox36.isSelected()) {
							bw.write("		Data Communication");
							bw.newLine();
						}
						bw.close();
						JOptionPane.showMessageDialog(null, "Data Saved");
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Cannot save data, Registration Pening");
				}
			}
		});

		btnSaveData.setBounds(310, 23, 111, 23);
		panel_6.add(btnSaveData);
	}
}
