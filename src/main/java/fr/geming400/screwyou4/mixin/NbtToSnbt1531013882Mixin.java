package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.NbtToSnbt.class)
public class NbtToSnbt1531013882Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_395553411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395553411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run__2037430956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037430956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertStructure(Lnet/minecraft/data/CachedOutput;Ljava/nio/file/Path;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private static void convertStructure__1926422331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926422331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeSnbt(Lnet/minecraft/data/CachedOutput;Ljava/nio/file/Path;Ljava/lang/String;)V", cancellable = true)
    private static void writeSnbt__552288143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-552288143L))
            info.cancel();
    }


}
