/**
 * 
 */
package views;

import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author Rafhael Honda da Silva
 * @author José Roberto Felix da Silva
 *
 */
public class CassinoView {
	
	private JFrame f;
	
	private JLabel labelImageNum2;
	private JLabel labelImageNum3;
	private JLabel labelImageNum4;
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	
	private JLabel labelNum1;
	private JLabel labelNum2;
	private JLabel labelNum3;	
	private JLabel labelNum4;
	
	public JRadioButton radioAposta1;
	private JRadioButton radioAposta2;
	private JRadioButton radioAposta3;

	private ButtonGroup buttonGroup;	
	
	private JLabel labelCaixaCassino;	
	private JFormattedTextField textCaixaCassino;
	
	private JLabel labelSaldoAtual;	
	private JFormattedTextField textSaldoAtual;
	
	private JLabel labelJogadas;	
	private JFormattedTextField textJogadas;
	
	private JLabel labelQuantidadeAcertos;	
	private JFormattedTextField textQuantidadeAcertos;
	
	private JLabel labelValorPremio;	
	private JFormattedTextField textValorPremio;	
		
	private JButton buttonSorteio;
	private JButton buttonNovoJogo;
	
	private JLabel labelResultado;	
	private JLabel labelTextResultado;	
	
	/**
	 * 
	 */
	public CassinoView() {
		
		// TODO Auto-generated constructor stub
		
		f = new JFrame("Números aleatórios");
		f.setSize(525, 400);
		f.setResizable(false);

		labelImageNum1 = new JLabel("");		
		labelImageNum2 = new JLabel("");		
		labelImageNum3 = new JLabel("");		
		labelImageNum4 = new JLabel("");

		panel1 = new JPanel();
		panel1.setBounds(20, 20, 100, 100);
		panel1.setBackground(Color.gray);
		panel1.add(labelImageNum1);
		f.add(panel1);

		panel2 = new JPanel();
		panel2.setBounds(140, 20, 100, 100);
		panel2.setBackground(Color.gray);
		panel2.add(labelImageNum2);
		f.add(panel2);

		panel3 = new JPanel();
		panel3.setBounds(260, 20, 100, 100);
		panel3.setBackground(Color.gray);
		panel3.add(labelImageNum3);
		f.add(panel3);

		panel4 = new JPanel();
		panel4.setBounds(380, 20, 100, 100);
		panel4.setBackground(Color.gray);
		panel4.add(labelImageNum4);
		f.add(panel4);

		labelNum1 = new JLabel("");
		labelNum1.setBounds(20, 310, 200, 30);
		f.add(labelNum1);

		labelNum2 = new JLabel("");
		labelNum2.setBounds(60, 310, 200, 30);
		f.add(labelNum2);

		labelNum3 = new JLabel("");
		labelNum3.setBounds(100, 310, 200, 30);
		f.add(labelNum3);

		labelNum4 = new JLabel("");
		labelNum4.setBounds(140, 310, 200, 30);
		f.add(labelNum4);

		radioAposta1 = new JRadioButton("R$ 1,00");		
		radioAposta1.setBounds(20, 260, 80, 30);
		radioAposta1.setSelected(true);

		radioAposta2 = new JRadioButton("R$ 2,00");
		radioAposta2.setBounds(105, 260, 80, 30);

		radioAposta3 = new JRadioButton("R$ 3,00");
		radioAposta3.setBounds(190, 260, 80, 30);

		buttonGroup = new ButtonGroup();
		buttonGroup.add(radioAposta1);
		buttonGroup.add(radioAposta2);
		buttonGroup.add(radioAposta3);

		f.add(radioAposta1);
		f.add(radioAposta2);
		f.add(radioAposta3);

		labelCaixaCassino = new JLabel("Caixa do Cassino:");
		labelCaixaCassino.setBounds(20, 135, 150, 30);
		f.add(labelCaixaCassino);

		textCaixaCassino = new JFormattedTextField();
		textCaixaCassino.setBounds(20, 165, 150, 30);
		textCaixaCassino.setEditable(false);
		f.add(textCaixaCassino);		

		labelSaldoAtual = new JLabel("Seu Saldo Atual:");
		labelSaldoAtual.setBounds(180, 135, 150, 30);
		f.add(labelSaldoAtual);

		textSaldoAtual = new JFormattedTextField();
		textSaldoAtual.setBounds(180, 165, 150, 30);
		textSaldoAtual.setEditable(false);
		f.add(textSaldoAtual);		

		labelJogadas = new JLabel("Jogadas:");
		labelJogadas.setBounds(340, 135, 150, 30);
		f.add(labelJogadas);

		textJogadas = new JFormattedTextField();		
		textJogadas.setBounds(340, 165, 150, 30);
		textJogadas.setEditable(false);
		f.add(textJogadas);

		labelQuantidadeAcertos = new JLabel("Acertos:");
		labelQuantidadeAcertos.setBounds(20, 195, 150, 30);
		f.add(labelQuantidadeAcertos);

		textQuantidadeAcertos = new JFormattedTextField();		
		textQuantidadeAcertos.setBounds(20, 220, 150, 30);
		textQuantidadeAcertos.setEditable(false);
		f.add(textQuantidadeAcertos);

		labelValorPremio = new JLabel("Valor do Premio:");
		labelValorPremio.setBounds(180, 195, 150, 30);
		f.add(labelValorPremio);

		textValorPremio = new JFormattedTextField();		
		textValorPremio.setBounds(180, 220, 150, 30);
		textValorPremio.setEditable(false);
		f.add(textValorPremio);

		buttonSorteio = new JButton("Sorteio");
		buttonSorteio.setBounds(340, 220, 150, 75);
		f.add(buttonSorteio);
		
		buttonNovoJogo = new JButton("Novo Jogo");
		buttonNovoJogo.setBounds(340, 310, 150, 30);
		f.add(buttonNovoJogo);

		labelResultado = new JLabel("Resultado: ");
		labelResultado.setBounds(20, 290, 80, 30);
		f.add(labelResultado);

		labelTextResultado = new JLabel("");		
		labelTextResultado.setBounds(85, 290, 180, 30);
		f.add(labelTextResultado);

		f.setLayout(null);
		f.setVisible(true);
	}	

