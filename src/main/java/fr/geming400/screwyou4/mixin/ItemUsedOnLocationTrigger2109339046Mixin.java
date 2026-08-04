package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemUsedOnLocationTrigger.class)
public class ItemUsedOnLocationTrigger2109339046Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemInstance;)V", cancellable = true)
    private void trigger__1434362855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1434362855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1717373420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717373420L))
            info.setReturnValue(null);
    }


}
