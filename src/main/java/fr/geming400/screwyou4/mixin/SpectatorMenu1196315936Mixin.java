package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.SpectatorMenu.class)
public class SpectatorMenu1196315936Mixin {
        @Inject(at = @At("HEAD"), method = "exit()V", cancellable = true)
    private void exit_1234590675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234590675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/client/gui/spectator/SpectatorMenuItem;", cancellable = true)
    private void getItem_1101065656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101065656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem()Lnet/minecraft/client/gui/spectator/SpectatorMenuItem;", cancellable = true)
    private void getSelectedItem_2057893009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057893009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedSlot()I", cancellable = true)
    private void getSelectedSlot_1234578182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234578182L))
            info.setReturnValue(1592800423);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems__1472314544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472314544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectCategory(Lnet/minecraft/client/gui/spectator/SpectatorMenuCategory;)V", cancellable = true)
    private void selectCategory_759608890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(759608890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectSlot(I)V", cancellable = true)
    private void selectSlot__1884734388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1884734388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentPage()Lnet/minecraft/client/gui/spectator/categories/SpectatorPage;", cancellable = true)
    private void getCurrentPage__316105803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316105803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedCategory()Lnet/minecraft/client/gui/spectator/SpectatorMenuCategory;", cancellable = true)
    private void getSelectedCategory_1216887110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216887110L))
            info.setReturnValue(null);
    }


}
