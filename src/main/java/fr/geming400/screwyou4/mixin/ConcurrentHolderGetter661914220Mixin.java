package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.registries.ConcurrentHolderGetter.class)
public class ConcurrentHolderGetter661914220Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/tags/TagKey;)Ljava/util/Optional;", cancellable = true)
    private void get__645638956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645638956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void get__1172162176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172162176L))
            info.setReturnValue(null);
    }


}
