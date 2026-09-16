package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.DiscoverComponents.class)
public class DiscoverComponents173442184Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__735184084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735184084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_943865709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943865709L))
            info.setReturnValue("D]y@C}el,Xw\u4A8BY{_\u364A\u63B46|3i@;T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_730794275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730794275L))
            info.setReturnValue(-99342808);
    }

    @Inject(at = @At("HEAD"), method = "schemas()Ljava/util/Map;", cancellable = true)
    private void schemas_1190447934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190447934L))
            info.setReturnValue(null);
    }


}
