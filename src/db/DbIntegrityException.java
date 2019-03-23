/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Jonas
 */
public class DbIntegrityException extends RuntimeException{
    
    public DbIntegrityException(String msg){
        super(msg);
    }
    
}
