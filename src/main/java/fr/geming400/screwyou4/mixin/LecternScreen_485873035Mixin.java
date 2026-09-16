package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.LecternScreen.class)
public class LecternScreen_485873035Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_46792669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46792669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1711888516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1711888516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1221695433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1221695433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMenu()Lnet/minecraft/world/inventory/LecternMenu;", cancellable = true)
    private void getMenu_529662631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529662631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMenu()Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void getMenu__464929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464929L))
            info.setReturnValue(null);
    }


}
