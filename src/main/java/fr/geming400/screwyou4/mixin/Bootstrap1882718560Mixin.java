package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.Bootstrap.class)
public class Bootstrap1882718560Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate_998845877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(998845877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap__1856902275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1856902275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMissingTranslations(Lnet/minecraft/locale/Language;)Ljava/util/Set;", cancellable = true)
    private static void getMissingTranslations_1179905482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179905482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBootstrapCalled(Ljava/util/function/Supplier;)V", cancellable = true)
    private static void checkBootstrapCalled_1302617922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302617922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "realStdoutPrintln(Ljava/lang/String;)V", cancellable = true)
    private static void realStdoutPrintln_1368024879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1368024879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shutdownStdout()V", cancellable = true)
    private static void shutdownStdout__618916502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-618916502L))
            info.cancel();
    }


}
