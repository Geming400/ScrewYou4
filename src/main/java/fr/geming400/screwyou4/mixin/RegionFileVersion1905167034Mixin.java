package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionFileVersion.class)
public class RegionFileVersion1905167034Mixin {
        @Inject(at = @At("HEAD"), method = "wrap(Ljava/io/InputStream;)Ljava/io/InputStream;", cancellable = true)
    private void wrap_1974098947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974098947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Ljava/io/OutputStream;)Ljava/io/OutputStream;", cancellable = true)
    private void wrap_1809849155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809849155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_246843439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246843439L))
            info.setReturnValue(324694696);
    }

    @Inject(at = @At("HEAD"), method = "configure(Ljava/lang/String;)V", cancellable = true)
    private static void configure_698935497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(698935497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;", cancellable = true)
    private static void getSelected_549487599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549487599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromId(I)Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;", cancellable = true)
    private static void fromId_2051100606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051100606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidVersion(I)Z", cancellable = true)
    private static void isValidVersion__1058035480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058035480L))
            info.setReturnValue(true);
    }


}
