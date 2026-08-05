package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationGameRulesScreen.class)
public class WorldCreationGameRulesScreen161155780Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1387171262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1387171262L))
            info.cancel();
    }


}
