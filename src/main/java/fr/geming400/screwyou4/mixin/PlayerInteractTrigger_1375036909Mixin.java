package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerInteractTrigger.class)
public class PlayerInteractTrigger_1375036909Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger__1659480605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1659480605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_983071282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983071282L))
            info.setReturnValue(null);
    }


}
