package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LevitationTrigger.class)
public class LevitationTrigger1417118237Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void trigger__1035394803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1035394803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1025152611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025152611L))
            info.setReturnValue(null);
    }


}
