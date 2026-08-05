package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionFileVersion.class)
public class RegionFileVersion1905167034Mixin {
        @Inject(at = @At("HEAD"), method = "wrap(Ljava/io/InputStream;)Ljava/io/InputStream;", cancellable = true)
    private void wrap_156204345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156204345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Ljava/io/OutputStream;)Ljava/io/OutputStream;", cancellable = true)
    private void wrap__1430141191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430141191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1943429280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943429280L))
            info.setReturnValue(920931811);
    }

    @Inject(at = @At("HEAD"), method = "configure(Ljava/lang/String;)V", cancellable = true)
    private static void configure__1237438865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1237438865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidVersion(I)Z", cancellable = true)
    private static void isValidVersion__1175879198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175879198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fromId(I)Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;", cancellable = true)
    private static void fromId_1327372633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327372633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;", cancellable = true)
    private static void getSelected_712340000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712340000L))
            info.setReturnValue(null);
    }


}
