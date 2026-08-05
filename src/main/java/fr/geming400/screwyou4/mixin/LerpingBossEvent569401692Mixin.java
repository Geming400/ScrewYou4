package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LerpingBossEvent.class)
public class LerpingBossEvent569401692Mixin {
        @Inject(at = @At("HEAD"), method = "setProgress(F)V", cancellable = true)
    private void setProgress_1780548101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1780548101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgress()F", cancellable = true)
    private void getProgress_607661055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607661055L))
            info.setReturnValue(5.044723E8F);
    }


}
