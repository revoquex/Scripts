package scripts.cutter.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.swing.DefaultListModel;

import org.tribot.api2007.Objects;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSObject;
import org.tribot.api2007.types.RSTile;
import org.tribot.util.Util;

import scripts.cutter.Main;
import scripts.cutter.taskframework.TaskSet;
import scripts.cutter.tasks.AvoidEnt;
import scripts.cutter.tasks.Bank;
import scripts.cutter.tasks.Chop;
import scripts.cutter.tasks.GearUp;
import scripts.cutter.tasks.PowerChop;
import scripts.cutter.tasks.ToggleRun;
import scripts.cutter.utilities.Vars;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

	Main script;
	TaskSet taskset;

	public RSTile bankFirstTile = null;
	public RSTile bankSecondTile = null;
	public RSTile treeFirstTile = null;
	public RSTile treeSecondTile = null;
	public static Properties prop = new Properties();
	public static File path;

	/**
	 * Creates new form CCutter
	 */
	public GUI(Main script, TaskSet taskset) {
		this.taskset = taskset;
		this.script = script;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		powerchopCheckBox = new javax.swing.JCheckBox();
		jScrollPane1 = new javax.swing.JScrollPane();
		treeList = new javax.swing.JList<>();
		refreshButton = new javax.swing.JButton();
		firstBankTileTextbox = new javax.swing.JTextField();
		setBankTileXButton = new javax.swing.JButton();
		secondBankTileTextbox = new javax.swing.JTextField();
		setBankTileYButton = new javax.swing.JButton();
		setTreeTileXButton = new javax.swing.JButton();
		firstTreeTileTextbox = new javax.swing.JTextField();
		setTreeTileYButton = new javax.swing.JButton();
		secondTreeTileTextbox = new javax.swing.JTextField();
		startScriptButton = new javax.swing.JButton();
		presetTextbox = new javax.swing.JTextField();
		saveButton = new javax.swing.JButton();
		loadButton = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		axeIdTextField = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		jLabel1.setText("C#CUTTER");
		firstBankTileTextbox.setEditable(false);
		secondBankTileTextbox.setEditable(false);
		firstTreeTileTextbox.setEditable(false);
		secondTreeTileTextbox.setEditable(false);

		powerchopCheckBox.setText("Powerchop?");
		powerchopCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				powerchopCheckBoxActionPerformed(evt);
			}
		});

		jScrollPane1.setViewportView(treeList);

		refreshButton.setText("Refresh Trees");
		refreshButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				refreshButtonActionPerformed(evt);
			}
		});

		setBankTileXButton.setText("Set Bank Area Tile X");
		setBankTileXButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setBankTileXButtonActionPerformed(evt);
			}
		});

		setBankTileYButton.setText("Set Bank Area Tile Y");
		setBankTileYButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setBankTileYButtonActionPerformed(evt);
			}
		});

		setTreeTileXButton.setText("Set Tree Area Tile X");
		setTreeTileXButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setTreeTileXButtonActionPerformed(evt);
			}
		});

		setTreeTileYButton.setText("Set Tree Area Tile Y");
		setTreeTileYButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setTreeTileYButtonActionPerformed(evt);
			}
		});

		startScriptButton.setText("Start Script");
		startScriptButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startScriptButtonActionPerformed(evt);
			}
		});

		presetTextbox.setText("Preset");

		saveButton.setText("Save Preset");
		saveButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveButtonActionPerformed(evt);
			}
		});

		loadButton.setText("Load Preset");
		loadButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loadButtonActionPerformed(evt);
			}
		});

		jLabel2.setText("Axe ID:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout
								.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel1).addGap(189, 189, 189))
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(startScriptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 220,
												Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(presetTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(saveButton)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(loadButton))
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(setTreeTileXButton, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(powerchopCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(setBankTileXButton, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(refreshButton, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(firstTreeTileTextbox,
														javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
												.addComponent(firstBankTileTextbox).addComponent(jLabel2)
												.addComponent(axeIdTextField))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(setBankTileYButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(setTreeTileYButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(secondBankTileTextbox)
																.addComponent(secondTreeTileTextbox)))
												.addComponent(jScrollPane1))))
						.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(powerchopCheckBox).addComponent(jLabel2))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(refreshButton)
																.addComponent(axeIdTextField,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
														Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(firstBankTileTextbox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(setBankTileXButton)
												.addComponent(
														secondBankTileTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(setBankTileYButton))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(setTreeTileXButton)
												.addComponent(firstTreeTileTextbox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(setTreeTileYButton).addComponent(secondTreeTileTextbox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(startScriptButton, javax.swing.GroupLayout.PREFERRED_SIZE,
														34, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(presetTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(saveButton).addComponent(loadButton))
										.addGap(0, 0, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>

	private void powerchopCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
		if (powerchopCheckBox.isSelected()) {
			Vars.powerchop = true;
		} else {
			Vars.powerchop = false;
		}
	}

	private void startScriptButtonActionPerformed(java.awt.event.ActionEvent evt) {

		synchronized (script) {
			script.notify();
		}
		Vars.bank = new RSArea(bankFirstTile, bankSecondTile);
		Vars.treesLoc = new RSArea(treeFirstTile, treeSecondTile);
		Vars.tree = treeList.getSelectedValue();
		Vars.axeId = Integer.parseInt(axeIdTextField.getText());
		this.dispose();
		this.setVisible(false);
		if (Vars.powerchop) {
			taskset.addTasks(new PowerChop(), new GearUp(), new AvoidEnt(), new ToggleRun());
		} else {
			taskset.addTasks(new Chop(), new Bank(), new GearUp(), new AvoidEnt(), new ToggleRun());
		}
		Vars.start = true;
	}

	private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultListModel<String> lm = new DefaultListModel<String>();
		lm.clear();
		RSObject[] trees = Objects.getAll(100);
		if (trees != null && trees.length > 0) {
			for (RSObject tree : trees) {
				if (tree.getDefinition() != null) {
					String[] actions = tree.getDefinition().getActions();
					if (actions != null) {
						for (String action : actions) {
							if (action.contains("Chop")) {
								if (!tree.getDefinition().getName().contains("Dead")
										&& !tree.getDefinition().getName().contains("Dying")) {
									if (!lm.contains(tree.getDefinition().getName())) {
										lm.addElement(tree.getDefinition().getName());
									}
								}
							}
						}
					}
				}
			}
		}
		treeList.setModel(lm);
	}

	private void setBankTileXButtonActionPerformed(java.awt.event.ActionEvent evt) {
		bankFirstTile = new RSTile(Player.getPosition().getX(), Player.getPosition().getY());
		firstBankTileTextbox.setText(Player.getPosition().toString());
	}

	private void setTreeTileXButtonActionPerformed(java.awt.event.ActionEvent evt) {
		treeFirstTile = new RSTile(Player.getPosition().getX(), Player.getPosition().getY());
		firstTreeTileTextbox.setText(Player.getPosition().toString());
	}

	private void setBankTileYButtonActionPerformed(java.awt.event.ActionEvent evt) {
		bankSecondTile = new RSTile(Player.getPosition().getX(), Player.getPosition().getY());
		secondBankTileTextbox.setText(Player.getPosition().toString());
	}

	private void setTreeTileYButtonActionPerformed(java.awt.event.ActionEvent evt) {
		treeSecondTile = new RSTile(Player.getPosition().getX(), Player.getPosition().getY());
		secondTreeTileTextbox.setText(Player.getPosition().toString());
	}

	private void formWindowClosed(java.awt.event.WindowEvent evt) {

	}

	private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
		path = new File(Util.getWorkingDirectory().getAbsolutePath(),
				"C#Cutter" + " " + presetTextbox.getText() + " settings.ini");
		try {
			prop.clear();
			prop.put("powerchop", String.valueOf(powerchopCheckBox.isSelected()).toString());
			prop.put("treetype", treeList.getSelectedValue().toString());
			prop.put("bankfirsttilex", String.valueOf(bankFirstTile.getX()));
			prop.put("bankfirsttiley", String.valueOf(bankFirstTile.getY()));
			prop.put("banksecondtilex", String.valueOf(bankSecondTile.getX()));
			prop.put("banksecondtiley", String.valueOf(bankSecondTile.getY()));
			prop.put("treefirsttilex", String.valueOf(treeFirstTile.getX()));
			prop.put("treefirsttiley", String.valueOf(treeFirstTile.getY()));
			prop.put("treesecondtilex", String.valueOf(treeSecondTile.getX()));
			prop.put("treesecondtiley", String.valueOf(treeSecondTile.getY()));
			prop.put("tree", treeList.getSelectedValue());
			prop.put("axeid", axeIdTextField.getText());
			prop.store(new FileOutputStream(path), "GUI Settings");
		} catch (Exception e1) {
			System.out.print("Unable to save settings");
		}
	}

	private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {
		path = new File(Util.getWorkingDirectory().getAbsolutePath(),
				"C#Cutter" + " " + presetTextbox.getText() + " settings.ini");

		try {
			if (path.exists()) {

				prop.load(new FileInputStream(path));
				String powerchop = prop.getProperty("powerchop");

				if (Boolean.valueOf(powerchop) == true) {
					powerchopCheckBox.setSelected(true);
				}

				bankFirstTile = new RSTile(Integer.parseInt(prop.getProperty("bankfirsttilex")),
						Integer.parseInt(prop.getProperty("bankfirsttiley")), 0);

				bankSecondTile = new RSTile(Integer.parseInt(prop.getProperty("banksecondtilex")),
						Integer.parseInt(prop.getProperty("banksecondtiley")), 0);

				treeFirstTile = new RSTile(Integer.parseInt(prop.getProperty("treefirsttilex")),
						Integer.parseInt(prop.getProperty("treefirsttiley")), 0);

				treeSecondTile = new RSTile(Integer.parseInt(prop.getProperty("treesecondtilex")),
						Integer.parseInt(prop.getProperty("treesecondtiley")), 0);

				Vars.bank = new RSArea(bankFirstTile, bankSecondTile);
				Vars.treesLoc = new RSArea(treeFirstTile, treeSecondTile);
				axeIdTextField.setText(prop.getProperty("axeid"));
				firstBankTileTextbox.setText(bankFirstTile.toString());
				secondBankTileTextbox.setText(bankSecondTile.toString());
				firstTreeTileTextbox.setText(treeFirstTile.toString());
				secondTreeTileTextbox.setText(treeSecondTile.toString());

				DefaultListModel<String> lm = new DefaultListModel<String>();
				lm.clear();
				lm.addElement(prop.getProperty("treetype"));
				treeList.setModel(lm);

				if (treeList.getModel().getSize() > 0) {
					treeList.setSelectedIndex(0);
				}
				if (powerchopCheckBox.isSelected()) {
					Vars.powerchop = true;
				}

			}

		} catch (Exception e2) {
			System.out.print("Unable to load settings");
		}
	}

	// Variables declaration - do not modify
	private javax.swing.JTextField axeIdTextField;
	private javax.swing.JTextField firstBankTileTextbox;
	private javax.swing.JTextField firstTreeTileTextbox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton loadButton;
	private javax.swing.JCheckBox powerchopCheckBox;
	private javax.swing.JTextField presetTextbox;
	private javax.swing.JButton refreshButton;
	private javax.swing.JButton saveButton;
	private javax.swing.JTextField secondBankTileTextbox;
	private javax.swing.JTextField secondTreeTileTextbox;
	private javax.swing.JButton setBankTileXButton;
	private javax.swing.JButton setBankTileYButton;
	private javax.swing.JButton setTreeTileXButton;
	private javax.swing.JButton setTreeTileYButton;
	private javax.swing.JButton startScriptButton;
	private javax.swing.JList<String> treeList;
	// End of variables declaration
}
