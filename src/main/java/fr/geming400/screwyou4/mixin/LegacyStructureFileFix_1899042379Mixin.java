package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.LegacyStructureFileFix.class)
public class LegacyStructureFileFix_1899042379Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer__484874423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-484874423L))
            info.cancel();
    }


}
