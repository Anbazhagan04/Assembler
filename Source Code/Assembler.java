import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.border.BevelBorder;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;



import java.util.Arrays;
import java.util.stream.IntStream;

import java.io.File;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Component;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.TableCellRenderer;

 
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Assembler extends Main{
	
 static	String asmarr[] = new String[200];
 static	String hackarr[] = new String[200];
 static Assembler obj = new Assembler();
	private JFrame frame;
	private JTable table;
	private JTable table_1;
	protected File a;
	protected Object b;
	protected Object pathhack;
	 String line,Assem;
     int i;
     String fin;
	String outv,temp[][]=new String[200][200],data[][]=new String[200][200];
	 int n;
    NumberFormatException Error;
	protected int l;
	protected int f;
	protected String p;
	protected int g;
	protected int h=0;
	protected Object s;
	protected String y;
	protected String w;
	private Object[][] object;
	protected String Dval;
	protected int eqind;
	protected String instruct;
	protected int eq;
	protected int ju;
	protected int op;
	protected String as;

	protected int N;

	protected int kin;

	protected int pi;

	protected int zi;

	protected int ri;

	protected Object bu;
	protected Color color;
	protected int mo;
	protected int j;
	protected boolean co;
	protected int kl;
	protected int result;
	private JTextField textField_err;
	private JTextField textField;
	protected File ap;
	protected boolean asmfile=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assembler window = new Assembler();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assembler() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				int key = e.getButton();
				if(key==e.BUTTON3)
				{
					JOptionPane close = new JOptionPane();
					result=close.showConfirmDialog(frame, "Wanna Exit Window ?", "Confirm", close.YES_NO_OPTION, close.QUESTION_MESSAGE);
					if(result==close.YES_OPTION)
					{
						frame.dispose();
					}
				}
			}
		});
		frame.setBounds(100, 100, 1039, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(10, 11, 1005, 560);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 58, 240, 445);
		panel.add(scrollPane);
		
		table = new JTable();
		
		table.setSurrendersFocusOnKeystroke(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setColumnSelectionAllowed(false);
		table.setRowHeight(25);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"S.No", "Instructions"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(175);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(368, 58, 240, 445);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"S.No", "Machine Code"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(49);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(175);
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setRowHeight(25);
		table_1.setColumnSelectionAllowed(false);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(681, 58, 240, 445);
		panel.add(scrollPane_2);
		scrollPane_2.setVisible(false);
		
	 JTable	table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"S.No", "Machine Code"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(0).setResizable(false);
		table_2.getColumnModel().getColumn(0).setPreferredWidth(49);
		table_2.getColumnModel().getColumn(1).setResizable(false);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(175);
		table_2.setSurrendersFocusOnKeystroke(true);
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_2.setRowHeight(25);
		table_2.setColumnSelectionAllowed(false);
		table_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane_2.setViewportView(table_2);
		
		textField = new JTextField();
		textField.setBounds(10, 512, 985, 37);
		panel.add(textField);
		textField.setEditable(false);
		textField.setColumns(10);
		
		textField_err = new JTextField();
		textField_err.setEditable(false);
		textField_err.setColumns(10);
		textField_err.setBounds(10, 582, 1005, 32);
		frame.getContentPane().add(textField_err);
		
		JFileChooser fileChooser = new JFileChooser();
		 
		 
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setMargin(new Insets(225, 0, 225, 0));
		frame.setJMenuBar(menuBar);
		
		JMenu filemenu = new JMenu("File");
		menuBar.add(filemenu);
		
		JMenuItem codemenu = new JMenuItem("Load Code");
		codemenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				table.setRowSelectionInterval(0, 0);
				table_1.setRowSelectionInterval(0, 0);
				table.setSelectionBackground(Color.WHITE);
				table_1.setSelectionBackground(Color.WHITE);
          fileChooser.setCurrentDirectory(new File("R:\\AVV\\SEM2\\EOC\\Nand2tetris"));
        
		 
				int response=fileChooser.showOpenDialog(null);
				if (response==JFileChooser.APPROVE_OPTION)
				{
					
					ri=0;
					File pathasm = new File(fileChooser.getSelectedFile().getAbsolutePath()); 
					Assembler c = new Assembler(); 
					ap=pathasm;
					String s=ap.toString();
					
					if(s.contains(".asm"))
					{
						textField.setText(s);
						try { 
							File asm = new File(s);
							Scanner myReader = new Scanner(asm);
							if(asm.exists())
						      {int t=0;
						     
								while (t<200) 
							      {
							    	  table.setValueAt("",t, 1);
							    	  table.setValueAt("",t, 0);
							    	  table_2.setValueAt("",t, 1);
							    	  table_1.setValueAt("",t, 1);
							    	  table_2.setValueAt("",t, 0);
							    	  table_1.setValueAt("",t, 0);
							    	  asmarr[t]="";
							    	  t++;
							      }
								
						    	  System.out.println("File Exist");
						      }  zi=0;
							 i=0;
							 N=0;
							 asmfile=true;
						      while (myReader.hasNext()) 
						      {
								     
								    line= myReader.nextLine();							    		
								    StringTokenizer st = new StringTokenizer(line, " ");   
								    StringBuffer sb = new StringBuffer();
								      while(st.hasMoreElements()){
								          sb.append(st.nextElement()).append(" ");  
								        if(!sb.toString().startsWith("/")) 
								        {
								        	if(!sb.toString().isBlank())
								        	{
								        		
								        		 if(sb.toString().contains("/")==true)
												    {
												    	op=sb.toString().indexOf("/");
												    	as=sb.toString().replace(sb.toString().substring(op),"");
												    	
												    	asmarr[zi]=as;
												    	
												    	zi++;
												    }
												    else
												    {
												    	asmarr[zi] =sb.toString();
												    	System.out.println(asmarr[zi]);
												    	zi++;
												    }
								        	}
								        }
								    
								      }
								      
								      if(!asmarr[N].isEmpty())
								      {
								    	if(!asmarr[N].contains("(")) 
								    	{
								    		table.setValueAt(ri, N, 0);
								    		ri++;
								    	}
								    	 table.setValueAt(asmarr[N],N, 1);
								    	  N++;
								      }
								        
								      
								    		  i++;
						      }
						     
						     
						      myReader.close();
						}
					    catch(FileNotFoundException e2)
					    {
					    	textField_err.setForeground(Color.red);
					    	textField_err.setText("An Error Occur while Loding the ASM File");
					    }
						
						table.setSelectionBackground(Color.YELLOW);
						table_1.setSelectionBackground(Color.YELLOW);
						table_2.setSelectionBackground(Color.YELLOW);
					}
					else
					{
						textField_err.setForeground(Color.red);
				    	textField_err.setText("An Error Occur while Loding the ASM File");
				  int  t=0;
				    	while(t<100)
				    	{
				    		table.setValueAt("", t, 1);
				    		table.setValueAt("", t, 0);
				    		table_1.setValueAt("", t, 1);
				    		table_1.setValueAt("", t, 0);
				    		scrollPane_2.setVisible(false);
				    		textField.setText(null);

				    		t++;
				    	}
				    	
					}

						 
				}
			}
		});
		filemenu.add(codemenu);
		
		JMenuItem cmpmenu = new JMenuItem("Load Compare File");
		cmpmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				table_2.setForeground(Color.BLACK);
				
				i=0;
				zi=0;
				N=0;
				ri=0;
       fileChooser.setCurrentDirectory(new File("R:\\AVV\\SEM2\\EOC\\Nand2tetris\\mycode\\hack"));
				
				int response=fileChooser.showOpenDialog(null);
				if (response==JFileChooser.APPROVE_OPTION)
				{
					File pathhack = new File(fileChooser.getSelectedFile().getAbsolutePath()); 
					b=pathhack;
					
					scrollPane_2.setVisible(true);
				
					String s=b.toString();
					
					if(s.contains(".hack")&&asmfile==true)
					{
						textField.setText("ASM File : "+ap+"\n  "+"HACK File : "+s);
						File asm = new File(s);
						try 
						{
							Scanner myReader = new Scanner(asm);
							if(asm.exists())
						      {
								int t=0;
						     
								while (t<200) 
							      {
							    	  table_2.setValueAt("",t, 1);
							    	  
							    	  t++;
							      }
								
						    	  System.out.println("File Exist");
						      }  
							 while (myReader.hasNext()) 
						      {
								     
								    line= myReader.nextLine();							    		
								    StringTokenizer st = new StringTokenizer(line, " ");   
								    StringBuffer sb = new StringBuffer();
								      while(st.hasMoreElements()){
								          sb.append(st.nextElement()).append(" ");  
								        if(!sb.toString().startsWith("/")) 
								        {
								        	
								        	if(!sb.toString().isBlank()&&!asmarr[zi].contains("("))
								        	{
								        		
								        		 if(sb.toString().contains("/")==true)
												    {
												    	op=sb.toString().indexOf("/");
												    	as=sb.toString().replace(sb.toString().substring(op),"");
												    	
												    	hackarr[zi]=as;
												    
												    	
												    	
												    	
												    }
												    else
												    {
												    	
												    	hackarr[zi] =sb.toString();
												    
												    	
												    }
								        	}
								        	else
								        	{        zi++;
								        		if(sb.toString().contains("/")==true)
											    {
											    	op=sb.toString().indexOf("/");
											    	as=sb.toString().replace(sb.toString().substring(op),"");
											    	
											    	hackarr[zi]=as;
											    	
											    	
											    	
											    	
											    }
											    else
											    {
											    	
											    	hackarr[zi] =sb.toString();
											    
											    	
											    }
								        	}
								        }
								        zi++;
								      }
								      
								      
								    		  i++;
						      }
							 j=0;
							 while(j<asmarr.length)
							 {
								 
							      if(asmarr[j]!=null)
							      {
							    	if(!asmarr[j].contains("(")&&!asmarr[j].isEmpty()) 
							    	{
							    		
							    		table_2.setValueAt(ri, j, 0);
							    		
							    		ri++;
							    	 table_2.setValueAt(hackarr[j],j, 1);
							    	 
							    	 kl=j;
							    	
							    	}
							    	
							      }
							      
							      j++; 
							 }
							 j=kl;
							 while(hackarr[j]!=null)
							 {
								 
							    
							    		table_2.setValueAt(ri, j, 0);
							    		
							    		ri++;
							    	 table_2.setValueAt(hackarr[j],j, 1);
							    	 
							    	 
							  
							      j++; 
							 }
							 
						     
						     
						      myReader.close();
							
							
						} catch (FileNotFoundException e1)
						{
							textField_err.setForeground(Color.red);
					    	textField_err.setText("An Error Occur while Loding the HACK File");
							
						}
						
					}
					
					else 
					{
						textField_err.setForeground(Color.red);
				    	textField_err.setText("An Error Occur while Loding the HACK File");
					}
					
				}
				
			}
		});
		filemenu.add(cmpmenu);
		
		JSeparator separator = new JSeparator();
		filemenu.add(separator);
		
		JMenuItem clrmenu = new JMenuItem("Clear all");
		clrmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				scrollPane_2.setVisible(false);
				int t=0;
				while (t<200) 
			      {
					  table.setValueAt("",t, 1);
			    	  table_1.setValueAt("",t, 1);
			    	  table.setValueAt("",t, 0);
			    	  table_1.setValueAt("",t, 0);
			    	  asmarr[t]="";
			    	  hackarr[t]="";
			    	  t++;
			    	  table.setSelectionBackground(null);
			    	  table_1.setSelectionBackground(null);
			    	  
			      }
			}
		});
		filemenu.add(clrmenu);
		
		
		
		
		
		JMenuItem Exitmenu = new JMenuItem("Exit");
		Exitmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane exit = new JOptionPane();
				result=exit.showConfirmDialog(exit, "Are you sure ?","Confirm",exit.YES_NO_OPTION, exit.QUESTION_MESSAGE);
				if(result==exit.YES_OPTION)
				{
				   frame.dispose();
				}
				
			}
		});
		filemenu.add(Exitmenu);
		
		JMenu runmenu = new JMenu("Run");
		menuBar.add(runmenu);
		
		JMenuItem upflowmenu = new JMenuItem("Run Forward");
		upflowmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ri=0;
				int t=0;
				while (t<100) 
			      {
			    	  
			    	  table_1.setValueAt("",t, 1);
			    	  table_2.setValueAt("", t, 1);
			    	  table_1.setValueAt("",t, 0);
			    	  table_2.setValueAt("", t, 0);
			    	  t++;
			      }
				pi=0;
				N=0;
                l=0;
				i=0;
				n=0;
				String aregv;
				mo=0;
