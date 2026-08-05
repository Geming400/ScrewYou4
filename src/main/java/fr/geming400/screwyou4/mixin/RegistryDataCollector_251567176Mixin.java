package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.RegistryDataCollector.class)
public class RegistryDataCollector_251567176Mixin {
        @Inject(at = @At("HEAD"), method = "appendContents(Lnet/minecraft/resources/ResourceKey;Ljava/util/List;)V", cancellable = true)
    private void appendContents__256131709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-256131709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectGameRegistries(Lnet/minecraft/server/packs/resources/ResourceProvider;Lnet/minecraft/core/RegistryAccess$Frozen;Z)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void collectGameRegistries__1517747356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517747356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendTags(Ljava/util/Map;)V", cancellable = true)
    private void appendTags__172019960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-172019960L))
            info.cancel();
    }


}
