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
            info.setReturnValue("tAE&\u9988hfUu`\u5917e\u6666w\u54098'Qr\u77C8_6pb{;c\uB20EHU-&SS^|JoGUlXyJDQzQ( 0.kN\u9C76&\"$-OR\u6F69s3BNX_.\u20AD3mRY=\" e;v7qk\u50E6vDAk^ml");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1290100466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290100466L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
