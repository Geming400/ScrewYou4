package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.ResourcePackLocationFileFix.class)
public class ResourcePackLocationFileFix_996707249Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer__1387209553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1387209553L))
            info.cancel();
    }


}
