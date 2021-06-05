import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class Dupa {

    private final static AtomicBoolean atomicBoolean = null;


    public static void main(String[] args) throws RakPointerException {
        try {
            Iterator<String> iterator = Arrays.asList("test", "test2", "dupa").iterator();

            try {
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                    throw new NullPointerException();
                }
            } catch (NullPointerException e) {
                System.out.println("Kod Ci się zdupił bro");
                Arrays.stream(e.getStackTrace()).forEach(System.out::println);
                e.printStackTrace();
                try {
                    try {
                        throw new NullPointerException();
                    } catch (NullPointerException e1) {
                        new Thread(() -> {
                            try {
                                if (atomicBoolean.get()) {
                                    try {
                                        throw new RakPointerException("Raka masz frajerze. Na chuj to zawsze jest true");
                                    } catch (RakPointerException rakPointerException) {
                                        rakPointerException.printStackTrace();
                                        System.out.println(rakPointerException.getErrorName());
                                    }
                                }
                            } catch (Exception e2) {
                                try {
                                    Integer i = null;
                                    int[] tab = new int[new Null().getNullPointerException()];
                                    tab[0] = 0;
                                    throw new RakPointerException("Raka masz frajerze. Na chuj to zawsze jest true");
                                } catch (RakPointerException rakPointerException) {
                                    rakPointerException.printStackTrace();
                                    System.out.println(rakPointerException.getErrorName());
                                }
                            }

                        }).start();
                    }

                } catch (NullPointerException exception) {
                    exception.printStackTrace();
                    if (exception instanceof NullPointerException) {
                        Null nul = new Null();
                        NullPointerException nullPointerException = new NullPointerException();

                        if (nullPointerException.equals(nul.getNullPointerException())) {
                            System.out.println("Norbi to null");
                            nul.getNullPointerException();
                        }
                        throw new NullPointerException();

                    }
                }
            }
        } catch (Exception e) {
            throw new RakPointerException("Lo kurwa wszystko jebło");
        }
    }


}
