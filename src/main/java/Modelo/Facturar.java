/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author spala
 */


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Facturar {

    private static final String RUTA_ARCHIVO_PAGOS = "data/pagos.csv";
    private static final String DIRECTORIO_FACTURAS = "facturasPDF";

    // Agregar página de resumen al final
    public static void generarFacturaPDF(String id) {
        // Crear el directorio si no existe
        File directorio = new File(DIRECTORIO_FACTURAS);
        if (!directorio.exists()) {
            directorio.mkdir();
        }
    
        String rutaArchivoPDF = DIRECTORIO_FACTURAS + "/Factura_" + id + ".pdf";
    
        try (BufferedReader lector = new BufferedReader(new FileReader(RUTA_ARCHIVO_PAGOS))) {
            String linea;
            Document documento = new Document();
            PdfWriter escritor = PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivoPDF));
            documento.open();
    
            double montoTotal = 0.0;
    
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[3].equals(id)) {
                    agregarPaginaFactura(documento, escritor, datos);
                    montoTotal += Double.parseDouble(datos[7]);
                }
            }
    
            // Agregar página de resumen
            agregarPaginaResumen(documento, escritor, montoTotal);
    
            documento.close();
    
            // Abrir el archivo PDF
            File archivoPDF = new File(rutaArchivoPDF);
            if (archivoPDF.exists()) {
                Desktop.getDesktop().open(archivoPDF);
            }
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
    
    private static void agregarPaginaResumen(Document documento, PdfWriter escritor, double montoTotal) throws DocumentException {
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        Font fuenteTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
        Font fuenteNormal = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
    
        documento.newPage();
    
        // Agregar encabezado
        Paragraph encabezado = new Paragraph("Resumen de Pagos", fuenteTitulo);
        encabezado.setAlignment(Element.ALIGN_CENTER);
        documento.add(encabezado);
    
        Paragraph subEncabezado = new Paragraph("\n\n", fuenteNormal);
        subEncabezado.setAlignment(Element.ALIGN_CENTER);
        documento.add(subEncabezado);
    
        // Agregar monto total
        PdfPTable tabla = new PdfPTable(1);
        tabla.setWidthPercentage(50); // Establecer el ancho de la tabla al 50% del ancho de la página
        tabla.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar la tabla horizontalmente
        tabla.setSpacingBefore(10f);
        tabla.setSpacingAfter(10f);
    
        PdfPCell celda;
    
        celda = new PdfPCell(new Phrase("Total Pagado: " + montoTotal, fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tabla.addCell(celda);
    
        documento.add(tabla);
    
        // Agregar pie de página
        Paragraph piePagina = new Paragraph("Gracias por su preferencia.\n\n", fuenteNormal);
        piePagina.setAlignment(Element.ALIGN_CENTER);
        documento.add(piePagina);
    }

    private static void agregarPaginaFactura(Document documento, PdfWriter escritor, String[] datos) throws DocumentException {
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        Font fuenteTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
        Font fuenteNormal = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
    
        // Establecer color de fondo
        Rectangle rectangulo = new Rectangle(documento.getPageSize());
        rectangulo.setBackgroundColor(new BaseColor(255, 241, 187));
        escritor.setBoxSize("art", rectangulo);
    
        documento.newPage();
    
        // Agregar encabezado
        Paragraph encabezado = new Paragraph(Membresia.getNombreEmpresa(), fuenteTitulo);
        encabezado.setAlignment(Element.ALIGN_CENTER);
        documento.add(encabezado);
    
        Paragraph subEncabezado = new Paragraph(Membresia.getDireccion() + "\nTel: " + Membresia.getTelefono() + "\nCorreo: " + Membresia.getCorreo() + "\n\n", fuenteNormal);
        subEncabezado.setAlignment(Element.ALIGN_CENTER);
        documento.add(subEncabezado);
    
        // Agregar detalles de la factura
        PdfPTable tabla = new PdfPTable(1);
        tabla.setWidthPercentage(50); // Establecer el ancho de la tabla al 50% del ancho de la página
        tabla.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar la tabla horizontalmente
        tabla.setSpacingBefore(10f);
        tabla.setSpacingAfter(10f);
    
        PdfPCell celda;
    
        celda = new PdfPCell(new Phrase("Factura N.º: " + datos[0], fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tabla.addCell(celda);
    
        celda = new PdfPCell(new Phrase("Fecha de emisión: " + datos[1], fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tabla.addCell(celda);
    
        celda = new PdfPCell(new Phrase("Fecha de vencimiento: " + datos[2], fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tabla.addCell(celda);
    
        celda = new PdfPCell(new Phrase(""));
        celda.setBorder(Rectangle.NO_BORDER);
        tabla.addCell(celda);
    
        documento.add(tabla);
    
        // Agregar detalles del cliente
        PdfPTable tablaCliente = new PdfPTable(1);
        tablaCliente.setWidthPercentage(50); // Establecer el ancho de la tabla al 50% del ancho de la página
        tablaCliente.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar la tabla horizontalmente
        tablaCliente.setSpacingBefore(10f);
        tablaCliente.setSpacingAfter(10f);
        
        PdfPCell celdaCliente;
        
        celdaCliente = new PdfPCell(new Phrase("Cliente\nID: " + datos[3] + "\nNombre: " + datos[4] + "\nCorreo: " + datos[5] + "\n\n", fuenteNormal));
        celdaCliente.setBorder(Rectangle.NO_BORDER);
        celdaCliente.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tablaCliente.addCell(celdaCliente);
        
        documento.add(tablaCliente);
        
        // Determinar tipo de membresía y obtener descripción
        Membresia membresia;
        switch (datos[6]) {
            case "Oro":
                membresia = new MembresiaOro();
                break;
            case "Plata":
                membresia = new MembresiaPlata();
                break;
            case "Bronce":
                membresia = new MembresiaBronce();
                break;
            default:
                throw new IllegalArgumentException("Tipo de membresía desconocido: " + datos[6]);
        }
    
        // Agregar descripción de la membresía
        Paragraph descripcionMembresia = new Paragraph("Descripción de la membresía:\n\n" + membresia.getDescripcion() + "\n\n", fuenteNormal);
        descripcionMembresia.setAlignment(Element.ALIGN_CENTER); // Centrar el párrafo en la página
        documento.add(descripcionMembresia);
    
        // Agregar detalles de la membresía
        PdfPTable tablaMembresia = new PdfPTable(1);
        tablaMembresia.setWidthPercentage(50); // Establecer el ancho de la tabla al 50% del ancho de la página
        tablaMembresia.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar la tabla horizontalmente
        tablaMembresia.setSpacingBefore(10f);
        tablaMembresia.setSpacingAfter(10f);
    
        celda = new PdfPCell(new Phrase("Membresía: " + datos[6], fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tablaMembresia.addCell(celda);
    
        celda = new PdfPCell(new Phrase("Subtotal: " + datos[7], fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tablaMembresia.addCell(celda);
    
        celda = new PdfPCell(new Phrase("Impuestos (IVA 19%): $0 (Incluido)", fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tablaMembresia.addCell(celda);
    
        celda = new PdfPCell(new Phrase("Total a pagar: " + datos[7], fuenteNegrita));
        celda.setBorder(Rectangle.NO_BORDER);
        celda.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear texto a la izquierda dentro de la celda
        tablaMembresia.addCell(celda);
    
        documento.add(tablaMembresia);
    
        // Agregar pie de página
        Paragraph piePagina = new Paragraph("Gracias por su preferencia.\n\n", fuenteNormal);
        piePagina.setAlignment(Element.ALIGN_CENTER);
        documento.add(piePagina);
    }

    public static void generarFacturaMembresiaPDF(String tipoMembresia) {
        // Crear el directorio si no existe
        File directorio = new File(DIRECTORIO_FACTURAS);
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        String rutaArchivoPDF = DIRECTORIO_FACTURAS + "/Facturas_" + tipoMembresia + ".pdf";

        try (BufferedReader lector = new BufferedReader(new FileReader(RUTA_ARCHIVO_PAGOS))) {
            String linea;
            Document documento = new Document();
            PdfWriter escritor = PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivoPDF));
            documento.open();

            double montoTotal = 0.0;

            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[6].equalsIgnoreCase(tipoMembresia)) {
                    agregarPaginaFactura(documento, escritor, datos);
                    montoTotal += Double.parseDouble(datos[7]);
                }
            }

            // Agregar página de resumen
            agregarPaginaResumen(documento, escritor, montoTotal);

            documento.close();

            // Abrir el archivo PDF
            File archivoPDF = new File(rutaArchivoPDF);
            if (archivoPDF.exists()) {
                Desktop.getDesktop().open(archivoPDF);
            }
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

}