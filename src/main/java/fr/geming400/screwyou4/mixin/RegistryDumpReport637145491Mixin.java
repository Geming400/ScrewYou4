package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.RegistryDumpReport.class)
public class RegistryDumpReport637145491Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__498314980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498314980L))
            info.setReturnValue("\u190F7o6deq\u7066I-u-&MJ!%:;B\uFE5EQ sHB=\uF9C81\u185C/");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1363667949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363667949L))
            info.setReturnValue(null);
    }


}
