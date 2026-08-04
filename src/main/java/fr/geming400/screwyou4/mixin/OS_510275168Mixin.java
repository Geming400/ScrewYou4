package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Util.OS.class)
public class OS_510275168Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/Util$OS;", cancellable = true)
    private static void values_1836829937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836829937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/Util$OS;", cancellable = true)
    private static void valueOf_1677737454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677737454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openPath(Ljava/nio/file/Path;)V", cancellable = true)
    private void openPath_2117561969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2117561969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openFile(Ljava/io/File;)V", cancellable = true)
    private void openFile__57656311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57656311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openUri(Ljava/net/URI;)V", cancellable = true)
    private void openUri_721274932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(721274932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openUri(Ljava/lang/String;)V", cancellable = true)
    private void openUri_1662636316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1662636316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "telemetryName()Ljava/lang/String;", cancellable = true)
    private void telemetryName__625185304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625185304L))
            info.setReturnValue(null);
    }


}
