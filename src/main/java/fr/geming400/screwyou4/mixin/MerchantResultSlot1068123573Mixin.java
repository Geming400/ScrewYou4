package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MerchantResultSlot.class)
public class MerchantResultSlot1068123573Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove_22753980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22753980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__2128269009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128269009L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__1014280510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1014280510L))
            info.cancel();
    }


}
