package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.DistanceTrigger.class)
public class DistanceTrigger1958486165Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void trigger_1739941636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1739941636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1566520539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566520539L))
            info.setReturnValue(null);
    }


}
