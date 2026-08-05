package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.DelegateDataOutput.class)
public class DelegateDataOutput1151151414Mixin {
        @Inject(at = @At("HEAD"), method = "write([BII)V", cancellable = true)
    private void write__1253530095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1253530095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write([B)V", cancellable = true)
    private void write_1710864625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710864625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(I)V", cancellable = true)
    private void write_1290455297(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290455297L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)V", cancellable = true)
    private void writeInt__1535578126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1535578126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUTF(Ljava/lang/String;)V", cancellable = true)
    private void writeUTF_558689707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(558689707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeLong(J)V", cancellable = true)
    private void writeLong__1340322146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1340322146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeByte(I)V", cancellable = true)
    private void writeByte__178866007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-178866007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeShort(I)V", cancellable = true)
    private void writeShort_875121279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(875121279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/lang/String;)V", cancellable = true)
    private void writeBytes_1002356391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1002356391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChar(I)V", cancellable = true)
    private void writeChar_185563255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(185563255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)V", cancellable = true)
    private void writeFloat__1886144036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1886144036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeDouble(D)V", cancellable = true)
    private void writeDouble_2143096685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2143096685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBoolean(Z)V", cancellable = true)
    private void writeBoolean_978332796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(978332796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChars(Ljava/lang/String;)V", cancellable = true)
    private void writeChars__243243275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-243243275L))
            info.cancel();
    }


}
