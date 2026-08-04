package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentLookup.class)
public class DataComponentLookup1627270495Mixin {
        @Inject(at = @At("HEAD"), method = "findAll(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/util/Collection;", cancellable = true)
    private void findAll__35124125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35124125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAll(Lnet/minecraft/core/component/DataComponentType;)Ljava/util/Collection;", cancellable = true)
    private void findAll_1074373759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074373759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findMatching(Lnet/minecraft/core/component/DataComponentType;Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", cancellable = true)
    private void findMatching_1308173235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308173235L))
            info.setReturnValue(null);
    }


}
