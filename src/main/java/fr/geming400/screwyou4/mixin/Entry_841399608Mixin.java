package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ArgumentSignatures.Entry.class)
public class Entry_841399608Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature__403085176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403085176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__294060864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294060864L))
            info.setReturnValue(";D꺗L(.댨C䠑$Y`Mm3|qf$");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2068055430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068055430L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__294060368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294060368L))
            info.setReturnValue("7V?夠X評S=놰Z#<L2=s*Qܗ;GXb:?n0<|DL6hJ/0;u輭⢎(\"伜?C+h(d^n],#U<OB%侟o:m卮^pv\"mX*p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_879662349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879662349L))
            info.setReturnValue(227936231);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_487906486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(487906486L))
            info.cancel();
    }


}
