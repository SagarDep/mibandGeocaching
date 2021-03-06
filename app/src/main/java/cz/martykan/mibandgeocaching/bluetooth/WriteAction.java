package cz.martykan.mibandgeocaching.bluetooth;

import java.util.UUID;

public class WriteAction implements BLEAction
{
    private final UUID characteristic;

    private final byte[] payload;

    public WriteAction(final UUID characteristic, final byte[] payload)
    {
        this.characteristic = characteristic;
        this.payload = payload;
    }

    public UUID getCharacteristic()
    {
        return characteristic;
    }

    public byte[] getPayload()
    {
        return payload;
    }

    @Override public void run()
    {
        //Do nothing.
    }
}