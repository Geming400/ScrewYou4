package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.Environment.class)
public class Environment174528437Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/jfr/Environment;", cancellable = true)
    private static void values__124651590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124651590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/Environment;", cancellable = true)
    private static void valueOf__603181311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603181311L))
            info.setReturnValue(net.minecraft.util.profiling.jfr.Environment.CLIENT);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/MinecraftServer;)Lnet/minecraft/util/profiling/jfr/Environment;", cancellable = true)
    private static void from__765461770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765461770L))
            info.setReturnValue(net.minecraft.util.profiling.jfr.Environment.CLIENT);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Ljava/lang/String;", cancellable = true)
    private void getDescription_349055364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(349055364L))
            info.setReturnValue("[P|\u349F)$x_;50\u140A\u19B4Xj1BV\u0D7904Z92j7\u7189$9\u8D34@BchLmB\u232C,ds&&B/8*.(\uD098");
    }


}
