package co.unicauca.travelagency.client.infra;

import co.unicauca.travelagency.commons.infra.Utilities;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representa el Socket de la aplicación cliente. Su función es enviar una
 * solicitud/respuesta entre el cliente y el servidor.
 *
 * @author Libardo, Julio
 */
public class TravelAgencySocket {

    /**
     * Socket de la aplicación cliente
     */
    private java.net.Socket socket = null;
    /**
     * Permite leer la recibir la respuesta del socket
     */
    private Scanner input;
    /**
     * Permite enviar una solicitud por el socket
     */
    private PrintStream output;
    /**
     * Ip del Server Socket
     */
    private final String IP_SERVER = Utilities.loadProperty("server.ip");
    /**
     * Puerto del server socket
     */
    private final int PORT = Integer.parseInt(Utilities.loadProperty("server.port"));

    /**
     * Envia una solicitud desde la aplicación cliente al servidor mediate el
     * socket
     *
     * @param requestJson solicitud en formato json
     * @return respuesta del scoket
     * @throws IOException error de entrada y salida
     */
    public String sendStream(String requestJson) throws IOException {
        String response = "";
        input = new Scanner(socket.getInputStream());
        output = new PrintStream(socket.getOutputStream());
        output.flush();

        // Enviar la solicitud
        output.println(requestJson);

        // Procesa la respuesta
        if (input.hasNextLine()) {
            response = input.nextLine();
        }
        return response;
    }

    /**
     * Cierra los flujos input y output
     */
    public void closeStream() {
        output.close();
        input.close();
    }

    /**
     * Desconectar el socket
     */
    public void disconnect() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(TravelAgencySocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Conectar o abrir un socket
     *
     * @throws IOException error de entrada y salida
     */
    public void connect() throws IOException {
        socket = new java.net.Socket(IP_SERVER, PORT);
        Logger.getLogger("SocketClient").log(Level.INFO, "Socket establecido");
    }

}
