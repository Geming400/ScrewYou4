package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.LootTableProvider.class)
public class LootTableProvider_1563857943Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_428397471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428397471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run__2004586896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004586896L))
            info.setReturnValue(null);
    }


}
