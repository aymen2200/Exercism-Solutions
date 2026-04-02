import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class HandshakeCalculator {

    

    List<Signal> calculateHandshake(int number) {
        ArrayList<Signal> list = new ArrayList<>();
        int bit = number & 1;
        if(bit == 1) {
            list.add(Signal.WINK);
        }
        bit = (number >> 1) & 1;
        if(bit == 1) {
            list.add(Signal.DOUBLE_BLINK);
        }
        bit = (number >> 2) & 1;
        if(bit == 1) {
            list.add(Signal.CLOSE_YOUR_EYES);
        }
        bit = (number >> 3) & 1;
        if(bit == 1) {
            list.add(Signal.JUMP);
        }
        bit = (number >> 4) & 1;
        if(bit == 1) {
            return list.reversed();
        }
        return list;
    }

}
