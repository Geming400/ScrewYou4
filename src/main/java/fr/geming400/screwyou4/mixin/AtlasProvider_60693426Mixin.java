package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.AtlasProvider.class)
public class AtlasProvider_60693426Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1828153477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828153477L))
            info.setReturnValue("EkT\u7374\u1823\"\uC4E3]\u2F60n?M\u3997>\u8F3Ae/,#,R,S\u5476U");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_160419168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160419168L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
