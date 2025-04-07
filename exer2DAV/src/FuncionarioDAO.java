import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private List<FuncionarioDTO> funcionarios;

    
    public FuncionarioDAO() {
        funcionarios = new ArrayList<>();
    }

    
    public void adicionarFuncionario(FuncionarioDTO funcionario) {
        funcionarios.add(funcionario);
    }

   
    public List<FuncionarioDTO> listarFuncionarios() {
        return funcionarios;
    }
}