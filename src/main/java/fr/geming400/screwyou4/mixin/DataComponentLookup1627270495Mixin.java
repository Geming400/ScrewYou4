package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentLookup.class)
public class DataComponentLookup1627270495Mixin {
        @Inject(at = @At("HEAD"), method = "findAll(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/util/Collection;", cancellable = true)
    private void findAll__450755189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450755189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAll(Lnet/minecraft/core/component/DataComponentType;)Ljava/util/Collection;", cancellable = true)
    private void findAll_1962612647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962612647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findMatching(Lnet/minecraft/core/component/DataComponentType;Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", cancellable = true)
    private void findMatching_1415523613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415523613L))
            info.setReturnValue(null);
    }


}
