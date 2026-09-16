package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.HopperMenu.class)
public class HopperMenu_279567931Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_944761608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(944761608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1754343240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754343240L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1043260874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043260874L))
            info.setReturnValue(null);
    }


}
