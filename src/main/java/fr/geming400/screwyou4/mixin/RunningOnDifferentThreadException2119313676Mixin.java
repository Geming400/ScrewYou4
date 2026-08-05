package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.RunningOnDifferentThreadException.class)
public class RunningOnDifferentThreadException2119313676Mixin {
        @Inject(at = @At("HEAD"), method = "fillInStackTrace()Ljava/lang/Throwable;", cancellable = true)
    private void fillInStackTrace__1178968417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178968417L))
            info.setReturnValue(null);
    }


}
