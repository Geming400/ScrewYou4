package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.DiscoverComponents.class)
public class DiscoverComponents173442184Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1558954443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558954443L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__962017791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962017791L))
            info.setReturnValue("3voxhkbPPS@l}덇uu`6QZhPL]<m<t|m7o9/3*B39KmKO|Xh⑉|姞눿t+w");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_211704926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211704926L))
            info.setReturnValue(-1973382429);
    }

    @Inject(at = @At("HEAD"), method = "schemas()Ljava/util/Map;", cancellable = true)
    private void schemas__1831181456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831181456L))
            info.setReturnValue(null);
    }


}
