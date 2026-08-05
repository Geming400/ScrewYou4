package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.HopperMenu.class)
public class HopperMenu_279567931Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1220169576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1220169576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1220173420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220173420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1153263680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153263680L))
            info.setReturnValue(null);
    }


}
