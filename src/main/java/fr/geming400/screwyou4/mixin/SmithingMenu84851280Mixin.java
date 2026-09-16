package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.SmithingMenu.class)
public class SmithingMenu84851280Mixin {
        @Inject(at = @At("HEAD"), method = "createResult()V", cancellable = true)
    private void createResult_251745386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(251745386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasRecipeError()Z", cancellable = true)
    private void hasRecipeError_466255335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466255335L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll_2007947800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007947800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__1656754903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656754903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canMoveIntoInputSlots(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canMoveIntoInputSlots_1815989888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815989888L))
            info.setReturnValue(false);
    }


}
