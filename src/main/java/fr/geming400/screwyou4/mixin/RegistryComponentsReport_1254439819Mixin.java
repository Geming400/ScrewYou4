package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.RegistryComponentsReport.class)
public class RegistryComponentsReport_1254439819Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__634407084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634407084L))
            info.setReturnValue("&Ahh_nM,\u4CDB_\u256EflR3S\u52F6$Uz$k't\u228E)Ss{';[,(SaN");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1354165561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354165561L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
