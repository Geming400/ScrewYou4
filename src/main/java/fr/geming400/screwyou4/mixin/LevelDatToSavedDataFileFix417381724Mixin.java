package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.LevelDatToSavedDataFileFix.class)
public class LevelDatToSavedDataFileFix417381724Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer_455656463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455656463L))
            info.cancel();
    }


}
