package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.BrewingStandMenu.class)
public class BrewingStandMenu_836741081Mixin {
        @Inject(at = @At("HEAD"), method = "getFuel()I", cancellable = true)
    private void getFuel_875003326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875003326L))
            info.setReturnValue(1973362048);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1777346570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777346570L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1710436830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710436830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrewingTicks()I", cancellable = true)
    private void getBrewingTicks_875003326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875003326L))
            info.setReturnValue(1973362048);
    }


}
