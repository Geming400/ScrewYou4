package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.categories.TeleportToPlayerMenuCategory.class)
public class TeleportToPlayerMenuCategory_1310779308Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__866129858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866129858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_1349057890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349057890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems__1357851173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357851173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrompt__866129858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866129858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectItem(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void selectItem__1658406621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1658406621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;FF)V", cancellable = true)
    private void extractIcon__1857672173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1857672173L))
            info.cancel();
    }


}
