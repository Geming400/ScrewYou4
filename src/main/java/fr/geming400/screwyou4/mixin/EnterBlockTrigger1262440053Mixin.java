package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnterBlockTrigger.class)
public class EnterBlockTrigger1262440053Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void trigger__1173572001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1173572001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__542269487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542269487L))
            info.setReturnValue(null);
    }


}
