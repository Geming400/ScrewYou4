package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.BlockListReport.class)
public class BlockListReport_1136411151Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__752435752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752435752L))
            info.setReturnValue("\uFF6B\u2A8FI\u41A3\u3257M,bN%\uB266.A\uC928myU!Z0sik'9{.P!&4U4,|7diZ1t>`;'Ts\uC2F6N9i1u\uFCA4]M>iT\u1457+OGx/^s\u5446c'U=j+j\u101CM!k*MVc\u88E6\u1327S\u6622Ou\u7F79\u0847+4IK");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1236136893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236136893L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
