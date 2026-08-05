package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.AtlasManager.PendingStitchResults.class)
public class PendingStitchResults_914311062Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void get__738615936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738615936L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "joinAndUpload()Ljava/util/Map;", cancellable = true)
    private void joinAndUpload__1062407409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062407409L))
            info.setReturnValue(null);
    }


}
