/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.EquipoParteFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.EquipoParte;

/**
 *
 * @author joker
 */
@Path("equipoparte")
public class EquipoParteResource extends AbstractResource<EquipoParte>{
    
    @EJB
    private EquipoParteFacadeLocal epfl;


    @Override
    protected AbstractInterface<EquipoParte> getFacade() {
        return epfl;
    }

    @Override
    protected EquipoParte crearNuevo() {
        return new EquipoParte();
    }
    
}
