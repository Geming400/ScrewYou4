package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ShulkerBoxMenu.class)
public class ShulkerBoxMenu1716073552Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1638292098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1638292098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1638288254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638288254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1705197994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705197994L))
            info.setReturnValue(null);
    }


}
