package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.categories.TeleportToTeamMenuCategory.class)
public class TeleportToTeamMenuCategory_1507211248Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__669697918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669697918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_1545489830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545489830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "selectItem(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void selectItem__1461974681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1461974681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems__1161419233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161419233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrompt__669697918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669697918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;FF)V", cancellable = true)
    private void extractIcon__1661240233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1661240233L))
            info.cancel();
    }


}
