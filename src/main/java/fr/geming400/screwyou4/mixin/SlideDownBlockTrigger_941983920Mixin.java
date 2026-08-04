package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SlideDownBlockTrigger.class)
public class SlideDownBlockTrigger_941983920Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void trigger__366069023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-366069023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_550018293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550018293L))
            info.setReturnValue(null);
    }


}
