package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.Bootstrap.class)
public class Bootstrap1882718560Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate_1920993547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1920993547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_1920993547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1920993547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shutdownStdout()V", cancellable = true)
    private static void shutdownStdout_1920993547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1920993547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "realStdoutPrintln(Ljava/lang/String;)V", cancellable = true)
    private static void realStdoutPrintln__1259887339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1259887339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkBootstrapCalled(Ljava/util/function/Supplier;)V", cancellable = true)
    private static void checkBootstrapCalled_640302751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(640302751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMissingTranslations(Lnet/minecraft/locale/Language;)Ljava/util/Set;", cancellable = true)
    private static void getMissingTranslations__1560006376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560006376L))
            info.setReturnValue(null);
    }


}
