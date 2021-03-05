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
public class administrarPersonas {

    private ArrayList<Cliente> listaPersonas = new ArrayList();
    private File archivo = null;

    public administrarPersonas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Cliente> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Cliente> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Cliente p) {
        this.listaPersonas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cliente t : listaPersonas) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getTrabajo() + ";");
                bw.write(t.getUsuario() + ";");
                bw.write(t.getPassword() + ";");
                bw.write(t.getDinero() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Cliente(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
