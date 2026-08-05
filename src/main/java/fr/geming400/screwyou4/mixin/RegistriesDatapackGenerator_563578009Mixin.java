package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.registries.RegistriesDatapackGenerator.class)
public class RegistriesDatapackGenerator_563578009Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1325268894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325268894L))
            info.setReturnValue(">SqPk95`q\uBC3A(8u>$FA(_x\"+S,+p-Lg\u32FBySt;sCB \u19BE {6k]\u3407sV\"Fx#\u7C2Dy)\uB2708;)\u2667+8}(N\u0525;N3");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_663303751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663303751L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