	private JLabel labelImageNum1;	
	public JLabel getLabelImageNum1() {
		return labelImageNum1;
	}

	public void setLabelImageNum1(JLabel labelImageNum1) {
		this.labelImageNum1 = labelImageNum1;
	}

	public JLabel getLabelImageNum2() {
		return labelImageNum2;
	}

	public void setLabelImageNum2(JLabel labelImageNum2) {
		this.labelImageNum2 = labelImageNum2;
	}

	public JLabel getLabelImageNum3() {
		return labelImageNum3;
	}

	public void setLabelImageNum3(JLabel labelImageNum3) {
		this.labelImageNum3 = labelImageNum3;
	}

	public JLabel getLabelImageNum4() {
		return labelImageNum4;
	}

	public void setLabelImageNum4(JLabel labelImageNum4) {
		this.labelImageNum4 = labelImageNum4;
	}
	
	public JLabel getLabelNum1() {
		return labelNum1;
	}

	public void setLabelNum1(JLabel labelNum1) {
		this.labelNum1 = labelNum1;
	}

	public JLabel getLabelNum2() {
		return labelNum2;
	}

	public void setLabelNum2(JLabel labelNum2) {
		this.labelNum2 = labelNum2;
	}

	public JLabel getLabelNum3() {
		return labelNum3;
	}

	public void setLabelNum3(JLabel labelNum3) {
		this.labelNum3 = labelNum3;
	}

	public JLabel getLabelNum4() {
		return labelNum4;
	}

	public void setLabelNum4(JLabel labelNum4) {
		this.labelNum4 = labelNum4;
	}

	public JRadioButton getRadioAposta1() {
		return radioAposta1;
	}

	public void setRadioAposta1(JRadioButton radioAposta1) {
		this.radioAposta1 = radioAposta1;
	}

	public JRadioButton getRadioAposta2() {
		return radioAposta2;
	}

	public void setRadioAposta2(JRadioButton radioAposta2) {
		this.radioAposta2 = radioAposta2;
	}

	public JRadioButton getRadioAposta3() {
		return radioAposta3;
	}

	public void setRadioAposta3(JRadioButton radioAposta3) {
		this.radioAposta3 = radioAposta3;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public void setButtonGroup(ButtonGroup buttonGroup) {
		this.buttonGroup = buttonGroup;
	}

	public JFormattedTextField getTextCaixaCassino() {
		return textCaixaCassino;
	}

	public void setTextCaixaCassino(JFormattedTextField textCaixaCassino) {
		this.textCaixaCassino = textCaixaCassino;
	}

	public JFormattedTextField getTextSaldoAtual() {
		return textSaldoAtual;
	}

	public void setTextSaldoAtual(JFormattedTextField textSaldoAtual) {
		this.textSaldoAtual = textSaldoAtual;
	}

	public JFormattedTextField getTextJogadas() {
		return textJogadas;
	}

	public void setTextJogadas(JFormattedTextField textJogadas) {
		this.textJogadas = textJogadas;
	}

	public JFormattedTextField getTextQuantidadeAcertos() {
		return textQuantidadeAcertos;
	}

	public void setTextQuantidadeAcertos(JFormattedTextField textFicha) {
		this.textQuantidadeAcertos = textFicha;
	}

	public JFormattedTextField getTextValorPremio() {
		return textValorPremio;
	}

	public void setTextValorPremio(JFormattedTextField textValorPremio) {
		this.textValorPremio = textValorPremio;
	}
	
	public JButton getButtonSorteio() {
		return buttonSorteio;
	}

	public void setButtonSorteio(JButton buttonSorteio) {
		this.buttonSorteio = buttonSorteio;
	}
	
	public JButton getButtonNovoJogo() {
		return buttonNovoJogo;
	}

	public void setButtonNovoJogo(JButton buttonNovoJogo) {
		this.buttonNovoJogo = buttonNovoJogo;
	}
	
	public JLabel getLabelTextResultado() {
		return labelTextResultado;
	}

	public void setLabelTextResultado(JLabel labelTextResultado) {
		this.labelTextResultado = labelTextResultado;
	}
	
}
