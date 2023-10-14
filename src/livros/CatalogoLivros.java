package livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor  = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro 1", "autor 1", 2021);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 2014);
        catalogoLivros.adicionarLivro("livro 3", "autor 3", 2015);
        catalogoLivros.adicionarLivro("livro 4", "autor 2", 2019);
        catalogoLivros.adicionarLivro("livro 5", "autor 5", 2022);

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2023));
    }

}
