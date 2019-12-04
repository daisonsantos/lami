package br.ucsal.lamis.util;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.lamis.model.Bloco;
import br.ucsal.lamis.model.Lami;
import br.ucsal.lamis.model.Reserva;
import br.ucsal.lamis.model.Usuario;

public class Repositorio {
	
	private List<Lami> lamis = new ArrayList<Lami>();  
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	private List<Bloco> blocos = new ArrayList<Bloco>();

	private List<Reserva> reservas = new ArrayList<Reserva>();

	

	public Repositorio() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setLogin("admin");
		usuario.setSenha("admin");
		
		this.usuarios.add(usuario);
		
				
		Bloco blocoA = new Bloco();
		blocoA.setId(1);
		blocoA.setNome("BLOCO A");
		
		Bloco blocoB = new Bloco();
		blocoB.setId(2);
		blocoB.setNome("BLOCO B");
		
		this.blocos.add(blocoA);
		this.blocos.add(blocoB);
				
	}

	public List<Lami> getLami() {
		return lamis;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	} 
	
	public void inserirUsuario(Usuario usuario) {
		Usuario ultimo = usuarios.get(this.usuarios.size()-1);
		usuario.setId(ultimo.getId()+1);
		this.usuarios.add(usuario);
	}
	
	public void removerUsuario(Integer id) {
		Usuario usuario = null;
		for (Usuario item : usuarios) {
			if(item.getId()== id) {
				usuario = item;
			}
		}
		if(usuario != null) {
			this.usuarios.remove(usuario);
		}
	}
	
	public void alterarUsuario(Usuario usuario) {
		Usuario update = null;
		for (Usuario item : usuarios) {
			if(item.getId() == usuario.getId()) {
				update = item;
			}
		}
		if(update != null) {
			update.setLogin(usuario.getLogin());
			update.setSenha(usuario.getSenha());

		}
		
	}

	public Usuario obterUsuario(Integer id) {
		Usuario usuario = null;
		for (Usuario item : usuarios) {
			if(item.getId()== id) {
				usuario = item;
			}
		}
		return usuario;
	}

	public List<Bloco> getBlocos() {
		return blocos;
	}
	
	public Bloco obterBloco(Integer id) {
		Bloco bloco = null;
		for (Bloco item : blocos) {
			if(item.getId()== id) {
				bloco = item;
			}
		}
		return bloco;
	}

	public Usuario autenticar(Usuario usuario) {
		Usuario retorno = null;
		for ( Usuario item : usuarios ) {
			if( item.getLogin().equals(usuario.getLogin())
					&& item.getSenha().equals(usuario.getSenha())) {
				retorno = item;
			}
		}
		return retorno;
	}

	public Lami obterLami(Integer id) {
		Lami lami = null;
		for (Lami item : lamis) {
			if(item.getId()== id) {
				lami = item;
			}
		}
		return lami;
	}

	public void salvarLami(Lami lami) {
		if(lami.getId() != null && lami.getId() != 0) {
			alterarLami(lami);
		}else {
			inserirLami(lami);
		}
	}
	
	public void alterarLami(Lami lami) {
		Lami update = null;
		for (Lami item : lamis) {
			if(item.getId() == lami.getId()) {
				update = item;
			}
		}
		if(update != null) {
			update.setNome(lami.getNome());
			update.setDescricao(lami.getDescricao());
			update.setBloco(lami.getBloco());
		}
	}

	public void inserirLami(Lami lami) {
		Lami ultimo = null;
		if(lamis.isEmpty()) {
			lami.setId(1);
		} else {
			ultimo = lamis.get( this.lamis.size()-1);
			lami.setId(ultimo.getId()+1);
		}
		this.lamis.add(lami);
	}

	public void removerLami(Integer id) {
		Lami lami = null;
		for (Lami item : lamis) {
			if(item.getId()== id) {
				lami = item;
			}
		}
		if(lami != null) {
			this.lamis.remove(lami);
		}
	}
	
	public void inserirReserva(Reserva reserva) {
		Reserva ultimo = null;
		if(reservas.isEmpty()) {
			reserva.setId(1);
		} else {
			ultimo = reservas.get( this.reservas.size()-1);
			reserva.setId(ultimo.getId()+1);
		}
		this.reservas.add(reserva);
	}
	
	public void removerReserva(Integer id) {
		Reserva reserva = null;
		for (Reserva item : reservas) {
			if(item.getId()== id) {
				reserva = item;
			}
		}
		if(reserva != null) {
			this.reservas.remove(reserva);
		}
	}

}
