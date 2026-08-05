package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.CriterionProgress.class)
public class CriterionProgress_1196658208Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1967081236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967081236L))
            info.setReturnValue("5i^ymj0aL%#)Fj\uA782+x`|0i\"\u4AB89\uC106%Q&?o_\u05DFH\u4AC4n9Z!\u8EA5Q0<w\uAD83\uD03B\uABE3a\u909A>^.s],#Z)T\u9948ug\u2EA9t&bvysZ@R$xalb:\uB4E1q_On");
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone__327310454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327310454L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "grant()V", cancellable = true)
    private void grant_1993549110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1993549110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__1778281135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1778281135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObtained()Ljava/time/Instant;", cancellable = true)
    private void getObtained_253666941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253666941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/advancements/CriterionProgress;", cancellable = true)
    private static void fromNetwork_1124696943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124696943L))
            info.setReturnValue(new net.minecraft.advancements.CriterionProgress());
    }

    @Inject(at = @At("HEAD"), method = "revoke()V", cancellable = true)
    private void revoke_590260748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(590260748L))
            info.cancel();
    }


}
