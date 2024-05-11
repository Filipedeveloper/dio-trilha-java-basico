package conta.banco;
import javax.swing.*;


public class ContaBanco {

	public static void main(String[] args) {
				
		 // CRIA UMA JANELA
        JFrame frame = new JFrame("Cadastro Conta Bancária");

        //CRIA OS COMPONENTES DA JANELA
  		JLabel nomeLabel = new JLabel("Nome: ");
  		JTextField nomeField = new JTextField();
  		JLabel agenciaLabel = new JLabel("Número da Agência: ");
  		JTextField agenciaField = new JTextField();
  		JLabel numeroContaLabel = new JLabel("Número da conta");
  		JTextField numeroContaField = new JTextField();
  		JLabel saldoBancarioLabel = new JLabel("Saldo R$:");
  		JTextField saldoBancarioField = new JTextField();		
  		JButton cadastrarButton = new JButton("Cadastrar");

        // DEFINE O LAYOUT DA JANELA COMO GROUPLAYOUT
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // ADICIONA OS COMPONENTES AO LAYOUT
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nomeLabel)
                        .addComponent(agenciaLabel)
                        .addComponent(numeroContaLabel)
                        .addComponent(saldoBancarioLabel)
                        .addComponent(cadastrarButton));
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nomeField)
                        .addComponent(agenciaField)
                        .addComponent(numeroContaField)
                        .addComponent(saldoBancarioField));
        layout.setHorizontalGroup(hGroup);

        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeLabel)
                        .addComponent(nomeField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(agenciaLabel)
                        .addComponent(agenciaField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(numeroContaLabel)
                        .addComponent(numeroContaField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		                .addComponent(saldoBancarioLabel)
		                .addComponent(saldoBancarioField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastrarButton));
        layout.setVerticalGroup(vGroup);

        //ADICIONA O PAINEL AO FRAME
        frame.add(panel);

        // CONFIGURAÇÕES DA JANELA
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //AÇÃO DO BOTÃO DE CADASTRAR
        cadastrarButton.addActionListener(e -> {
        	String nome = nomeField.getText();
			String agencia = agenciaField.getText();
			int numero = Integer.parseInt(numeroContaField.getText());
			double saldo = Double.parseDouble(saldoBancarioField.getText());
			
			//LIMPA OS CAMPOS
			nomeField.setText("");
			agenciaField.setText("");
			numeroContaField.setText("");
			saldoBancarioField.setText("");					
			String textoPadrao = "Olá " + nome +", obrigado por criar uma conta em nosso banco, \n"
					+ " sua agência é "+agencia+",\n conta é "+numero+ ",\n e seu "
							+ "saldo é " + saldo + ", \n já está disponível para saque.";
			JOptionPane.showMessageDialog(frame, textoPadrao);					
        });
	}
}
