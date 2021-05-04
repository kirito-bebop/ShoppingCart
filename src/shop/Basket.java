package shop;


import ds.DynArray;

public class Basket {
    //---------------------
    //      ATRIBUTOS
    //---------------------
    DynArray<BasketEntry> entryList = new DynArray<BasketEntry>();

    //---------------------
    //      CONSTRUCTOR
    //---------------------

    /**
     * Colección de entradas do carrito
     * @return a compra toda
     */
    public DynArray<BasketEntry> getEntryList(){
        return entryList;
    }

    //---------------------
    //      METODOS
    //---------------------

    /**
     * Devolve se está vacío o carrito ou non. O array
     * dinámico ten un método co que podemos saber se
     * a nosa entryList está vacía ou non.
     * @return boolean entryList.isEmpty()
     */
    public boolean isEmpty(){
        return entryList.isEmpty();
    }

    /**
     * Método que devolve o número total de items que hai no carro.
     * @return numEntries = número de entradas.
     */
    public int getNumEntries(){
        int numEntries = 0;
        int size = entryList.size();
        for(int i = 0; i< size;i++){
            BasketEntry be = (BasketEntry) entryList.get(i);
            numEntries += be.getItems();
        }
        return numEntries;
    }



}
