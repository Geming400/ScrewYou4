package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Crypt.SaltSignaturePair.class)
public class SaltSignaturePair1959390480Mixin {
        @Inject(at = @At("HEAD"), method = "signature()[B", cancellable = true)
    private void signature_39748174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39748174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1050764212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050764212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1565153291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565153291L))
            info.setReturnValue("!\u80D85h\u052ExI2\uCBBE/|M)tEB E[)F{>')!*67y-O&L`Y`\u50ACGl o\u20703QW]C5VXZ{5\u34F02{wcl{av5TV\u51D3u&\uA941\u7E49\u42CD\u1698\uBE34n+\u049F.!D:\u3E3FXv\u3F664hv\u09B2\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1778224725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778224725L))
            info.setReturnValue(770111454);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/util/Crypt$SaltSignaturePair;)V", cancellable = true)
    private static void write_2008884136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008884136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__262730475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262730475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt__2060137439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060137439L))
            info.setReturnValue(-2337870570773549726L);
    }

    @Inject(at = @At("HEAD"), method = "saltAsBytes()[B", cancellable = true)
    private void saltAsBytes_2099276665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099276665L))
            info.setReturnValue(null);
    }


}
