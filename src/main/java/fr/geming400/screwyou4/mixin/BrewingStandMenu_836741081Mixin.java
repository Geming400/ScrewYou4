package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.BrewingStandMenu.class)
public class BrewingStandMenu_836741081Mixin {
        @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1197170090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197170090L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrewingTicks()I", cancellable = true)
    private void getBrewingTicks_1540303890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1540303890L))
            info.setReturnValue(-409611021);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__486087724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486087724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFuel()I", cancellable = true)
    private void getFuel_1474522898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474522898L))
            info.setReturnValue(-1290575379);
    }


}
