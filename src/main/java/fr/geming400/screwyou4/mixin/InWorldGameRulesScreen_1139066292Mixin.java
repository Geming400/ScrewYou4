package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.InWorldGameRulesScreen.class)
public class InWorldGameRulesScreen_1139066292Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1177341030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1177341030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleValuesUpdated(Ljava/util/Map;)V", cancellable = true)
    private void onGameRuleValuesUpdated__641505887(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-641505887L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGamemasterPermissionChanged(Z)V", cancellable = true)
    private void onGamemasterPermissionChanged__1926284176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1926284176L))
            info.cancel();
    }


}
