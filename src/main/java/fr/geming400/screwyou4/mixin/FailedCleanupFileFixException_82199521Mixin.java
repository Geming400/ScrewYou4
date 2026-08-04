package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FailedCleanupFileFixException.class)
public class FailedCleanupFileFixException_82199521Mixin {
        @Inject(at = @At("HEAD"), method = "newWorldFolderName()Ljava/lang/String;", cancellable = true)
    private void newWorldFolderName__1053260951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053260951L))
            info.setReturnValue(null);
    }


}
