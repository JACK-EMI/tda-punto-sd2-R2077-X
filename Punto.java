
public class Punto implements IPunto {

    private double x;
    private double y;
    private double z;
    private Sistema sistema;
    private String etiqueta;

    // Métodos constructores
    public Punto() {
        this.x = y = z = 0;
        this.sistema = Sistema.PLANO;
    }

    public Punto(double _x, double _y) {
        this.x = _x;
        this.y = _y;
        this.sistema = Sistema.PLANO;
    }

    public Punto(double _x, double _y, double _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.sistema = Sistema.ESPACIO;
    }

    public Punto(Sistema _sistema, double _x, double _y) {
        this.x = _x;
        this.y = _y;
        this.z = 0;
        this.sistema = _sistema;
    }

    public Punto(Sistema _sistema, double _x, double _y, double _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.sistema = _sistema;
    }

    public Punto(Sistema _sistema, String _etiqueta, double _x, double _y, double _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.sistema = _sistema;
        this.etiqueta = _etiqueta;
    }

    @Override
    public String toString() {
        return "Punto [x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", sistema=" + this.sistema + "]";
    }

    // Métodos get y set
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double dameDistanciaEntreOtroPunto(Punto otroPunto) {
        double distancia = 0;
        double x1 = this.x;
        double y1 = this.y;
        double x2 = otroPunto.getX();
        double y2 = otroPunto.getY();
        double z1 = this.z;
        double z2 = otroPunto.getZ();

        System.out.println(this.toString());
        System.out.println(otroPunto.toString());

        if (this.sistema == Sistema.PLANO && otroPunto.getSistema() == Sistema.PLANO) {
            distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        } else if (this.sistema == Sistema.ESPACIO && otroPunto.getSistema() == Sistema.ESPACIO) {
            distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
        } else {
            System.out.println("Debe proporcionar un sistema compatible para calcular la distancia. Ejemplo: Sistema Plano y otro punto Sistema Plano ");
        }
        return distancia;
    }

    public Punto damePuntoMedioEntreOtroPunto(Punto otroPunto) {
        double xmedio=0;
        double ymedio=0;
        double zmedio = 0; 

        double ptx1 = this.x;
        double pty1 = this.y;
        double ptx2 = otroPunto.getX();
        double pty2 = otroPunto.getY();
        double ptz1 = this.z;
        double ptz2 = otroPunto.getZ();

        System.out.println(this.toString());
        System.out.println(otroPunto.toString());

        if (this.sistema == Sistema.PLANO && otroPunto.getSistema() == Sistema.PLANO) {
            xmedio = (ptx1 + ptx2) / 2;
            ymedio = (pty1 + pty2) / 2;
            return new Punto(Sistema.PLANO, xmedio, ymedio);
        } else if (this.sistema == Sistema.ESPACIO && otroPunto.getSistema() == Sistema.ESPACIO) {
            xmedio = (ptx1 + ptx2) / 2;
            ymedio = (pty1 + pty2) / 2;
            zmedio = (ptz1 + ptz2) / 2;
            return new Punto(Sistema.ESPACIO, xmedio, ymedio, zmedio);
        } else {
            System.out.println("Debe proporcionar un sistema compatible para calcular el punto medio.");
            return null; 
        }
    }
}