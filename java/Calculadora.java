public class Calculadora{
        // atributo
        private int resultado = 0;
        // método somar
        public double somar( int x1, int x2 ){
            resultado = x1 + x2;
            return resultado;
        }
        // método subtrair
        public double subtrair( int y1, int y2 ){
            resultado = y1 ­ y2;
            return resultado;
        }
        // método multiplicar
        public double multiplicar( int z1, int z2 ){
            resultado = z1 * z2;
            return resultado;
        }
        // método dividir
        public double dividir( int d1, int d2 ){
            resultado = d1 / d2;
            return resultado;
        }
}
