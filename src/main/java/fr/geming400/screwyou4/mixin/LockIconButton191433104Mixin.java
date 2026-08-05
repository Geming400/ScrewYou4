package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LockIconButton.class)
public class LockIconButton191433104Mixin {
        @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_229711687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229711687L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__768254268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-768254268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLocked(Z)V", cancellable = true)
    private void setLocked_1421049933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421049933L))
            info.cancel();
    }


}
