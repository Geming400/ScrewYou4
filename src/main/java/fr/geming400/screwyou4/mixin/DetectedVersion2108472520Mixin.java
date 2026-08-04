package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.DetectedVersion.class)
public class DetectedVersion2108472520Mixin {
        @Inject(at = @At("HEAD"), method = "createBuiltIn(Ljava/lang/String;Ljava/lang/String;Z)Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void createBuiltIn__1929924514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929924514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBuiltIn(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void createBuiltIn__282604288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282604288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryDetectVersion()Lnet/minecraft/WorldVersion;", cancellable = true)
    private static void tryDetectVersion__1621806316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621806316L))
            info.setReturnValue(null);
    }


}
