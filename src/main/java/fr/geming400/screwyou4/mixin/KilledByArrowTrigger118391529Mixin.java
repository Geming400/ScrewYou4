package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledByArrowTrigger.class)
public class KilledByArrowTrigger118391529Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/Collection;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger_1082414330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1082414330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1686318011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686318011L))
            info.setReturnValue(null);
    }


}
