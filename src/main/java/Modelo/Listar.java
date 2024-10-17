/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to editar este template
 */
package Modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

/**
 *
 * @autor spala
 */

public class Listar {

    protected static final String RUTA_ARCHIVO = "data\\basededatos.csv";

    public void generarPDFUsuarios(String archivoPDF) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(archivoPDF));
            documento.open();

            Font fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Lista de Usuarios", fuenteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(new Paragraph(" "));

            PdfPTable tabla = new PdfPTable(11);
            agregarEncabezadoTabla(tabla);
            agregarFilas(tabla, RUTA_ARCHIVO);

            documento.add(tabla);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            documento.close();
        }
    }

    private void agregarEncabezadoTabla(PdfPTable tabla) {
        Font fuenteEncabezado = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
        Stream.of("ID", "Nombre", "Correo", "Fecha de Nacimiento", "Género", "Tipo de Membresía", "Fecha de Inicio", "Fecha de Vencimiento", "Monto a Pagar", "Estado de Pago", "Estado")
              .forEach(tituloColumna -> {
                  PdfPCell encabezado = new PdfPCell();
                  encabezado.setPhrase(new Phrase(tituloColumna, fuenteEncabezado));
                  tabla.addCell(encabezado);
              });
    }

    private void agregarFilas(PdfPTable tabla, String archivoCSV) throws IOException {
        Font fuenteFila = new Font(Font.FontFamily.HELVETICA, 6);
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if ("usuario".equals(datos[2])) {
                    for (int i = 0; i < datos.length; i++) {
                        if (i != 1 && i != 2) {
                            tabla.addCell(new Phrase(datos[i], fuenteFila));
                        }
                    }
                }
            }
        }
    }

    public void generarPDFUsuariosPorMembresia(String archivoPDF, String tipoMembresia) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(archivoPDF));
            documento.open();
    
            Font fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Lista de Usuarios - Membresía " + tipoMembresia, fuenteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(new Paragraph(" "));
    
            PdfPTable tabla = new PdfPTable(11);
            agregarEncabezadoTabla(tabla);
            agregarFilasPorMembresia(tabla, RUTA_ARCHIVO, tipoMembresia);
    
            documento.add(tabla);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            documento.close();
        }
    }
    
    private void agregarFilasPorMembresia(PdfPTable tabla, String archivoCSV, String tipoMembresia) throws IOException {
        Font fuenteFila = new Font(Font.FontFamily.HELVETICA, 6);
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if ("usuario".equals(datos[2]) && tipoMembresia.equalsIgnoreCase(datos[7])) {
                    for (int i = 0; i < datos.length; i++) {
                        if (i != 1 && i != 2) {
                            tabla.addCell(new Phrase(datos[i], fuenteFila));
                        }
                    }
                }
            }
        }
    }
}