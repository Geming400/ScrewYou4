package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ComponentSerialization.class)
public class ComponentSerialization_714783219Mixin {
        @Inject(at = @At("HEAD"), method = "flatRestrictedCodec(I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void flatRestrictedCodec_563945367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563945367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLegacyComponentMatcher(Lnet/minecraft/util/ExtraCodecs$LateBoundIdMapper;Ljava/util/function/Function;Ljava/lang/String;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void createLegacyComponentMatcher_748688525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748688525L))
            info.setReturnValue(null);
    }


}
