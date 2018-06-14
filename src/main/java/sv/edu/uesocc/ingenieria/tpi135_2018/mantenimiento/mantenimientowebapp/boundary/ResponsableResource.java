/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.ResponsableFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Responsable;

/**
 *
 * @author joker
 */
@Path("responsable")
public class ResponsableResource extends AbstractResource<Responsable> {

    @EJB
    private ResponsableFacadeLocal rfl;


    @Override
    protected AbstractInterface<Responsable> getFacade() {
        return rfl;
    }

    @Override
    protected Responsable crearNuevo() {
        return new Responsable();
    }

}
