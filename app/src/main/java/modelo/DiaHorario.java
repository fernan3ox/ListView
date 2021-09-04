package modelo;

public class DiaHorario {

    private String Asignatura;
    private String Dia;

    public DiaHorario(String asignatura, String dia) {
        Asignatura = asignatura;
        Dia = dia;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }
}
