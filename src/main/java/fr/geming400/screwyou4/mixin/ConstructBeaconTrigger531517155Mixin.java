package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConstructBeaconTrigger.class)
public class ConstructBeaconTrigger531517155Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;I)V", cancellable = true)
    private void trigger_260882183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260882183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1273192385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273192385L))
            info.setReturnValue(null);
    }


}
