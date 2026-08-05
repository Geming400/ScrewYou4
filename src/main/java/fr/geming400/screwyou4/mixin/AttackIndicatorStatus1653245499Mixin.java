package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.AttackIndicatorStatus.class)
public class AttackIndicatorStatus1653245499Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/AttackIndicatorStatus;", cancellable = true)
    private static void values__453689617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453689617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/AttackIndicatorStatus;", cancellable = true)
    private static void valueOf__1437426698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437426698L))
            info.setReturnValue(net.minecraft.client.AttackIndicatorStatus.CROSSHAIR);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_2062770484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062770484L))
            info.setReturnValue(null);
    }


}
