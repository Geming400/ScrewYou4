package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FailedCleanupFileFixException.class)
public class FailedCleanupFileFixException_82199521Mixin {
        @Inject(at = @At("HEAD"), method = "newWorldFolderName()Ljava/lang/String;", cancellable = true)
    private void newWorldFolderName_167862452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167862452L))
            info.setReturnValue("#P<P\u3FFBhoc)Z\u1A53T}Y");
    }


}
