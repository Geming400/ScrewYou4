package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.RemoveObsoleteFilesFileFix.class)
public class RemoveObsoleteFilesFileFix1862639653Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer_1900914392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1900914392L))
            info.cancel();
    }


}
