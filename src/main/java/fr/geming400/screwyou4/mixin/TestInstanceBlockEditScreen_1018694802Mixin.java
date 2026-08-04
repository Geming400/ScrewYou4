package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.TestInstanceBlockEditScreen.class)
public class TestInstanceBlockEditScreen_1018694802Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_59007429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(59007429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/network/chat/Component;Ljava/util/Optional;)V", cancellable = true)
    private void setStatus_1347978631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1347978631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_1056973384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056973384L))
            info.setReturnValue(null);
    }


}