while(i<asmarr.length)
{
	
					aregv=asmarr[i];
					boolean ready=false;
					
  if(asmarr[i]!=null)
   {
	  
	   if(asmarr[i].contains("@"))
		{
			int j =1,a[]=new int[asmarr[i].length()],Bit[]=new int[asmarr[i].length()];
			char bit[]=new char[asmarr[i].length()];
			String w = "" ;
			if(asmarr[i].replace(" ", "").length()>2)
			{
				ready=true;
			}
			if(asmarr[i].replace(" ", "").length()==2)
			{
				
				a[j]=aregv.replace(" ", "").indexOf("@")+j;
				bit[j]= aregv.replace(" ", "").charAt(a[j]);
				
				
				try
				{
					Bit[j]=Integer.parseInt(String.valueOf(bit[j]));
					fin=String.valueOf(Bit[j]);
					outv=String.format("%16s", Integer.toBinaryString(Integer.parseInt(fin))).replace(' ', '0');
				}
				catch(NumberFormatException m)
				{
					
					ready=true;
					fin="";
					a[j]=0;
					
					
					
				}
				
			}
			 if(ready==true)
			{
				
				 j =1;
				while(asmarr[i].replace(" ", "").length()-1>=j)
				{
					
					a[j]=aregv.indexOf("@")+j;
					bit[j]= aregv.charAt(a[j]);
					Assembler value;
					
					
					
					boolean standard=false;
					boolean lable =false;
					boolean test=false;
					try 
					{
						
						Bit[j]= Integer.parseInt(String.valueOf(bit[j]));
						obj.Error=null;
					}
					
					catch(NumberFormatException Error)
					{
						obj.Error=Error;
						if(aregv.length()>3)
						{
							std();	
							
							
					    	
						
							for(int q=0;q<std.length;++q)
							{	
								
						    	
							if(std[q][0].equals(aregv.replace("@", "").replace(" ", "")))
						  { 
								
								       lable =true;
										standard=true;
										temp[l][0]=std[q][1];
										temp[l][1]=std[q][0];
										fin=temp[l][0];
										
										++l;
										
										
										j=asmarr[i].length();
										
										
						  }
							
							}
							kin=0;
							
							if(standard==false) 
							{
								

								
								
								y="(".concat(aregv.replace("@", "").replace(" ", "").concat(")")).toString();
								
								for(int r=0;r<asmarr.length;++r)
								{   
									if(asmarr[r]!=null&&!asmarr[r].isBlank())
									{
										
										w=asmarr[r].replace(" ", "");
										
										if(w.equals(y))
										{
											
											temp[l][1]=aregv.replace("@", "").replace(" ", "");
										bu=	table.getValueAt(r+1, 0);
										
											temp[l][0]=String.valueOf(bu);
											
											fin=temp[l][0];
											
											lable =true;
											
											j=asmarr[i].length();
											
										}
											
										kin++;
									}
									
								}
								if(lable!=true)
								{
									++l;
								}
								
								
						}
						
							
						}
					if(lable==false)
					{     Bit[j]=f;
					
					
						if(aregv.replace(" ", "").length()>2)
						{
							
							aregv=aregv.replace("@", "").replace(" ", "");
							
							for(int k = 0;k<l;++k)
							{
								if(temp[k][1]!=null)
								{
									if(temp[k][1].equals(aregv))
									{
										
										p=temp[k][0];
										test=true;
										k=l+1;
									}	
								}
								
							}
							
							if(test==false)
							{
								if(mo!=0)
								{
								  n++;
								 
								}
								Bit[j]=16+n;
								 mo++;
								
								f=Bit[j];
								temp[l][0]=String.valueOf(f);
								temp[l][1]=aregv;
								fin=temp[l][0];
								
								
							}
							else
							{
								fin=p;
								
							}
						}
					else 
					{
						for(int k =0;k<l;++k)
						{
							
							if(temp[k][1].equals(String.valueOf(bit[j])))
							{
								
								p=temp[k][0];
								
							   test=true;
							   k=l+1;
							   
							}
						}
						
						if(test==false)
						{
							if(mo!=0)
							{
							  n++;
							}
							Bit[j]=16+n;
							
							f=Bit[j];
							mo++;
							if(asmarr[i].length()>2)
							{
								temp[l][1]=aregv.replace("@", "");
								temp[l][1]=temp[l][1].replace(" ", "");
							}
							else
							{
								temp[l][1]=String.valueOf(bit[j]).replace("@", "");
								temp[l][1]=temp[l][1].valueOf(bit[j]).replace(" ", "");
							}
							temp[l][0]=String.valueOf(f);
							fin=temp[l][0];
							
						}
						else if(test==true)
						{
							fin=p;
							
							
						}
						
						
						
					}

						j=asmarr[i].length();
						
					++l;
						
						}
				
					
					
					
					
					}
					j++;
					
				}
				
				 j=1;
					
					while(j<asmarr[i].length()-1)
					{
						
						
						if(obj.Error==null&&j<asmarr[i].length()-2)
						{
							fin=String.valueOf(Bit[j]).concat(String.valueOf(Bit[j+1]));
							
							
							outv=String.format("%16s", Integer.toBinaryString(Integer.parseInt(fin))).replace(' ', '0');
							
							
						}
						
						else if(obj.Error!=null)
						{
							
							
							outv=String.format("%16s", Integer.toBinaryString(Integer.parseInt(fin))).replace(' ', '0');
							
						}
						
						j++;
						
					}
				
				
			}
			
			
        
			
	
			table_1.setValueAt(outv, N, 1);
			table_1.setValueAt(ri, N, 0);
			
			N++;
			ri++;
		}
	   if(asmarr[i].contains("(")||asmarr[i].contains(")"))
	   {
		   table_1.setValueAt("", N, 1);
			N++;
	   }
	   
	   
	   if(aregv.startsWith("D")||aregv.startsWith("A")||aregv.startsWith("M")||aregv.startsWith("0")&&aregv!=null)
	   {
		  
		  String List[][]=new String [aregv.length()][aregv.length()];
		  
		  
		  // instruction
		if(  aregv.contains("="))
		{
			 aregv= aregv.replace(" ", "");
			 eq = aregv.indexOf("=")+1;
		    	
			 if(aregv.startsWith("AMD"))
     		{
     			reg="AMD";
     		}
     		else if(aregv.startsWith("AD"))
     		{
     			reg="AD";
     		}
     		else if(aregv.startsWith("AM"))
     		{
     			reg="AM";
     		}
     		else if(aregv.startsWith("MD"))
     		{
     			reg="MD";
     		}
     		else if(aregv.startsWith("A"))
     		{
     			reg="A";
     		}
     		else if(aregv.startsWith("M"))
     		{
     			reg="M";
     		}
     		else if(aregv.startsWith("D"))
     		{
     			reg="D";
     		}
     		else 
     		{
     			reg="null";
     		}
     		dest();
			
     		 if(aregv.startsWith("0",eq))
      		{
     			valuecomp="0";
      		}
     		
     		else if(aregv.startsWith("D+1",eq))
       		{
      			valuecomp="D+1";
       		}
     		else if(aregv.startsWith("A+1",eq))
       		{
      			valuecomp="A+1";
       		}
     		else if(aregv.startsWith("D-1",eq))
       		{
      			valuecomp="D-1";
       		}
     		else if(aregv.startsWith("A-1",eq))
       		{
      			valuecomp="A-1";
       		}
     		else if(aregv.startsWith("D+A",eq))
       		{
      			valuecomp="D+A";
       		}
     		else if(aregv.startsWith("D-A",eq))
       		{
      			valuecomp="D-A";
       		}
     		else if(aregv.startsWith("A-D",eq))
       		{
      			valuecomp="A-D";
       		}
     		else if(aregv.startsWith("D&A",eq))
       		{
      			valuecomp="D&A";
       		}
     		else if(aregv.startsWith("D|A",eq))
       		{
      			valuecomp="D|A";
       		}
     		 
     	
       		else if(aregv.startsWith("M+1",eq))
       		{
      			valuecomp="M+1";
       		}
       		else if(aregv.startsWith("M-1",eq))
       		{
      			valuecomp="M-1";
       		}
     		else if(aregv.startsWith("D+M",eq))
       		{
      			valuecomp="D+M";
       		}
     		else if(aregv.startsWith("D-M",eq))
       		{
      			valuecomp="D-M";
       		}
     		else if(aregv.startsWith("M-D",eq))
       		{
      			valuecomp="M-D";
       		}
     		else if(aregv.startsWith("D&M",eq))
       		{
      			valuecomp="D&M";
       		}
     		else if(aregv.startsWith("D|M",eq))
       		{
      			valuecomp="D|M";
       		}
     		 else if(aregv.startsWith("1",eq))
        		{
       			valuecomp="1";
        		}
      		else if(aregv.startsWith("-1",eq))
        		{
       			valuecomp="-1";
        		}
      		else if(aregv.startsWith("D",eq))
        		{
       			valuecomp="D";
        		}
      		else if(aregv.startsWith("A",eq))
        		{
       			valuecomp="A";
        		}
      		else if(aregv.startsWith("!D",eq))
        		{
       			valuecomp="!D";
        		}
      		else if(aregv.startsWith("!A",eq))
        		{
       			valuecomp="!A";
        		}
      		else if(aregv.startsWith("-D",eq))
        		{
       			valuecomp="-D";
        		}
      		else if(aregv.startsWith("-A",eq))
        		{
       			valuecomp="-A";
        		}
      		else if(aregv.startsWith("M",eq))
       		{
      			valuecomp="M";
       		}
     		else if(aregv.startsWith("!M",eq))
       		{
      			valuecomp="!M";
       		}
     		else if(aregv.startsWith("-M",eq))
       		{
      			valuecomp="-M";
       		}
     		
     	comp();
     	
     jump="000";
     	 
     	    Main o = new Main();
     	    instruct="111".concat(o.a.concat(code.concat(value.concat(jump))));
     	   
     	    
            
		}
		//jump
		else if(aregv.contains(";")) 
		{
			aregv=aregv.replace(" ","");
			ju = aregv.indexOf(";")+1;
			value="000";
			 if(aregv.startsWith("0"))
	      		{
	     			valuecomp="0";
	      		}
	     		
	     		else if(aregv.startsWith("D+1"))
	       		{
	      			valuecomp="D+1";
	       		}
	     		else if(aregv.startsWith("A+1"))
	       		{
	      			valuecomp="A+1";
	       		}
	     		else if(aregv.startsWith("D-1"))
	       		{
	      			valuecomp="D-1";
	       		}
	     		else if(aregv.startsWith("A-1"))
	       		{
	      			valuecomp="A-1";
	       		}
	     		else if(aregv.startsWith("D+A"))
	       		{
	      			valuecomp="D+A";
	       		}
	     		else if(aregv.startsWith("D-A"))
	       		{
	      			valuecomp="D-A";
	       		}
	     		else if(aregv.startsWith("A-D"))
	       		{
	      			valuecomp="A-D";
	       		}
	     		else if(aregv.startsWith("D&A"))
	       		{
	      			valuecomp="D&A";
	       		}
	     		else if(aregv.startsWith("D|A"))
	       		{
	      			valuecomp="D|A";
	       		}
	     		 
	     		
	       		else if(aregv.startsWith("M+1"))
	       		{
	      			valuecomp="M+1";
	       		}
	       		else if(aregv.startsWith("M-1"))
	       		{
	      			valuecomp="M-1";
	       		}
	     		else if(aregv.startsWith("D+M"))
	       		{
	      			valuecomp="D+M";
	       		}
	     		else if(aregv.startsWith("D-M"))
	       		{
	      			valuecomp="D-M";
	       		}
	     		else if(aregv.startsWith("M-D"))
	       		{
	      			valuecomp="M-D";
	       		}
	     		else if(aregv.startsWith("D&M"))
	       		{
	      			valuecomp="D&M";
	       		}
	     		else if(aregv.startsWith("D|M"))
	       		{
	      			valuecomp="D|M";
	       		}
	     		 else if(aregv.startsWith("1"))
		       		{
		      			valuecomp="1";
		       		}
		     		else if(aregv.startsWith("-1"))
		       		{
		      			valuecomp="-1";
		       		}
		     		else if(aregv.startsWith("D"))
		       		{
		      			valuecomp="D";
		       		}
		     		else if(aregv.startsWith("A"))
		       		{
		      			valuecomp="A";
		       		}
		     		else if(aregv.startsWith("!D"))
		       		{
		      			valuecomp="!D";
		       		}
		     		else if(aregv.startsWith("!A"))
		       		{
		      			valuecomp="!A";
		       		}
		     		else if(aregv.startsWith("-D"))
		       		{
		      			valuecomp="-D";
		       		}
		     		else if(aregv.startsWith("-A"))
		       		{
		      			valuecomp="-A";
		       		}
		     		else if(aregv.startsWith("M"))
		       		{
		      			valuecomp="M";
		       		}
		     		else if(aregv.startsWith("!M"))
		       		{
		      			valuecomp="!M";
		       		}
		     		else if(aregv.startsWith("-M"))
		       		{
		      			valuecomp="-M";
		       		}
	     		
	     	comp();
	     	    if(aregv.startsWith("JGT", ju))
	     	    {
	     	    	valuejump="JGT";
	     	    }
	     	    else if(aregv.startsWith("JEQ", ju))
	     	    {
	     	    	valuejump="JEQ";
	     	    }
	     	   else if(aregv.startsWith("JGE", ju))
	    	    {
	    	    	valuejump="JGE";
	    	    }
	     	  else if(aregv.startsWith("JLT", ju))
	  	    {
	  	    	valuejump="JLT";
	  	    }
	     	 else if(aregv.startsWith("JNE", ju))
	 	    {
	 	    	valuejump="JNE";
	 	    }
	     	else if(aregv.startsWith("JLE", ju))
		    {
		    	valuejump="JLE";
		    }
	     	else if(aregv.startsWith("JMP", ju))
		    {
		    	valuejump="JMP";
		    }
	     	else 
		    {
		    	valuejump="null";
		    } 
	     	    jump();
	     	   Main o = new Main();
	     	   instruct="111".concat(o.a.concat(code.concat(value.concat(jump))));
	     	      
	     	    
	     	    
		}
		table_1.setValueAt(instruct, N, 1);
		table_1.setValueAt(ri, N, 0);
		N++;
		ri++;
	   }
	  
	   
	}
		
		
	   i++;
}
	
			}
		});
		runmenu.add(upflowmenu);
		
		JMenuItem goback = new JMenuItem("Go Back");
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int t=0;
			     
				while (t<200)  
			      {
					  table_1.setValueAt("", t, 1);
			    	  table_2.setValueAt("",t, 1);
			    	  table_1.setValueAt("", t, 0);
			    	  table_2.setValueAt("",t, 0);
			    	  
			    	  table_2.setForeground(Color.BLACK);
			    	  hackarr[t]="";
			    	  t++;
			      }
				
	
			}
		});
		runmenu.add(goback);
		
		JSeparator separator_1 = new JSeparator();
		runmenu.add(separator_1);
		
		JMenuItem savemenu = new JMenuItem("Save As");
		savemenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				   JFileChooser fs =new JFileChooser(new File("R:\\\\AVV\\\\SEM2\\\\EOC\\\\Nand2tetris\\\\mycode\\\\hack"));
				   fs.setDialogTitle("Save As");
				   fs.setFileFilter(new FileTypeFilter(".hack","HACK File"));
				   fs.setFileFilter(new FileTypeFilter(".txt","Text File"));
				int result=   fs.showSaveDialog(null);
				   if(result==JFileChooser.APPROVE_OPTION)
				   {
					   File fi =fs.getSelectedFile();
					   try
					   {
						   FileWriter fw = new FileWriter(fi.getPath());
						   for(int i =0;i<asmarr.length;++i )
							{
								if(asmarr[i]!=null)
								{
									String content=table_1.getModel().getValueAt(i, 1).toString();
									fw.write(content+"\n");
									
								}
							}
						   fw.flush();
							fw.close();
					   }
					   catch(Exception r)
					   {
						   JOptionPane.showMessageDialog(null, r.getMessage());
					   }
				   }
			}
		});
		runmenu.add(savemenu);
		
		
		JButton bt_Load = new JButton("");
		bt_Load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				table.setRowSelectionInterval(0, 0);
				table_1.setRowSelectionInterval(0, 0);
				table.setSelectionBackground(Color.WHITE);
				table_1.setSelectionBackground(Color.WHITE);
          fileChooser.setCurrentDirectory(new File("R:\\AVV\\SEM2\\EOC\\Nand2tetris"));
       
		 
				int response=fileChooser.showOpenDialog(null);
				if (response==JFileChooser.APPROVE_OPTION)
				{
					
					ri=0;
					File pathasm = new File(fileChooser.getSelectedFile().getAbsolutePath()); 
					Assembler c = new Assembler(); 
					ap=pathasm;
					String s=ap.toString();
					
					if(s.contains(".asm"))
					{
						textField.setText(s);
						try { 
							File asm = new File(s);
							Scanner myReader = new Scanner(asm);
							if(asm.exists())
						      {int t=0;
						     
								while (t<200) 
							      {
							    	  table.setValueAt("",t, 1);
							    	  table.setValueAt("",t, 0);
							    	  table_2.setValueAt("",t, 1);
							    	  table_1.setValueAt("",t, 1);
							    	  table_2.setValueAt("",t, 0);
							    	  table_1.setValueAt("",t, 0);
							    	  asmarr[t]="";
							    	  t++;
							      }
								
						    	  System.out.println("File Exist");
						      }  zi=0;
							 i=0;
							 N=0;
							 asmfile=true;
						      while (myReader.hasNext()) 
						      {
								     
								    line= myReader.nextLine();							    		
								    StringTokenizer st = new StringTokenizer(line, " ");   
								    StringBuffer sb = new StringBuffer();
								      while(st.hasMoreElements()){
								          sb.append(st.nextElement()).append(" ");  
								        if(!sb.toString().startsWith("/")) 
								        {
								        	if(!sb.toString().isBlank())
								        	{
								        		
								        		 if(sb.toString().contains("/")==true)
												    {
												    	op=sb.toString().indexOf("/");
												    	as=sb.toString().replace(sb.toString().substring(op),"");
												    	
												    	asmarr[zi]=as;
												    
												    	zi++;
												    }
												    else
												    {
												    	asmarr[zi] =sb.toString();
												    	
												    	zi++;
												    }
								        	}
								        }
								    
								      }
								      
								      if(!asmarr[N].isEmpty())
								      {
								    	if(!asmarr[N].contains("(")) 
								    	{
								    		table.setValueAt(ri, N, 0);
								    		ri++;
								    	}
								    	 table.setValueAt(asmarr[N],N, 1);
								    	  N++;
								      }
								        
								      
								    		  i++;
						      }
						     
						     
						      myReader.close();
						}
					    catch(FileNotFoundException e2)
					    {
					    	textField_err.setForeground(Color.red);
					    	textField_err.setText("An Error Occur while Loding the ASM File");
					    }
						
						table.setSelectionBackground(Color.YELLOW);
						table_1.setSelectionBackground(Color.YELLOW);
						table_2.setSelectionBackground(Color.YELLOW);
					}
					else
					{
						textField_err.setForeground(Color.red);
				    	textField_err.setText("An Error Occur while Loding the ASM File");
				    	  int  t=0;
					    	while(t<200)
					    	{
					    		table.setValueAt("", t, 1);
					    		table.setValueAt("", t, 0);
					    		table_1.setValueAt("", t, 1);
					    		table_1.setValueAt("", t, 0);
					    		scrollPane_2.setVisible(false);
					    		textField.setText(null);
					    		t++;
					    	}
					}
				}  
			}
		});
		menuBar.add(bt_Load);
		bt_Load.setBackground(Color.WHITE);
		bt_Load.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\File-New-icon (2).png"));
		
		JButton bt_clrall = new JButton("");
		bt_clrall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				scrollPane_2.setVisible(false);
				int t=0;
				while (t<200) 
			      {
					  table.setValueAt("",t, 1);
			    	  table_1.setValueAt("",t, 1);
			    	  table.setValueAt("",t, 0);
			    	  table_1.setValueAt("",t, 0);
			    	  asmarr[t]="";
			    	  hackarr[t]="";
			    	  t++;
			    	  table.setSelectionBackground(null);
			    	  table_1.setSelectionBackground(null);
			    	  textField.setText(null);
			    	  textField_err.setText(null);
			    	  
			      }
				
			}
		});
		
		JButton bt_save = new JButton("");
		bt_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				  JFileChooser fs =new JFileChooser(new File("R:\\\\AVV\\\\SEM2\\\\EOC\\\\Nand2tetris\\\\mycode\\\\hack"));
				   fs.setDialogTitle("Save As");
				   fs.setFileFilter(new FileTypeFilter(".hack","HACK File"));
				  
				int result=   fs.showSaveDialog(null);
				   if(result==JFileChooser.APPROVE_OPTION)
				   {
					   File fi =fs.getSelectedFile();
					   try
					   {
						   FileWriter fw = new FileWriter(fi.getPath());
						   for(int i =0;i<asmarr.length;++i )
							{
								if(asmarr[i]!=null&&!table_1.getModel().getValueAt(i, 1).toString().isBlank())
								{
									String content=table_1.getModel().getValueAt(i, 1).toString();
									fw.write(content+"\n");
									
								}
							}
						   fw.flush();
							fw.close();
					   }
					   catch(Exception r)
					   {
						   JOptionPane.showMessageDialog(null, r.getMessage());
					   }
				   }
			}
		});
		menuBar.add(bt_save);
		bt_save.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\iconfinder_save_2639912 (1).png"));
		
		
		menuBar.add(bt_clrall);
		bt_clrall.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\Actions-edit-clear-icon.png"));
		
		JButton bt_goback = new JButton("");
		menuBar.add(bt_goback);
		bt_goback.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\Fast-backward-icon.png"));
		
		
		
		
		JButton bt_ff = new JButton("");
		bt_ff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ri=0;
				int t=0;
				while (t<200) 
			      {
			    	  
			    	  table_1.setValueAt("",t, 1);
			    	  table_2.setValueAt("", t, 1);
			    	  table_1.setValueAt("",t, 0);
			    	  table_2.setValueAt("", t, 0);
			    	  t++;
			      }
				pi=0;
				N=0;
                l=0;
				i=0;
				n=0;
				String aregv;
				mo=0;
