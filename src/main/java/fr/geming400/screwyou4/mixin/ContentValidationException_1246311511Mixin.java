package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.ContentValidationException.class)
public class ContentValidationException_1246311511Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(Ljava/nio/file/Path;Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private static void getMessage_1884795079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884795079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_110851039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110851039L))
            info.setReturnValue(null);
    }


}
