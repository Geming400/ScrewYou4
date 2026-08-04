package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PickedUpItemTrigger.class)
public class PickedUpItemTrigger_1127953220Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger__1906564294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1906564294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_735987593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735987593L))
            info.setReturnValue(null);
    }


}
