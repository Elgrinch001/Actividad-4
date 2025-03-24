public class DecodificarMensaje {
    public static void main(String[] args) {

        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        String mensajeDecodificado = mensajeCodificado.replace("0", "o").replace("3", "e").replace("4", "a");

        mensajeDecodificado = mensajeDecodificado.trim().replaceAll(" +", " ");

        mensajeDecodificado = mensajeDecodificado.toUpperCase();

        System.out.println("Mensaje decodificado: " + mensajeDecodificado);
    }
}
