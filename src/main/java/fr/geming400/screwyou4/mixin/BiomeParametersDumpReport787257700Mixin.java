package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.BiomeParametersDumpReport.class)
public class BiomeParametersDumpReport787257700Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__348202771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348202771L))
            info.setReturnValue("}&hw^2`WUNvl ");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1513780158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513780158L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
