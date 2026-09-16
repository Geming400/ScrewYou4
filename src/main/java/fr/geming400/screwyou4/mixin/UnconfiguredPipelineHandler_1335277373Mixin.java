package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.UnconfiguredPipelineHandler.class)
public class UnconfiguredPipelineHandler_1335277373Mixin {
        @Inject(at = @At("HEAD"), method = "setupOutboundProtocol(Lnet/minecraft/network/ProtocolInfo;)Lnet/minecraft/network/UnconfiguredPipelineHandler$OutboundConfigurationTask;", cancellable = true)
    private static void setupOutboundProtocol_877539300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877539300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupInboundProtocol(Lnet/minecraft/network/ProtocolInfo;)Lnet/minecraft/network/UnconfiguredPipelineHandler$InboundConfigurationTask;", cancellable = true)
    private static void setupInboundProtocol__1229757800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1229757800L))
            info.setReturnValue(null);
    }


}
