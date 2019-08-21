
package Modelo.persistencia;

import java.util.List;

    
public interface DAO <T> {
    List<T> listar() throws DadosException;
    void incluir(T entidade) throws DadosException;
    void Alterar (T entidade)throws DadosException;
    void excluir (int id )throws DadosException;
    T consultar (int id) throws DadosException;
    
}    
