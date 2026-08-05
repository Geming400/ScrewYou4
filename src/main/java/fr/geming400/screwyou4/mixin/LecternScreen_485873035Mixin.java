package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.LecternScreen.class)
public class LecternScreen_485873035Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_524147773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524147773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_524147773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524147773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_524151617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524151617L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMenu()Lnet/minecraft/world/inventory/LecternMenu;", cancellable = true)
    private void getMenu_1085370652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085370652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMenu()Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void getMenu__676558828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676558828L))
            info.setReturnValue(null);
    }


}
