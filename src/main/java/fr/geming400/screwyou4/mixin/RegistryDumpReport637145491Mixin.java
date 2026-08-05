package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.RegistryDumpReport.class)
public class RegistryDumpReport637145491Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1251701411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1251701411L))
            info.setReturnValue("-");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_736871234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736871234L))
            info.setReturnValue(null);
    }


}
