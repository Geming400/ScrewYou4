package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.DispenserMenu.class)
public class DispenserMenu1862695110Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1491670540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1491670540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1558576436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558576436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1491666696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491666696L))
            info.setReturnValue(true);
    }


}
