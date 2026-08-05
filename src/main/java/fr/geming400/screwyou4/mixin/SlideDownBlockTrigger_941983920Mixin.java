package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SlideDownBlockTrigger.class)
public class SlideDownBlockTrigger_941983920Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void trigger__1494028135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1494028135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__862725621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862725621L))
            info.setReturnValue(null);
    }


}
