package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.InventoryChangeTrigger.class)
public class InventoryChangeTrigger194941138Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger__1202671544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1202671544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__197024488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-197024488L))
            info.setReturnValue(null);
    }


}
