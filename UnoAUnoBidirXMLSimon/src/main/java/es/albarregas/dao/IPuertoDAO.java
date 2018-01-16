/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Puerto;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface IPuertoDAO {
    
    public void add(Puerto puerto);
    public List<Puerto> get();
    public Puerto getOne(Long pk);
    public void update(Puerto puerto);
    public void delete(Puerto puerto);

    
}
