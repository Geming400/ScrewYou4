package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.Profiler.class)
public class Profiler2037983567Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private static void get_1788408826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788408826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/util/profiling/ProfilerFiller;)Lnet/minecraft/util/profiling/Profiler$Scope;", cancellable = true)
    private static void use__484496013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484496013L))
            info.setReturnValue(null);
    }


}
