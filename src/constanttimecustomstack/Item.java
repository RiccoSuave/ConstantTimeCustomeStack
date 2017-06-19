/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constanttimecustomstack;

/**
 *
 * @author sansari
 */
class Item implements Comparable<Item> {
    String name;
    int id;
    public Item(String name, int id){
      this.name = name;
      this.id = id;
    }

    @Override
    public int compareTo(Item o) {
        if (o == null) throw new NullPointerException("Second Object is null");
        if (this.id < o.id) return -1;
        else if (this.id > o.id) return 1;
        return 0;
    }
}
