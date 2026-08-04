package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.AtlasManager.PendingStitchResults.class)
public class PendingStitchResults_914311062Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void get_1311451690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311451690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinAndUpload()Ljava/util/Map;", cancellable = true)
    private void joinAndUpload__1090312579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090312579L))
            info.setReturnValue(null);
    }


}
