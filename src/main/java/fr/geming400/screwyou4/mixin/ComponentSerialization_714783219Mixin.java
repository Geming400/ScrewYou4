package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ComponentSerialization.class)
public class ComponentSerialization_714783219Mixin {
        @Inject(at = @At("HEAD"), method = "createLegacyComponentMatcher(Lnet/minecraft/util/ExtraCodecs$LateBoundIdMapper;Ljava/util/function/Function;Ljava/lang/String;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void createLegacyComponentMatcher__1338251769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338251769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flatRestrictedCodec(I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void flatRestrictedCodec__1444847339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444847339L))
            info.setReturnValue(null);
    }


}
