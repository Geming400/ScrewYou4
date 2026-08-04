package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.ScreenNarrationCollector.class)
public class ScreenNarrationCollector_1153793207Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/util/function/Consumer;)V", cancellable = true)
    private void update_1834809619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1834809619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectNarrationText(Z)Ljava/lang/String;", cancellable = true)
    private void collectNarrationText__554294923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554294923L))
            info.setReturnValue(null);
    }


}
