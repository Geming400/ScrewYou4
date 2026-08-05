package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.InWorldGameRulesScreen.class)
public class InWorldGameRulesScreen_1139066292Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1929885523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929885523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGamemasterPermissionChanged(Z)V", cancellable = true)
    private void onGamemasterPermissionChanged_138884354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(138884354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameRuleValuesUpdated(Ljava/util/Map;)V", cancellable = true)
    private void onGameRuleValuesUpdated_1774200013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1774200013L))
            info.cancel();
    }


}
