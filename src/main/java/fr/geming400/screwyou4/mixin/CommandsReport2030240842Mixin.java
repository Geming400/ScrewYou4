package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.CommandsReport.class)
public class CommandsReport2030240842Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_894780371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894780371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run__1538203996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538203996L))
            info.setReturnValue(null);
    }


}
