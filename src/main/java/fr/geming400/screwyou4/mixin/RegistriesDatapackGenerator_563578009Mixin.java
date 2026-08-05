package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.registries.RegistriesDatapackGenerator.class)
public class RegistriesDatapackGenerator_563578009Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__571882463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571882463L))
            info.setReturnValue("tAE&馈hfUu`夗e晦w吉8'Qr矈_6pb{;c눎HU-&SS^|JoGUlXyJDQzQ( 0.kN鱶&\"$-OR潩s3BNX_.₭3mRY=\" e;v7qk僦vDAk^ml");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1290100466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290100466L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
