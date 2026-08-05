package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.AdvancementProvider.class)
public class AdvancementProvider2145991267Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_257144365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257144365L))
            info.setReturnValue("W)&r<%5\u2D04)\u981F7'Vn\u7EE6aq\u6E87*&5s]?\u9A35Bj]l3\u039CMmS;&xKp$(X\u8B25R\uD781*");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run__2049250286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049250286L))
            info.setReturnValue(null);
    }


}
