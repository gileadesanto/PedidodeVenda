package br.com.algaworks.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaProdutoBean {

		private List<Integer> produtosFiltrados;

		public List<Integer> getProdutosFiltrados() {
			return produtosFiltrados;
		}

		public PesquisaProdutoBean() {
			produtosFiltrados = new ArrayList<>();
			for (int i = 0; i < 50; i++) {
				produtosFiltrados.add(i);
			}
		}
}
