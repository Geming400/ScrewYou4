package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.DatapackStructureReport.class)
public class DatapackStructureReport391858198Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__743602273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743602273L))
            info.setReturnValue("VpV;&8+)\uA172%(hToZnAeWkkZ\u8074\uCCF9*}n\u4B10V&g2+Ax!i9K|z2.)4y O$L}.\uBC3Cbg)Bl+*'!Sg1':");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1118380656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118380656L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
