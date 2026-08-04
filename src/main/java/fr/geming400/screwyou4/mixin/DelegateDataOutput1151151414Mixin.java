package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.DelegateDataOutput.class)
public class DelegateDataOutput1151151414Mixin {
        @Inject(at = @At("HEAD"), method = "write([BII)V", cancellable = true)
    private void write__2141220080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141220080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write([B)V", cancellable = true)
    private void write_664132016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664132016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(I)V", cancellable = true)
    private void write__1929898910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929898910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)V", cancellable = true)
    private void writeInt__1929898910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929898910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUTF(Ljava/lang/String;)V", cancellable = true)
    private void writeUTF__1991454733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1991454733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeLong(J)V", cancellable = true)
    private void writeLong__1928975389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1928975389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeByte(I)V", cancellable = true)
    private void writeByte__1929898910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929898910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeShort(I)V", cancellable = true)
    private void writeShort__1929898910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929898910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/lang/String;)V", cancellable = true)
    private void writeBytes__1991454733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1991454733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChar(I)V", cancellable = true)
    private void writeChar__1929898910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929898910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)V", cancellable = true)
    private void writeFloat__1932669473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1932669473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeDouble(D)V", cancellable = true)
    private void writeDouble__1934516515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934516515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBoolean(Z)V", cancellable = true)
    private void writeBoolean__1914199053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1914199053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChars(Ljava/lang/String;)V", cancellable = true)
    private void writeChars__1991454733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1991454733L))
            info.cancel();
    }


}
