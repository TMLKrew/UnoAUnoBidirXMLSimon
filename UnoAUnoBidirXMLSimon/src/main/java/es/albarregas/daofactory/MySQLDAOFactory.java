package es.albarregas.daofactory;

import es.albarregas.dao.GenericoDAO;
import es.albarregas.dao.IGenericoDAO;
import es.albarregas.dao.IPuertoDAO;
import es.albarregas.dao.IServicioDAO;
import es.albarregas.dao.PuertoDAO;
import es.albarregas.dao.ServicioDAO;

public class MySQLDAOFactory extends DAOFactory{


    @Override
    public IGenericoDAO getGenericoDAO() {
        return new GenericoDAO();
    }

    @Override
    public IPuertoDAO getPuertoDAO() {
        return new PuertoDAO();
    }

    @Override
    public IServicioDAO getServicioDAO() {
         return new ServicioDAO();
    }

    

    
    
}
