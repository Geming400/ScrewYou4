package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LockIconButton.class)
public class LockIconButton191433104Mixin {
        @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked__1056448781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056448781L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setLocked(Z)V", cancellable = true)
    private void setLocked__791588519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-791588519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents_1173626281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1173626281L))
            info.cancel();
    }


}
