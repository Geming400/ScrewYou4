package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.SpectatorMenu.class)
public class SpectatorMenu1196315936Mixin {
        @Inject(at = @At("HEAD"), method = "exit()V", cancellable = true)
    private void exit__226253451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-226253451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/client/gui/spectator/SpectatorMenuItem;", cancellable = true)
    private void getItem__1417805681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417805681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedSlot()I", cancellable = true)
    private void getSelectedSlot_1539392183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539392183L))
            info.setReturnValue(-1180904169);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem()Lnet/minecraft/client/gui/spectator/SpectatorMenuItem;", cancellable = true)
    private void getSelectedItem__891361707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891361707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectSlot(I)V", cancellable = true)
    private void selectSlot__268749338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-268749338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems_394291290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394291290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedCategory()Lnet/minecraft/client/gui/spectator/SpectatorMenuCategory;", cancellable = true)
    private void getSelectedCategory_1743139125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743139125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentPage()Lnet/minecraft/client/gui/spectator/categories/SpectatorPage;", cancellable = true)
    private void getCurrentPage_648512387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648512387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectCategory(Lnet/minecraft/client/gui/spectator/SpectatorMenuCategory;)V", cancellable = true)
    private void selectCategory__1089453856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1089453856L))
            info.cancel();
    }


}