while(i<asmarr.length)
{
	
					aregv=asmarr[i];
					boolean ready=false;
					
  if(asmarr[i]!=null)
   {
	  
	   if(asmarr[i].contains("@"))
		{
			int j =1,a[]=new int[asmarr[i].length()],Bit[]=new int[asmarr[i].length()];
			char bit[]=new char[asmarr[i].length()];
			String w = "" ;
			if(asmarr[i].replace(" ", "").length()>2)
			{
				ready=true;
			}
			if(asmarr[i].replace(" ", "").length()==2)
			{
				
				a[j]=aregv.replace(" ", "").indexOf("@")+j;
				bit[j]= aregv.replace(" ", "").charAt(a[j]);
				
				
				try
				{
					Bit[j]=Integer.parseInt(String.valueOf(bit[j]));
					fin=String.valueOf(Bit[j]);
					outv=String.format("%16s", Integer.toBinaryString(Integer.parseInt(fin))).replace(' ', '0');
				}
				catch(NumberFormatException m)
				{
					
					ready=true;
					fin="";
					a[j]=0;
					
					
					
				}
				
			}
			 if(ready==true)
			{
				
				 j =1;
				while(asmarr[i].replace(" ", "").length()-1>=j)
				{
					
					a[j]=aregv.indexOf("@")+j;
					bit[j]= aregv.charAt(a[j]);
					Assembler value;
					
					
					
					boolean standard=false;
					boolean lable =false;
					boolean test=false;
					try 
					{
						
						Bit[j]= Integer.parseInt(String.valueOf(bit[j]));
						obj.Error=null;
					}
					
					catch(NumberFormatException Error)
					{
						obj.Error=Error;
						if(aregv.length()>3)
						{
							std();	
							
							
					    	
						
							for(int q=0;q<std.length;++q)
							{	
								
						    	
							if(std[q][0].equals(aregv.replace("@", "").replace(" ", "")))
						  { 
								
								       lable =true;
										standard=true;
										temp[l][0]=std[q][1];
										temp[l][1]=std[q][0];
										fin=temp[l][0];
										
										++l;
										
										
										j=asmarr[i].length();
										
										
						  }
							
							}
							kin=0;
							
							if(standard==false) 
							{
								

								
								
								y="(".concat(aregv.replace("@", "").replace(" ", "").concat(")")).toString();
								
								for(int r=0;r<asmarr.length;++r)
								{   
									if(asmarr[r]!=null&&!asmarr[r].isBlank())
									{
										
										w=asmarr[r].replace(" ", "");
										
										if(w.equals(y))
										{
										
											temp[l][1]=aregv.replace("@", "").replace(" ", "");
										bu=	table.getValueAt(r+1, 0);
										
											temp[l][0]=String.valueOf(bu);
											
											fin=temp[l][0];
											
											lable =true;
											
											j=asmarr[i].length();
											
										}
											
										kin++;
									}
									
								}
								if(lable!=true)
								{
									++l;
								}
								
								
						}
						
							
						}
					if(lable==false)
					{     Bit[j]=f;
					
					
						if(aregv.replace(" ", "").length()>2)
						{
							
							aregv=aregv.replace("@", "").replace(" ", "");
							
							for(int k = 0;k<l;++k)
							{
								if(temp[k][1]!=null)
								{
									if(temp[k][1].equals(aregv))
									{
										
										p=temp[k][0];
										test=true;
										k=l+1;
									}	
								}
								
							}
							
							if(test==false)
							{
								if(mo!=0)
								{
								  n++;
								 
								}
								Bit[j]=16+n;
								 mo++;
								
								f=Bit[j];
								temp[l][0]=String.valueOf(f);
								temp[l][1]=aregv;
								fin=temp[l][0];
								
								
							}
							else
							{
								fin=p;
								
							}
						}
					else 
					{
						for(int k =0;k<l;++k)
						{
							
							if(temp[k][1].equals(String.valueOf(bit[j])))
							{
								
								p=temp[k][0];
								
							   test=true;
							   k=l+1;
							   
							}
						}
						
						if(test==false)
						{
							if(mo!=0)
							{
							  n++;
							}
							Bit[j]=16+n;
							
							f=Bit[j];
							mo++;
							if(asmarr[i].length()>2)
							{
								temp[l][1]=aregv.replace("@", "");
								temp[l][1]=temp[l][1].replace(" ", "");
							}
							else
							{
								temp[l][1]=String.valueOf(bit[j]).replace("@", "");
								temp[l][1]=temp[l][1].valueOf(bit[j]).replace(" ", "");
							}
							temp[l][0]=String.valueOf(f);
							fin=temp[l][0];
							
						}
						else if(test==true)
						{
							fin=p;
							
							
						}
						
						
						
					}

						j=asmarr[i].length();
						
					++l;
						
						}
				
					
					
					
					
					}
					j++;
					
				}
				
				 j=1;
					
					while(j<asmarr[i].length()-1)
					{
						
						
						if(obj.Error==null&&j<asmarr[i].length()-2)
						{
							fin=String.valueOf(Bit[j]).concat(String.valueOf(Bit[j+1]));
							
							
							outv=String.format("%16s", Integer.toBinaryString(Integer.parseInt(fin))).replace(' ', '0');
							
							
						}
						
						else if(obj.Error!=null)
						{
							
							
							outv=String.format("%16s", Integer.toBinaryString(Integer.parseInt(fin))).replace(' ', '0');
							
						}
						
						j++;
						
					}
				
				
			}
			
			
        
			
	
			table_1.setValueAt(outv, N, 1);
			table_1.setValueAt(ri, N, 0);
			
			N++;
			ri++;
		}
	   if(asmarr[i].contains("(")||asmarr[i].contains(")"))
	   {
		   table_1.setValueAt("", N, 1);
			N++;
	   }
	   
	   
	   if(aregv.startsWith("D")||aregv.startsWith("A")||aregv.startsWith("M")||aregv.startsWith("0")&&aregv!=null)
	   {
		  
		  String List[][]=new String [aregv.length()][aregv.length()];
		  
		  
		  // instruction
		if(  aregv.contains("="))
		{
			 aregv= aregv.replace(" ", "");
			 eq = aregv.indexOf("=")+1;
		    	
			 if(aregv.startsWith("AMD"))
     		{
     			reg="AMD";
     		}
     		else if(aregv.startsWith("AD"))
     		{
     			reg="AD";
     		}
     		else if(aregv.startsWith("AM"))
     		{
     			reg="AM";
     		}
     		else if(aregv.startsWith("MD"))
     		{
     			reg="MD";
     		}
     		else if(aregv.startsWith("A"))
     		{
     			reg="A";
     		}
     		else if(aregv.startsWith("M"))
     		{
     			reg="M";
     		}
     		else if(aregv.startsWith("D"))
     		{
     			reg="D";
     		}
     		else 
     		{
     			reg="null";
     		}
     		dest();
			
     		 if(aregv.startsWith("0",eq))
      		{
     			valuecomp="0";
      		}
     		
     		else if(aregv.startsWith("D+1",eq))
       		{
      			valuecomp="D+1";
       		}
     		else if(aregv.startsWith("A+1",eq))
       		{
      			valuecomp="A+1";
       		}
     		else if(aregv.startsWith("D-1",eq))
       		{
      			valuecomp="D-1";
       		}
     		else if(aregv.startsWith("A-1",eq))
       		{
      			valuecomp="A-1";
       		}
     		else if(aregv.startsWith("D+A",eq)||aregv.startsWith("A+D",eq))
       		{
      			valuecomp="D+A";
       		}
     		else if(aregv.startsWith("D-A",eq))
       		{
      			valuecomp="D-A";
       		}
     		else if(aregv.startsWith("A-D",eq))
       		{
      			valuecomp="A-D";
       		}
     		else if(aregv.startsWith("D&A",eq))
       		{
      			valuecomp="D&A";
       		}
     		else if(aregv.startsWith("D|A",eq))
       		{
      			valuecomp="D|A";
       		}
     		 
     		
       		else if(aregv.startsWith("M+1",eq))
       		{
      			valuecomp="M+1";
       		}
       		else if(aregv.startsWith("M-1",eq))
       		{
      			valuecomp="M-1";
       		}
     		else if(aregv.startsWith("D+M",eq)||aregv.startsWith("M+D",eq))
       		{
      			valuecomp="D+M";
       		}
     		else if(aregv.startsWith("D-M",eq))
       		{
      			valuecomp="D-M";
       		}
     		else if(aregv.startsWith("M-D",eq))
       		{
      			valuecomp="M-D";
       		}
     		else if(aregv.startsWith("D&M",eq))
       		{
      			valuecomp="D&M";
       		}
     		else if(aregv.startsWith("D|M",eq))
       		{
      			valuecomp="D|M";
       		}
     		 else if(aregv.startsWith("1",eq))
        		{
       			valuecomp="1";
        		}
      		else if(aregv.startsWith("-1",eq))
        		{
       			valuecomp="-1";
        		}
      		else if(aregv.startsWith("D",eq))
        		{
       			valuecomp="D";
        		}
      		else if(aregv.startsWith("A",eq))
        		{
       			valuecomp="A";
        		}
      		else if(aregv.startsWith("!D",eq))
        		{
       			valuecomp="!D";
        		}
      		else if(aregv.startsWith("!A",eq))
        		{
       			valuecomp="!A";
        		}
      		else if(aregv.startsWith("-D",eq))
        		{
       			valuecomp="-D";
        		}
      		else if(aregv.startsWith("-A",eq))
        		{
       			valuecomp="-A";
        		}
      		else if(aregv.startsWith("M",eq))
       		{
      			valuecomp="M";
       		}
     		else if(aregv.startsWith("!M",eq))
       		{
      			valuecomp="!M";
       		}
     		else if(aregv.startsWith("-M",eq))
       		{
      			valuecomp="-M";
       		}
     		
     	comp();
     	
     jump="000";
     	 
     	    Main o = new Main();
     	    instruct="111".concat(o.a.concat(code.concat(value.concat(jump))));
     	   
     	    
            
		}
		//jump
		else if(aregv.contains(";")) 
		{
			aregv=aregv.replace(" ","");
			ju = aregv.indexOf(";")+1;
			value="000";
			 if(aregv.startsWith("0"))
	      		{
	     			valuecomp="0";
	      		}
	     		
	     		else if(aregv.startsWith("D+1"))
	       		{
	      			valuecomp="D+1";
	       		}
	     		else if(aregv.startsWith("A+1"))
	       		{
	      			valuecomp="A+1";
	       		}
	     		else if(aregv.startsWith("D-1"))
	       		{
	      			valuecomp="D-1";
	       		}
	     		else if(aregv.startsWith("A-1"))
	       		{
	      			valuecomp="A-1";
	       		}
	     		else if(aregv.startsWith("D+A"))
	       		{
	      			valuecomp="D+A";
	       		}
	     		else if(aregv.startsWith("D-A"))
	       		{
	      			valuecomp="D-A";
	       		}
	     		else if(aregv.startsWith("A-D"))
	       		{
	      			valuecomp="A-D";
	       		}
	     		else if(aregv.startsWith("D&A"))
	       		{
	      			valuecomp="D&A";
	       		}
	     		else if(aregv.startsWith("D|A"))
	       		{
	      			valuecomp="D|A";
	       		}
	     		 
	     		
	       		else if(aregv.startsWith("M+1"))
	       		{
	      			valuecomp="M+1";
	       		}
	       		else if(aregv.startsWith("M-1"))
	       		{
	      			valuecomp="M-1";
	       		}
	     		else if(aregv.startsWith("D+M"))
	       		{
	      			valuecomp="D+M";
	       		}
	     		else if(aregv.startsWith("D-M"))
	       		{
	      			valuecomp="D-M";
	       		}
	     		else if(aregv.startsWith("M-D"))
	       		{
	      			valuecomp="M-D";
	       		}
	     		else if(aregv.startsWith("D&M"))
	       		{
	      			valuecomp="D&M";
	       		}
	     		else if(aregv.startsWith("D|M"))
	       		{
	      			valuecomp="D|M";
	       		}
	     		 else if(aregv.startsWith("1"))
		       		{
		      			valuecomp="1";
		       		}
		     		else if(aregv.startsWith("-1"))
		       		{
		      			valuecomp="-1";
		       		}
		     		else if(aregv.startsWith("D"))
		       		{
		      			valuecomp="D";
		       		}
		     		else if(aregv.startsWith("A"))
		       		{
		      			valuecomp="A";
		       		}
		     		else if(aregv.startsWith("!D"))
		       		{
		      			valuecomp="!D";
		       		}
		     		else if(aregv.startsWith("!A"))
		       		{
		      			valuecomp="!A";
		       		}
		     		else if(aregv.startsWith("-D"))
		       		{
		      			valuecomp="-D";
		       		}
		     		else if(aregv.startsWith("-A"))
		       		{
		      			valuecomp="-A";
		       		}
		     		else if(aregv.startsWith("M"))
		       		{
		      			valuecomp="M";
		       		}
		     		else if(aregv.startsWith("!M"))
		       		{
		      			valuecomp="!M";
		       		}
		     		else if(aregv.startsWith("-M"))
		       		{
		      			valuecomp="-M";
		       		}
	     		
	     	comp();
	     	    if(aregv.startsWith("JGT", ju))
	     	    {
	     	    	valuejump="JGT";
	     	    }
	     	    else if(aregv.startsWith("JEQ", ju))
	     	    {
	     	    	valuejump="JEQ";
	     	    }
	     	   else if(aregv.startsWith("JGE", ju))
	    	    {
	    	    	valuejump="JGE";
	    	    }
	     	  else if(aregv.startsWith("JLT", ju))
	  	    {
	  	    	valuejump="JLT";
	  	    }
	     	 else if(aregv.startsWith("JNE", ju))
	 	    {
	 	    	valuejump="JNE";
	 	    }
	     	else if(aregv.startsWith("JLE", ju))
		    {
		    	valuejump="JLE";
		    }
	     	else if(aregv.startsWith("JMP", ju))
		    {
		    	valuejump="JMP";
		    }
	     	else 
		    {
		    	valuejump="null";
		    } 
	     	    jump();
	     	   Main o = new Main();
	     	   instruct="111".concat(o.a.concat(code.concat(value.concat(jump))));
	     	      
	     	    
	     	    
		}
		table_1.setValueAt(instruct, N, 1);
		table_1.setValueAt(ri, N, 0);
		N++;
		ri++;
	   }
	  
	   
	}
		
		
	   i++;
}
				
				
			}
		});
		menuBar.add(bt_ff);
		bt_ff.setForeground(Color.WHITE);
		bt_ff.setBackground(Color.WHITE);
		bt_ff.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\fastforward-icon-3 (1).jpg"));
		
				
				
				JButton bt_compare = new JButton("");
				menuBar.add(bt_compare);
				bt_compare.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						table_2.setForeground(Color.BLACK);
						
						i=0;
						zi=0;
						N=0;
						ri=0;
               fileChooser.setCurrentDirectory(new File("R:\\AVV\\SEM2\\EOC\\Nand2tetris\\mycode\\hack"));
						
						int response=fileChooser.showOpenDialog(null);
						if (response==JFileChooser.APPROVE_OPTION)
						{
							File pathhack = new File(fileChooser.getSelectedFile().getAbsolutePath()); 
							b=pathhack;
							
							scrollPane_2.setVisible(true);
						
							String s=b.toString();
							
							if(s.contains(".hack")&&asmfile==true)
							{
								textField.setText("ASM File : "+ap+"\n  "+"HACK File : "+s);
								File asm = new File(s);
								try 
								{
									Scanner myReader = new Scanner(asm);
									if(asm.exists())
								      {
										int t=0;
								     
										while (t<200) 
									      {
									    	  table_2.setValueAt("",t, 1);
									    	  
									    	  t++;
									      }
										
								    	  System.out.println("File Exist");
								      }  
									 while (myReader.hasNext()) 
								      {
										     
										    line= myReader.nextLine();							    		
										    StringTokenizer st = new StringTokenizer(line, " ");   
										    StringBuffer sb = new StringBuffer();
										      while(st.hasMoreElements()){
										          sb.append(st.nextElement()).append(" ");  
										        if(!sb.toString().startsWith("/")) 
										        {
										        	
										        	if(!sb.toString().isBlank()&&!asmarr[zi].contains("("))
										        	{
										        		
										        		 if(sb.toString().contains("/")==true)
														    {
														    	op=sb.toString().indexOf("/");
														    	as=sb.toString().replace(sb.toString().substring(op),"");
														    	
														    	hackarr[zi]=as;
														    
														    	
														    	
														    	
														    }
														    else
														    {
														    	
														    	hackarr[zi] =sb.toString();
														    
														    	
														    }
										        	}
										        	else
										        	{        zi++;
										        		if(sb.toString().contains("/")==true)
													    {
													    	op=sb.toString().indexOf("/");
													    	as=sb.toString().replace(sb.toString().substring(op),"");
													    	
													    	hackarr[zi]=as;
													    	
													    	
													    	
													    	
													    }
													    else
													    {
													    	
													    	hackarr[zi] =sb.toString();
													    
													    	
													    }
										        	}
										        }
										        zi++;
										      }
										      
										      
										    		  i++;
								      }
									 j=0;
									 while(j<asmarr.length)
									 {
										 
									      if(asmarr[j]!=null)
									      {
									    	if(!asmarr[j].contains("(")&&!asmarr[j].isEmpty()) 
									    	{
									    		
									    		table_2.setValueAt(ri, j, 0);
									    		
									    		ri++;
									    	 table_2.setValueAt(hackarr[j],j, 1);
									    	 
									    	 kl=j;
									    	
									    	}
									    	
									      }
									      
									      j++; 
									 }
									 j=kl;
									 while(hackarr[j]!=null)
									 {
										 
									    
									    		table_2.setValueAt(ri, j, 0);
									    		
									    		ri++;
									    	 table_2.setValueAt(hackarr[j],j, 1);
									    	 
									    	 
									  
									      j++; 
									 }
									 
								     
								     
								      myReader.close();
									
									
								} catch (FileNotFoundException e1)
								{
									textField_err.setForeground(Color.red);
							    	textField_err.setText("An Error Occur while Loding the HACK File");
									
								}
								
							}
							
							else 
							{
								textField_err.setForeground(Color.red);
						    	textField_err.setText("An Error Occur while Loding the HACK File");
							}
							
						}
					}
				});
				bt_compare.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\ab-testing (2).png"));
				
				
				
				JButton bt_cmpfile = new JButton("");
				bt_cmpfile.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						co=true;
						
								for(int i =0;i<hackarr.length;++i )
								{
									
									
									if(hackarr[i]!=null)
									{
										
										Object hack = table_2.getModel().getValueAt(i, 1).toString().replace(" ", "");
										Object binary = table_1.getModel().getValueAt(i, 1).toString().replace(" ", "");
									
									
										if(!hack.equals(binary))
										{
											table_2.addRowSelectionInterval(i, i);
											table_2.setForeground(Color.RED);
										
											co=false;
										}
									 if(co==true)
										{
											table_2.addRowSelectionInterval(i, i);
											table_2.setForeground(Color.GREEN);
										}
									
								}
								}
									
					
						
						

					}
				});
				menuBar.add(bt_cmpfile);
				bt_cmpfile.setIcon(new ImageIcon("C:\\Users\\anbu0\\Downloads\\compare-xxl (1).png"));
		bt_goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int t=0;
			     
				while (t<200)  
			      {
					  table_1.setValueAt("", t, 1);
			    	  table_2.setValueAt("",t, 1);
			    	  table_1.setValueAt("", t, 0);
			    	  table_2.setValueAt("",t, 0);
			    	  
			    	  table_2.setForeground(Color.BLACK);
			    	  hackarr[t]="";
			    	  t++;
			      }
			}
		});
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				
				
               int ol=0;
				for(int o =0;o<asmarr.length;++o)
				{
					if(asmarr[o]!=null)
					{
						
						if(!table.getValueAt(o, 1).toString().isEmpty())
						{
							if(table.getSelectedRow()==o)
							{
								int key=e.getKeyCode();
								if(key==KeyEvent.VK_DOWN)
								{
									
								ol=o;
									table.addRowSelectionInterval(o, o);
									table_1.addRowSelectionInterval(ol+1, ol+1);
									
									table_1.setAutoscrolls(true);	
									table.setAutoscrolls(true);	
									table_2.setSelectionBackground(Color.YELLOW);
									table_2.addRowSelectionInterval(ol+1, ol+1);
									table_2.setAutoscrolls(true);	
									table.setSelectionBackground(Color.YELLOW);
									table_1.setSelectionBackground(Color.YELLOW);
									
							    }	
								if(key==KeyEvent.VK_UP&&o!=0)
								{
									
								ol=o;
								table_2.setSelectionBackground(Color.YELLOW);
								table_2.addRowSelectionInterval(ol-1, ol-1);
								table_2.setAutoscrolls(true);	
									table.addRowSelectionInterval(o, o);
									table_1.addRowSelectionInterval(ol-1, ol-1);
									table_1.setAutoscrolls(true);		
									table.setAutoscrolls(true);	
									table.setSelectionBackground(Color.YELLOW);
									table_1.setSelectionBackground(Color.YELLOW);
							    }	
							}
						}
					}
				}
			
			
						
							
								
							
							
								
						
							
						
					
				
			}
		});
			
       table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) 
			{
				for(int o =0;o<asmarr.length;++o)
				{
					if(asmarr[o]!=null)
					{
						if(!table.getValueAt(o, 1).toString().isEmpty())
						{
							if(table.getSelectedRow()==o)
							{
								
								
								table_1.addRowSelectionInterval(o, o);
								
								table_1.setAutoscrolls(true);
								table.setAutoscrolls(true);
								table.addRowSelectionInterval(o, o);
								table_2.setAutoscrolls(true);
								table_2.addRowSelectionInterval(o, o);
								
							}
								
						
							
						}
					}
				}
			}
		});
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}