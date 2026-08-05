package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.ScreenNarrationCollector.class)
public class ScreenNarrationCollector_1153793207Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/util/function/Consumer;)V", cancellable = true)
    private void update__444743780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-444743780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectNarrationText(Z)Ljava/lang/String;", cancellable = true)
    private void collectNarrationText__1123070736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123070736L))
            info.setReturnValue("r=`>']{^:-LI<Lp^if+F]?+MCg|F]w\u5BD2P+[z<E**>@ZZHd4)Q!I%#\uD4CE/a]x$UYgxL2l^`n-ng\uC39BO\u18DD^Z +T+)=0fz");
    }


}
