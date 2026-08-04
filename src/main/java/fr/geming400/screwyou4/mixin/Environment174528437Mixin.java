package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.Environment.class)
public class Environment174528437Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/jfr/Environment;", cancellable = true)
    private static void values__2111425508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111425508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/Environment;", cancellable = true)
    private static void valueOf_735133657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735133657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/MinecraftServer;)Lnet/minecraft/util/profiling/jfr/Environment;", cancellable = true)
    private static void from_1884557644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884557644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Ljava/lang/String;", cancellable = true)
    private void getDescription__960932034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960932034L))
            info.setReturnValue(null);
    }


}
