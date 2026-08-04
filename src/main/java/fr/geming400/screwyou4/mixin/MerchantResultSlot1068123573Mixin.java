package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MerchantResultSlot.class)
public class MerchantResultSlot1068123573Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove__1832925504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832925504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1492308591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492308591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__2012534904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2012534904L))
            info.cancel();
    }


}
