package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.InactivityFpsLimit.class)
public class InactivityFpsLimit_71071510Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/InactivityFpsLimit;", cancellable = true)
    private static void values__346738108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346738108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/InactivityFpsLimit;", cancellable = true)
    private static void valueOf_881412765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881412765L))
            info.setReturnValue(net.minecraft.client.InactivityFpsLimit.AFK);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_480596494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480596494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_159280131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159280131L))
            info.setReturnValue("CzODc\u8D79*V{8CD0`G$(/Kp2w7a>]TyJ\u6C8D+`uuI");
    }


}
