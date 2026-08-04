package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.SnbtToNbt.class)
public class SnbtToNbt_532904598Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__602555874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602555874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1259427055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259427055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFilter(Lnet/minecraft/data/structures/SnbtToNbt$Filter;)Lnet/minecraft/data/structures/SnbtToNbt;", cancellable = true)
    private void addFilter__118251604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118251604L))
            info.setReturnValue(null);
    }


}
