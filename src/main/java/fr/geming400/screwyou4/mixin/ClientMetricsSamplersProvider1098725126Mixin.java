package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.profiling.ClientMetricsSamplersProvider.class)
public class ClientMetricsSamplersProvider1098725126Mixin {
        @Inject(at = @At("HEAD"), method = "samplers(Ljava/util/function/Supplier;)Ljava/util/Set;", cancellable = true)
    private void samplers_914045884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914045884L))
            info.setReturnValue(null);
    }


}
