package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.BuiltinTestFunctions.class)
public class BuiltinTestFunctions788684072Mixin {
        @Inject(at = @At("HEAD"), method = "load(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void load_1028723492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1028723492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Ljava/util/function/Consumer;", cancellable = true)
    private static void bootstrap__226144317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226144317L))
            info.setReturnValue(null);
    }


}
