package DAO;

import DTO.ProdutoDTO;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    public void mostrarProduto(ProdutoDTO pd){
        JOptionPane.showMessageDialog(null, pd.toString());
        
    } 
    
}
