package Jardineria.PatronBuilder;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Jardineria.ModelClass.cliente;
import Jardineria.ModelClass.cliente.DocumentoIdentidad;
import Jardineria.ModelClassDao.clienteDao;

public class BuilderCliente {

    static cliente cliente;

    public static cliente crearcliente(int codigo_cliente, String nombre_cliente, DocumentoIdentidad tipoIdentidad,
            String DNI, String email, String password) throws Exception {

        clienteDao nuevoClienteDao = new clienteDao();
        List<cliente> clientesguardados = nuevoClienteDao.getAll();

        // Existe cliente con mismo codigo? Vamo a ver
        for (cliente cliente : clientesguardados) {

            if (codigo_cliente == cliente.getCodigo_cliente()) {
                throw new Exception("Codigo en uso!!!");
            }

        }

        if (DNI.length() != 9) {
            throw new Exception("ESte codigo de identidad no tiene 9 digitos!!");
        }
        if (tipoIdentidad == DocumentoIdentidad.DNI) { // Comprueba los numerets del DNI.
            char letra = DNI.toUpperCase().charAt(8); // Guardo el ultimo digito en la variable de la "letra".
            if (!(letra > 64 && letra < 92)) { // Si el ultimo digito del dni no es una letra saltara una excepcion.
                throw new Exception("Tiene que ser una letra el ultimo digito");
            } else {
                for (int x = 0; x < 8; x++) { // Recorro todos los numeros del dni
                    letra = DNI.charAt(x); // Recojo el numero en la variable letra
                    if (!(letra > 47 && letra < 58)) { // Si la variable letra no contiene un numero saltara una
                                                       // excepcion.
                        throw new Exception("El ltimo digito no es un numero!!! Esta mal");
                    }
                }
            }

        }

        // Comprobar email
        Pattern patternEmail = Pattern.compile("^[ A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" // Esto crea un email y lo                         // guarda
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
        Matcher matherEmail = patternEmail.matcher(email); // Creo un Matcher y lo comparo con el mail del usuario.

        if (matherEmail.find() == false) { // Si el mail no sigue el Pattern establecido salta una excepcion.
            throw new Exception("Correo incorrecto"); // "Email incorrecto."
        }

        return cliente;

    }

}
