package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NativeModuleLister.class)
public class NativeModuleLister_1682865644Mixin {
        @Inject(at = @At("HEAD"), method = "listModules()Ljava/util/List;", cancellable = true)
    private static void listModules__985764589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985764589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryGetModuleVersion(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void tryGetModuleVersion__602065849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602065849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCrashSection(Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private static void addCrashSection__294755320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-294755320L))
            info.cancel();
    }


}
