package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Crypt.SaltSignaturePair.class)
public class SaltSignaturePair1959390480Mixin {
        @Inject(at = @At("HEAD"), method = "signature()[B", cancellable = true)
    private void signature__1149742186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149742186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__950064557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950064557L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_823930505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823930505L))
            info.setReturnValue("uu?a0h95bk2Me\"\u3FD5HMNW#[a*Pvjpn`\u12A0DU23&EJjt\u653D>w=p!,-J\u9B7A%j*4q\u2A8BSxulR3NB,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1997653222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997653222L))
            info.setReturnValue(18389072);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/util/Crypt$SaltSignaturePair;)V", cancellable = true)
    private static void write__2059194167(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2059194167L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_1997669063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997669063L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_1997653687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997653687L))
            info.setReturnValue(-775708467113807260L);
    }

    @Inject(at = @At("HEAD"), method = "saltAsBytes()[B", cancellable = true)
    private void saltAsBytes__1149742186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149742186L))
            info.setReturnValue(null);
    }


}
