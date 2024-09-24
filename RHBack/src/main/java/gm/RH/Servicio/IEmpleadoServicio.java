package gm.RH.Servicio;

import gm.RH.Modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleados(Integer idEmpleado);

    public Empleado guardarEmpleados(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
