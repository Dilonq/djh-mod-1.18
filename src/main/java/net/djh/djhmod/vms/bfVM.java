package net.djh.djhmod.vms;

public class bfVM {
    private static final int TAPE_LENGTH = 256;
    private byte[] tape = new byte[TAPE_LENGTH];

    private String code = null;

    private int ptr;
    private int pc;

    public bfVM(){
        ptr = 0;
        pc = 0;
    }

    public void load(){}
}
