package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.Profiler.class)
public class Profiler2037983567Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private static void get__776940400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776940400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/util/profiling/ProfilerFiller;)Lnet/minecraft/util/profiling/Profiler$Scope;", cancellable = true)
    private static void use_1449149996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449149996L))
            info.setReturnValue(null);
    }


}
