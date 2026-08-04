package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.HashCache.class)
public class HashCache675058406Mixin {
        @Inject(at = @At("HEAD"), method = "generateUpdate(Ljava/lang/String;Lnet/minecraft/data/HashCache$UpdateFunction;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void generateUpdate__590113160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590113160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyUpdate(Lnet/minecraft/data/HashCache$UpdateResult;)V", cancellable = true)
    private void applyUpdate_2106113257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106113257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "purgeStaleAndWrite()V", cancellable = true)
    private void purgeStaleAndWrite_713333145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(713333145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRunInThisVersion(Ljava/lang/String;)Z", cancellable = true)
    private void shouldRunInThisVersion_1827423399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827423399L))
            info.setReturnValue(null);
    }


}
