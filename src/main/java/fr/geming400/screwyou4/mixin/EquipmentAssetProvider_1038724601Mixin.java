package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.EquipmentAssetProvider.class)
public class EquipmentAssetProvider_1038724601Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__96735871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96735871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1765247058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765247058L))
            info.setReturnValue(null);
    }


}
