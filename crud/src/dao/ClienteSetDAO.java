package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO {

    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteExcluir = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteExcluir = cliente;
                break;
            }
        }
        if (clienteExcluir != null)
            this.set.remove(clienteExcluir);
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteAlterar : this.set) {
                if (clienteAlterar.equals(cliente)) {
                    clienteAlterar.setNome(cliente.getNome());
                    clienteAlterar.setTelefone(cliente.getTelefone());
                    clienteAlterar.setNumero(cliente.getNumero());
                    clienteAlterar.setEndereco(cliente.getEndereco());
                    clienteAlterar.setCidade(cliente.getCidade());
                    clienteAlterar.setEstado(clienteAlterar.getEstado());
                    break;
                }
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteConsultar : this.set) {
            if (clienteConsultar.getCpf().equals(cpf)) {
                return clienteConsultar;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
