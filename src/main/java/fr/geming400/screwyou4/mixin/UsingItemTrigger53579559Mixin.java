package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsingItemTrigger.class)
public class UsingItemTrigger53579559Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger_1868725255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1868725255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1751129981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751129981L))
            info.setReturnValue(null);
    }


}
