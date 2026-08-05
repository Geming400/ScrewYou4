package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.GeneratedStructuresRenameFileFix.class)
public class GeneratedStructuresRenameFileFix_2011102254Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer__372814548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-372814548L))
            info.cancel();
    }


}
