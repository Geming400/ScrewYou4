package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.HashCache.class)
public class HashCache675058406Mixin {
        @Inject(at = @At("HEAD"), method = "purgeStaleAndWrite()V", cancellable = true)
    private void purgeStaleAndWrite_634031939(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(634031939L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateUpdate(Ljava/lang/String;Lnet/minecraft/data/HashCache$UpdateFunction;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void generateUpdate_115818778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115818778L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "shouldRunInThisVersion(Ljava/lang/String;)Z", cancellable = true)
    private void shouldRunInThisVersion_714963722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714963722L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "applyUpdate(Lnet/minecraft/data/HashCache$UpdateResult;)V", cancellable = true)
    private void applyUpdate_1039855808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039855808L))
            info.cancel();
    }


}
