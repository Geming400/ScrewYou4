package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.EquipmentAssetProvider.class)
public class EquipmentAssetProvider_1038724601Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__850122302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850122302L))
            info.setReturnValue("\u84DA");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1138450343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138450343L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
