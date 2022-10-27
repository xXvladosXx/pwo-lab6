package pwo.app;
import pwo.utils.SequenceTools;

/**
 *
 * @author pidoras
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     *
     * @param args
     * @return
     */
    @Override
    protected boolean getArgs(String[] args) {

        if (super.getArgs(args)) return true;

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     *
     * @return
     */
    @Override
    protected boolean writeSeq() {

        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));

        return true;
    }

    /**
     *
     * @param args
     */
    @Override
    public void run(String[] args) {

        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }

        writeSeq();

    }

}