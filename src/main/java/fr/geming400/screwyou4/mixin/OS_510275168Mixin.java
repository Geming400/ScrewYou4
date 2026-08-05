package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Util.OS.class)
public class OS_510275168Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/Util$OS;", cancellable = true)
    private static void values_1756748815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756748815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/Util$OS;", cancellable = true)
    private static void valueOf_1365518102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365518102L))
            info.setReturnValue(net.minecraft.util.Util.OS.UNKNOWN);
    }

    @Inject(at = @At("HEAD"), method = "telemetryName()Ljava/lang/String;", cancellable = true)
    private void telemetryName__719406900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719406900L))
            info.setReturnValue("H\u6CE6MM4]]^&?!3gTs,-9'\u0BCD*E\u91D7/0\uC1A4\u117E`X\uD6BFJH\u507BrcgC$tekb\uAA6C0NO0\uAA78\uD072Qw{BcK\u64E59lh2LJHZl/7\u5A7Bwxg\u874AOq[\u98F7y$");
    }

    @Inject(at = @At("HEAD"), method = "openUri(Ljava/lang/String;)V", cancellable = true)
    private void openUri_998755354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(998755354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openUri(Ljava/net/URI;)V", cancellable = true)
    private void openUri_1663889970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1663889970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openFile(Ljava/io/File;)V", cancellable = true)
    private void openFile_1062157155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1062157155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openPath(Ljava/nio/file/Path;)V", cancellable = true)
    private void openPath_253178818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(253178818L))
            info.cancel();
    }


}
