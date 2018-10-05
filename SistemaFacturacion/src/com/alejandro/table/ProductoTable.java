package com.alejandro.table;

import com.alejandro.dominio.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProductoTable extends AbstractTableModel {

    String titulo[] = {"Codigo", "Codigo de Barras", "Nombre", "Precio", "Costo"};

    private List<Producto> filas;
    private Producto producto;

    public ProductoTable(List<Producto> filas) {
        this.filas = filas;
    }
//Herencia

    @Override
    public int getRowCount() {
        return getFilas() != null ? getFilas().size() : 0;//retorna el numero de filas
    }

    @Override
    public int getColumnCount() {
        return titulo.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulo[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        setProducto(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getProducto().getCodigo();
            case 1:
                return getProducto().getCodigoBarras();
            case 2:
                return getProducto().getNombre();
            case 3:
                return getProducto().getPrecio();
            case 4:
                return getProducto().getCosto();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Producto> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Producto> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param persona the persona to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
