package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.DispenserMenu.class)
public class DispenserMenu1862695110Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1767078508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1767078508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__171216060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171216060L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_539866306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(539866306L))
            info.setReturnValue(null);
    }


}
