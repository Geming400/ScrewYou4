package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.ModelProvider.class)
public class ModelProvider1401010604Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_265550133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265550133L))
            info.setReturnValue("mZ-Z蟛/5L.gX隁張cV7鈿佼骲h`>(:LV`頩ꔙx'lHn@Z4쀾U!zR93(*ylr6p.(s\"}d*wJ+0TY0RGn*Ai2l誺t3쐌Aꭟ=Π틞#-Vl");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_2127533062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127533062L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
