/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class administrarCarros {

    private ArrayList<Auto> listaCarros = new ArrayList();
    private File archivo = null;

    public administrarCarros(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Auto> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Auto> listaCarros) {
        this.listaCarros = listaCarros;
    }

    @Override
    public String toString() {
        return "listaCarros=" + listaCarros;
    }

    //extra mutador
    public void setCarro(Auto p) {
        this.listaCarros.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Auto t : listaCarros) {
                bw.write(t.getVin()+ ";");
                bw.write(t.getMarca()+ ";");
                bw.write(t.getModelo()+ ";");
                bw.write(t.getCarroceria()+ ";");
                bw.write(t.getPasajeros()+ ";");
                bw.write(t.getMaletero()+ ";");
                bw.write(t.getColor()+ ";");
                bw.write(t.getPrecio()+ ";");
                bw.write(t.getPotencia()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaCarros = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaCarros.add(new Auto(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
