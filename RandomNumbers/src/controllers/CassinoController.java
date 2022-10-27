/**
 * 
 */
package controllers;

import javax.swing.JOptionPane;

import models.Cassino;
import views.CassinoView;

/**
 * @author Rafhael Honda da Silva
 * @author José Roberto Felix da Silva
 *
 */

public class CassinoController {

	private Cassino model;
	private CassinoView view;
	
	public CassinoController(Cassino m, CassinoView v) {
		// TODO Auto-generated constructor stub
		model = m;
		view = v;
	}

	public void initController() {
		
		model.carregaImagens();
		
		model.setSaldoCassino(90000.00);
		model.setSaldoJogador(600.00);
		model.setPremio(100.00);
		model.setAposta(1.0);
		model.setQuantidadeJogadas(0);
		model.setQuantidadeVitorias(0);
		
		view.getTextCaixaCassino().setValue(model.getSaldoCassino());
		view.getTextSaldoAtual().setValue(model.getSaldoJogador());
		view.getTextValorPremio().setValue(model.getPremio());
		view.getTextQuantidadeAcertos().setValue(0);
		view.getTextJogadas().setValue(0);		
		
		view.getRadioAposta1().addActionListener(e -> radioAposta1Listener());
		view.getRadioAposta2().addActionListener(e -> radioAposta2Listener());
		view.getRadioAposta3().addActionListener(e -> radioAposta3Listener());

		view.getButtonSorteio().addActionListener(e -> buttonSorteioListener());
		view.getButtonNovoJogo().addActionListener(e -> buttonNovoJogoListener());
	}

	public void radioAposta1Listener() {
		double valorPremio;
		if (view.getRadioAposta1().isSelected()) {
			model.setAposta(1.00);
			valorPremio = model.getPremio() * model.getAposta();
			view.getTextValorPremio().setText(Double.toString(valorPremio));
		}
	}

	public void radioAposta2Listener() {
		double valorPremio;
		if (view.getRadioAposta2().isSelected()) {
			model.setAposta(2.00);
			valorPremio = model.getPremio() * model.getAposta();
			view.getTextValorPremio().setText(Double.toString(valorPremio));
		}
	}

	public void radioAposta3Listener() {		
		double valorPremio;
		if (view.getRadioAposta3().isSelected()) {
			model.setAposta(3.00);
			valorPremio = model.getPremio() * model.getAposta();
			view.getTextValorPremio().setText(Double.toString(valorPremio));
		}
	}
	
	public void buttonSorteioListener() {
		int qtdeJogadas;
		double valorFicha, saldoCassino, saldoJogador, saldoCassinoAt = 0, saldoJogadorAt = 0;
		
		qtdeJogadas = Integer.parseInt(view.getTextJogadas().getText());
		
		if ((!view.getRadioAposta1().isSelected())
				&& (!view.getRadioAposta2().isSelected())
				&& (!view.getRadioAposta3().isSelected())) {
			JOptionPane.showMessageDialog(null, "Selecione o valor da aposta para jogar!", "Alerta",
					JOptionPane.PLAIN_MESSAGE);
			return;
		}
		if (model.getSaldoJogador() == 0) {

			JOptionPane.showMessageDialog(null, "Você não possui saldo suficiente para realizar aposta!", "Alerta", JOptionPane.PLAIN_MESSAGE);
			return;

		} else {
			saldoJogador = model.getSaldoJogador();
			saldoCassino = model.getSaldoCassino();
			
			if (view.getRadioAposta1().isSelected()) {
				valorFicha = 1.0;
				saldoJogadorAt = saldoJogador - valorFicha;
				model.setSaldoJogador(saldoJogadorAt);
				
				saldoCassinoAt = saldoCassino + valorFicha;
				model.setSaldoCassino(saldoCassinoAt);

			} else if (view.getRadioAposta2().isSelected()) {
				valorFicha = 2.0;
				saldoJogadorAt = saldoJogador - valorFicha;
				model.setSaldoJogador(saldoJogadorAt);
				
				saldoCassinoAt = saldoCassino + valorFicha;
				model.setSaldoCassino(saldoCassinoAt);			
	

			} else if (view.getRadioAposta3().isSelected()) {
				valorFicha = 3.0;
				saldoJogadorAt = saldoJogador - valorFicha;
				model.setSaldoJogador(saldoJogadorAt);
				
				saldoCassinoAt = saldoCassino + valorFicha;
				model.setSaldoCassino(saldoCassinoAt);
			}

			if (saldoJogadorAt > 0) {
				view.getTextSaldoAtual().setText(Double.toString(saldoJogadorAt));				
			}
			
			if (saldoCassinoAt > 0) {
				view.getTextCaixaCassino().setText(Double.toString(saldoCassinoAt));				
			}

			qtdeJogadas++;
			view.getTextJogadas().setText(Integer.toString(qtdeJogadas));
			model.setQuantidadeJogadas(qtdeJogadas);
			
			var icons = model.grupoImagens();		
			
			view.getLabelImageNum1().setIcon(icons.get(0));
			view.getLabelImageNum2().setIcon(icons.get(1));
			view.getLabelImageNum3().setIcon(icons.get(2));
			view.getLabelImageNum4().setIcon(icons.get(3));

			//view.getLabelNum1().setText(Integer.toString(model.getNumero1()));
			//view.getLabelNum2().setText(Integer.toString(model.getNumero2()));
			//view.getLabelNum3().setText(Integer.toString(model.getNumero3()));
			//view.getLabelNum4().setText(Integer.toString(model.getNumero4()));
			
			
			if (model.validaJogada()) {
				
				double premio = model.getPremio() * model.getAposta();
				saldoCassinoAt = model.getSaldoCassino() - premio;
				model.setSaldoCassino(saldoCassinoAt);
				view.getTextCaixaCassino().setText(Double.toString(saldoCassinoAt));
				
				saldoJogadorAt = model.getSaldoJogador() + premio;
				model.setSaldoJogador(saldoJogadorAt);	
				view.getTextSaldoAtual().setText(Double.toString(saldoJogadorAt));
				
				view.getLabelTextResultado().setText("Parabéns você ganhou.");
				view.getTextQuantidadeAcertos().setText(Integer.toString(model.getQuantidadeVitorias()));
				
			} else {
				view.getLabelTextResultado().setText("Você perdeu, tente novamente");
			}
		}
	}
	
	public void buttonNovoJogoListener() {
		
		model.setSaldoCassino(90000.00);
		model.setSaldoJogador(600.00);
		model.setPremio(100.00);
		model.setAposta(1.0);
		model.setQuantidadeJogadas(0);
		model.setQuantidadeVitorias(0);
		
		
		view.getTextCaixaCassino().setValue(model.getSaldoCassino());
		view.getTextSaldoAtual().setValue(model.getSaldoJogador());
		view.getTextValorPremio().setValue(model.getPremio());
		view.getTextQuantidadeAcertos().setValue(0);
		view.getTextJogadas().setValue(0);
		
		view.getLabelNum1().setText("");
		view.getLabelNum2().setText("");
		view.getLabelNum3().setText("");
		view.getLabelNum4().setText("");
		
		view.getLabelTextResultado().setText("");
		
		view.getLabelImageNum1().setIcon(null);
		view.getLabelImageNum2().setIcon(null);
		view.getLabelImageNum3().setIcon(null);
		view.getLabelImageNum4().setIcon(null);
	}
}
