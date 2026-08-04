package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.ReenableSpectatorsGenerateChunksInHardcoreWorldsFileFix.class)
public class ReenableSpectatorsGenerateChunksInHardcoreWorldsFileFix1036469382Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer_1074744121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1074744121L))
            info.cancel();
    }


}
