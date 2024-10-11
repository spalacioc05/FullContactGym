/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author spala
 */

public class Listar {

    public void generarPDFUsuarios(String archivoCSV, String archivoPDF) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(archivoPDF));
            document.open();

            // Título del documento
            Font fontTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Lista de Usuarios", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(new Paragraph(" ")); // Espacio en blanco

            // Tabla
            PdfPTable table = new PdfPTable(11); // 11 columnas
            addTableHeader(table);
            addRows(table, archivoCSV);

            document.add(table);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }

    private void addTableHeader(PdfPTable table) {
        Font fontHeader = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
        Stream.of("ID", "Nombre", "Correo", "Fecha de Nacimiento", "Género", "Tipo de Membresía", "Fecha de Inicio", "Fecha Final", "Monto a Pagar", "Estado de Pago", "Estado")
              .forEach(columnTitle -> {
                  PdfPCell header = new PdfPCell();
                  header.setPhrase(new Phrase(columnTitle, fontHeader));
                  table.addCell(header);
              });
    }

    private void addRows(PdfPTable table, String archivoCSV) throws IOException {
        Font fontRow = new Font(Font.FontFamily.HELVETICA, 6);
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String line;
            br.readLine(); // Saltar la cabecera
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if ("usuario".equals(data[2])) {
                    for (int i = 0; i < data.length; i++) {
                        if (i != 1 && i != 2) { // Omitir clave y rol
                            table.addCell(new Phrase(data[i], fontRow));
                        }
                    }
                }
            }
        }
    }
}