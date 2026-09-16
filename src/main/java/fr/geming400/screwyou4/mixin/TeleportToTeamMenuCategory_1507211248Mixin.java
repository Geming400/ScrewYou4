package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.categories.TeleportToTeamMenuCategory.class)
public class TeleportToTeamMenuCategory_1507211248Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_999148099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999148099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__526936753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526936753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPrompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrompt__244603812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244603812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;FF)V", cancellable = true)
    private void extractIcon_1961175409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1961175409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems_705186601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705186601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectItem(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void selectItem_2069314136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2069314136L))
            info.cancel();
    }


}
