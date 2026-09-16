package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.DetectedVersion.class)
public class DetectedVersion2108472520Mixin {
        @Inject(at = @At("HEAD"), method = "createBuiltIn(Ljava/lang/String;Ljava/lang/String;Z)Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void createBuiltIn_987385111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987385111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBuiltIn(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void createBuiltIn_781333799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781333799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryDetectVersion()Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void tryDetectVersion_311001550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311001550L))
            info.setReturnValue(null);
    }


}
