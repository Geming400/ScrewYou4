package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LerpingBossEvent.class)
public class LerpingBossEvent569401692Mixin {
        @Inject(at = @At("HEAD"), method = "setProgress(F)V", cancellable = true)
    private void setProgress_459465588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(459465588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgress()F", cancellable = true)
    private void getProgress_179731004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179731004L))
            info.setReturnValue(3.239903E8F);
    }


}
