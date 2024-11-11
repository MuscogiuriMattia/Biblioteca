class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale s1 = new Scaffale ("8");
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro l1 = new Libro("Harry Potter", "j.k Rowling" , 12.05f , 672 , "Mondadori");
        Libro l2 = new Libro("Cronache di Narnia" , "c.s Lewis" , 19.95f , 1168 , "Mondadodri");
        Libro l3 = new Libro("Il signore degli anelli" , "j.r.r Tolkien" , 26.60f , 496 , "Mondadori");
        Libro l4 = new Libro("Percy Jackson" , "Rick Riordan" ,  12.00f , 343 ,"Mondadori");
        Libro l5 = new
        s1.aggiungi(l1);
        s1.aggiungi(l2);
        s1.aggiungi(l3);
        s1.aggiungi(l4);
        s1.aggiungi(l5);
        //Visualizzare il contenuto dello scaffale
        s1.elencaLibri();
        
        s1.elencaLibri(
        
        s1.elencaLibri(
        
    }
}