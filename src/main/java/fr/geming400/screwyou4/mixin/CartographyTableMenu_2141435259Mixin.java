package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CartographyTableMenu.class)
public class CartographyTableMenu_2141435259Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1488338360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1488338360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged_399829075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(399829075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__230435518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230435518L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_818606454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818606454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_107524088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107524088L))
            info.setReturnValue(false);
    }


}
