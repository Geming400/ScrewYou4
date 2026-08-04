package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.PlayerStorageFileFix.class)
public class PlayerStorageFileFix_1982156411Mixin {
        @Inject(at = @At("HEAD"), method = "makeFixer()V", cancellable = true)
    private void makeFixer_2020431149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020431149L))
            info.cancel();
    }


}
