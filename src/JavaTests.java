import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
public class JavaTests {
    static class Sonido{
        public Sonido(int instrumento){
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel miCanal = synth.getChannels()[0];
                int volume = 80; // entre 0 y 127
                int duration = 200; // en milisegundos
                miCanal.programChange(instrumento);
                int[] notas={60,62,64,65,67,69,71,72};
                for(int nota: notas){
                    miCanal.noteOn( nota, volume );
                    Thread.sleep(duration);
                    miCanal.noteOff(nota);
                }
                Thread.sleep( 500 );
                synth.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static class Unidad2{
        public static void main( String[] args ) {
            new Sonido(39);
        }
    }


}
