package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerInteractTrigger.class)
public class PlayerInteractTrigger_1375036909Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger_2145575723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145575723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__429672632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429672632L))
            info.setReturnValue(null);
    }


}
