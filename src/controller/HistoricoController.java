package controller;

import br.gui.pilhastring.Pilha;

public class HistoricoController {
	
	// Inserir novo endereço
    public void inserirEndereco(Pilha historico, String endereco) throws Exception {
        if (enderecoValido(endereco)) {
            historico.push(endereco);
        } else {
        	 throw new Exception("Endereço inválido. Use o formato: http://www.site.com");
        }
    }

    // Validar endereço
    private boolean enderecoValido(String endereco) {
        return endereco.contains("http://") && endereco.contains("www.") && endereco.contains(".");
    }

    // Remover último endereço
    public String removerEndereco(Pilha historico) throws Exception {
        if (historico.isEmpty()) {
        	 throw new Exception("Histórico vazio. Não há nada para remover.");
        }
        return historico.pop();
    }

    // Consultar último endereço
    public String consultarUltimo(Pilha historico) throws Exception {
        if (historico.isEmpty()) {
        	 throw new Exception("Histórico vazio. Nenhum endereço disponível.");
        }
        return historico.top();
    }
	
}
