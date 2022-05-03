package lista;

public class Lista {

    private Elemento inicio = null, atual, aux, ant;

    public void push(Integer numero) {
        if (inicio == null) {
            inicio = new Elemento(numero, null, null);
            ant = inicio;
        } else {
            atual = new Elemento(numero, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void top() {
        Elemento x = atual;
        System.out.println(x.getObjeto());
    }

    public Object[] pesquisar(Integer id) {
        Elemento x = inicio;
        Integer c = null;
        Object[] arrayPesq = {x, c};
        while (x != null) {
            c = (Integer) x.getObjeto();
            if (id == c) {
                arrayPesq[0] = x;
                arrayPesq[1] = c;

                return arrayPesq;
            }
            x = x.getProx();
        }
        throw new IllegalArgumentException("Número não encontrado ");
    }

    public boolean pop() throws Exception {
        Elemento rem = (Elemento) atual;
        if (rem != null) {
            if (rem == inicio) {
                inicio = rem.getProx();
                rem.setProx(null);
                inicio.setAnt(null);
                return true;
            } else if (rem == atual) {
                aux = rem.getAnt();
                atual = rem.getAnt();
                rem.setAnt(null);
                return true;
            } else {
                rem.getAnt().setProx(rem.getProx());
                rem.getProx().setAnt(rem.getAnt());
                rem.setProx(null);
                rem.setAnt(null);
            }
        }
        return false;
    }

    public void exibir() {
        Elemento x = inicio;
        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    public boolean remover(int id) throws Exception {
        Elemento rem = (Elemento) pesquisar(id)[0];
        if (rem != null) {
            if (rem == inicio) {
                inicio = rem.getProx();
                rem.setProx(null);
                inicio.setAnt(null);
                return true;
            } else if (rem == atual) {
                aux = rem.getAnt();
                atual = rem.getAnt();
                rem.setAnt(null);
                return true;
            } else {
                rem.getAnt().setProx(rem.getProx());
                rem.getProx().setAnt(rem.getAnt());
                rem.setProx(null);
                rem.setAnt(null);
            }
        }
        return false;
    }

    // Inner class
    private class Elemento {

        private Object objeto;
        private Elemento prox;
        private Elemento ant;

        public Elemento(Object objeto, Elemento prox, Elemento ant) {
            this.objeto = objeto;
            this.prox = prox;
            this.ant = ant;
        }

        public Object getObjeto() {
            return objeto;
        }

        public Elemento getProx() {
            return prox;
        }

        public void setProx(Elemento prox) {
            this.prox = prox;
        }

        public Elemento getAnt() {
            return ant;
        }

        public void setAnt(Elemento ant) {
            this.ant = ant;
        }
    }

}