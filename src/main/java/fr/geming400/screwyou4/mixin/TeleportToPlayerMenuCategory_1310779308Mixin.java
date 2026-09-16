package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.categories.TeleportToPlayerMenuCategory.class)
public class TeleportToPlayerMenuCategory_1310779308Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_802716159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802716159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__723368693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723368693L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPrompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrompt__441035752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441035752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems_508754661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508754661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;FF)V", cancellable = true)
    private void extractIcon_1764743469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1764743469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectItem(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void selectItem_1872882196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872882196L))
            info.cancel();
    }


}
