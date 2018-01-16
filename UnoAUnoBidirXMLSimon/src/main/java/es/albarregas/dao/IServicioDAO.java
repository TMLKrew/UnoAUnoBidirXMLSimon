/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Servicio;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface IServicioDAO {
    
    public void add(Servicio servicio);
    public List<Servicio> get();
    public Servicio getOne(Long pk);
    public void update(Servicio servicio);
    public void delete(Servicio servicio);

    
}
