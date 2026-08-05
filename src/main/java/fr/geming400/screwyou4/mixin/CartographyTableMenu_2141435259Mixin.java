package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CartographyTableMenu.class)
public class CartographyTableMenu_2141435259Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1212930392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1212930392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1279836288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279836288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__901035997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901035997L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__619778796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-619778796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1212926548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1212926548L))
            info.setReturnValue(false);
    }


}
