package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.AtlasProvider.class)
public class AtlasProvider_60693426Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1074767046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074767046L))
            info.setReturnValue("`ྍ?砓ko5n#>");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_787215883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787215883L))
            info.setReturnValue(null);
    }


}
