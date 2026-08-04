package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.BuiltinTestFunctions.class)
public class BuiltinTestFunctions788684072Mixin {
        @Inject(at = @At("HEAD"), method = "load(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void load__949466818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-949466818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Ljava/util/function/Consumer;", cancellable = true)
    private static void bootstrap__402051627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402051627L))
            info.setReturnValue(null);
    }


}
