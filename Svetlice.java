import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Svetlice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Svetlice extends Actor{
    
    int pocetKroku = 0;
    
    
    public void act() {
        pocetKroku++;
        
        move(3);
        move(3);
        
        if (pocetKroku == 10) {
            
            World svet = getWorld();
            Svetlice svetlice1 = new Svetlice();
            int x = getX();
            int y = getY();
            svet.addObject(svetlice1, x, y);
            svetlice1.turn(30);
            pocetKroku = 0;
        }
        
    }    
}
