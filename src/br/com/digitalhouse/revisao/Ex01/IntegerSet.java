package br.com.digitalhouse.revisao.Ex01;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

    List<Integer> conjuntos = new ArrayList<>();

    public List<Integer> uniao(List<Integer> conjuntoNovo) {
        List<Integer> novoConjuntoCompleto = new ArrayList<>();

        novoConjuntoCompleto.addAll(conjuntos);
        novoConjuntoCompleto.addAll(conjuntoNovo);

        return novoConjuntoCompleto;
    }

    public List<Integer> interseccao(List<Integer> novoConjunto) {
        List<Integer> conjuntoComNumerosIguais = new ArrayList<>();

        for (Integer numeroNovoConjunto : novoConjunto) {

            for (Integer numeroConjuntoClasse : this.conjuntos) {

                if (numeroNovoConjunto.equals(numeroConjuntoClasse)) {
                    conjuntoComNumerosIguais.add(numeroNovoConjunto);
                }
            }
        }
        return conjuntoComNumerosIguais;
    }

    public List<Integer> diferenca(List<Integer> novissimoConjunto) {
        List<Integer> conjuntoComNumerosDiferentes = new ArrayList<>();

        for (Integer numeroConjuntoNovissimo : novissimoConjunto) {

            if (!this.conjuntos.contains(numeroConjuntoNovissimo)) {
                conjuntoComNumerosDiferentes.add(numeroConjuntoNovissimo);
            }
        }
        return conjuntoComNumerosDiferentes;
    }
}