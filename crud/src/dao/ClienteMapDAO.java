package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }


    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        } else {
            map.put(cliente.getCpf(), cliente);
            return true;
        }
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteExcluir = map.get(cpf);
        map.remove(clienteExcluir.getCpf(), clienteExcluir);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteAlterar = map.get(cliente.getCpf());
        clienteAlterar.setNome(cliente.getNome());
        clienteAlterar.setTelefone(cliente.getTelefone());
        clienteAlterar.setNumero(cliente.getNumero());
        clienteAlterar.setEndereco(cliente.getEndereco());
        clienteAlterar.setCidade(cliente.getCidade());
        clienteAlterar.setEstado(cliente.getEstado());
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
