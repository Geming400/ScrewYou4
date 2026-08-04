package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.DimensionStorageFileFix.class)
public class DimensionStorageFileFix1109194070Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer_1147468809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147468809L))
            info.cancel();
    }


}
