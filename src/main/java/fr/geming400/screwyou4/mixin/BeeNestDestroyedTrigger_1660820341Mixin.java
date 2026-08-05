package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BeeNestDestroyedTrigger.class)
public class BeeNestDestroyedTrigger_1660820341Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void trigger__1840555452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1840555452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__143889200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143889200L))
            info.setReturnValue(null);
    }


}
