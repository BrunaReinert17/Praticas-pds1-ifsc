package visao;

import modelo.Funcionario;

public interface FuncionarioDAO {

	void inserir(Funcionario func);

	static FuncionarioDAO getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
