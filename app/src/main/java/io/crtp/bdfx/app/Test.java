package io.crtp.bdfx.app;
// this code was found in the following link
// https://bitcoin.stackexchange.com/questions/50370/how-to-retrieve-the-from-and-to-wallet-addresses-of-a-transaction
// it's been modified to reflect xyz version of bitcoinj

import org.bitcoinj.core.*;
import org.bitcoinj.core.Address;
import org.bitcoinj.params.MainNetParams;

import org.spongycastle.crypto.digests.RIPEMD160Digest;

import java.nio.file.Files;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws Exception {
        /***
        byte[] b;
        NetworkParameters np = MainNetParams.get();
        Context.propagate(new Context(np));
        //b = Files.readAllBytes(new File("genesis.bin").toPath());
        b = Files.readAllBytes(new File("genesis.bin").toPath());
        Transaction tx1 = new Transaction(np, b);
        System.out.println(tx1);
        //byte[] pk = tx1.getOutput(0).getScriptPubKey().getPubKeys();
        java.util.List<ECKey> pk = tx1.getOutput(0).getScriptPubKey().getPubKeys();
        log.debug("pk.size "+ pk.size());
        //System.out.println(bytesToHex(pk));
        //System.out.println(bytesToHex(hash160(pk)));
        //Address a = new Address(np, hash160(pk));
        //System.out.println(a);
         */
    }

    public static void one() {
        try {
            log.debug("Test.one");
            byte[] b;
            NetworkParameters np = MainNetParams.get();
            Context.propagate(new Context(np));
            //b = Files.readAllBytes(new File("genesis.bin").toPath());
            //blockChainFiles.add(new File("../blocks/blk00000.dat"));

            b = Files.readAllBytes(new File("../blocks/blk00000.dat").toPath());
            Transaction tx1 = new Transaction(np, b);
            System.out.println("tx1 "+tx1);
            //byte[] pk = tx1.getOutput(0).getScriptPubKey().getPubKeys();
            java.util.List<ECKey> pk = tx1.getOutput(0).getScriptPubKey().getPubKeys();
            log.debug("pk.size "+ pk.size());
            //System.out.println(bytesToHex(pk));
            //System.out.println(bytesToHex(hash160(pk)));
            //Address a = new Address(np, hash160(pk));
            //System.out.println(a);
        }catch(Exception ex){
            log.debug(ex.toString());
        }
    }

    static byte[] hash160(byte[] in) {
        MessageDigest d1;
        try {
            d1 = MessageDigest.getInstance("SHA-256");
        } catch(NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        d1.update(in);
        byte[] digest = d1.digest();
        RIPEMD160Digest d2 = new RIPEMD160Digest();
        d2.update(digest, 0, 32);
        byte[] ret = new byte[20];
        d2.doFinal(ret, 0);
        return ret;
    }
    final protected static char[] hexArray = "0123456789abcdef".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
