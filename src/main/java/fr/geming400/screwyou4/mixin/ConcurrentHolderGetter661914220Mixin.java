package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.registries.ConcurrentHolderGetter.class)
public class ConcurrentHolderGetter661914220Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/tags/TagKey;)Ljava/util/Optional;", cancellable = true)
    private void get__635017238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635017238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void get__1657804522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657804522L))
            info.setReturnValue(null);
    }


}
