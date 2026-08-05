package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.SmithingMenu.class)
public class SmithingMenu84851280Mixin {
        @Inject(at = @At("HEAD"), method = "createResult()V", cancellable = true)
    private void createResult_123126019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(123126019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canMoveIntoInputSlots(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canMoveIntoInputSlots_1819386412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1819386412L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll_1337347321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337347321L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged_1618604522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1618604522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasRecipeError()Z", cancellable = true)
    private void hasRecipeError_123129863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123129863L))
            info.setReturnValue(true);
    }


}
