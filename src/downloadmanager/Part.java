/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloadmanager;

import java.io.Serializable;

/**
 *
 * @author gnik
 */
public class Part implements Serializable{
    long startByte;
    long endByte;
    
    public Part(long startByte,long endByte){
        this.startByte=startByte;
        this.endByte=endByte;
    }

    public long getStartByte() {
        return startByte;
    }

    public long getEndByte() {
        return endByte;
    }
    
    
    
}