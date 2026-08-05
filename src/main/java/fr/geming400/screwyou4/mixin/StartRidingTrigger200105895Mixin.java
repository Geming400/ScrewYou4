package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.StartRidingTrigger.class)
public class StartRidingTrigger200105895Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void trigger_606133858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606133858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1604603645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604603645L))
            info.setReturnValue(null);
    }


}
