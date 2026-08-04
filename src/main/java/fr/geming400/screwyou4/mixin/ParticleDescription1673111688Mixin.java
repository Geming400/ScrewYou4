package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleDescription.class)
public class ParticleDescription1673111688Mixin {
        @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/particle/ParticleDescription;", cancellable = true)
    private static void fromJson__1268953453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268953453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextures()Ljava/util/List;", cancellable = true)
    private void getTextures__995518792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995518792L))
            info.setReturnValue(null);
    }


}
