package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.UnconfiguredPipelineHandler.class)
public class UnconfiguredPipelineHandler_1335277373Mixin {
        @Inject(at = @At("HEAD"), method = "setupOutboundProtocol(Lnet/minecraft/network/ProtocolInfo;)Lnet/minecraft/network/UnconfiguredPipelineHandler$OutboundConfigurationTask;", cancellable = true)
    private static void setupOutboundProtocol_498727177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498727177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupInboundProtocol(Lnet/minecraft/network/ProtocolInfo;)Lnet/minecraft/network/UnconfiguredPipelineHandler$InboundConfigurationTask;", cancellable = true)
    private static void setupInboundProtocol__850117724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850117724L))
            info.setReturnValue(null);
    }


}
