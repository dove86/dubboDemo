package com.py;

/**
 * Created by Administrator on 3/31/2018.
 *
 * 单向链表反转
 */
public class LinedkedListReverse {

    public static void main(String[] args) {


        Elem elem1 = new Elem("a");
        Elem elem2 = new Elem("b");
        elem1.setNext(elem2);
        Elem elem3 = new Elem("c");
        elem2.setNext(elem3);
        Elem elem4 = new Elem("d");
        elem3.setNext(elem4);

        System.out.println(elem1);

        reverse(elem1);


    }
    private static void reverse(Elem elem){

        Elem prev = null;
        Elem cur = null;

        while (elem != null){

            prev = cur;
            cur = elem;
//            System.out.println(prev == null?null:prev.getVal());
//            System.out.println(cur == null?null:cur.getVal());
//            System.out.println("-----------");
            elem = elem.getNext();
            cur.setNext(prev);
        }
        System.out.println(cur);

    }
    private static class Elem{

        private String val;
        private Elem next;

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public Elem getNext() {
            return next;
        }

        public void setNext(Elem next) {
            this.next = next;
        }

        public Elem(String val) {
            this.val = val;
        }

        @Override
        public String toString() {

            String str = "";

            Elem curElement =  this;
            while (curElement != null){
                str+= "-->"+curElement.getVal();
                curElement = curElement.getNext();
            }
            return str;
        }
    }
}
