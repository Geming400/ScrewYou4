package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.class)
public class PostChainConfig_494373051Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1879885309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879885309L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__641086925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641086925L))
            info.setReturnValue("yjpR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_532635792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532635792L))
            info.setReturnValue(-1416453353);
    }

    @Inject(at = @At("HEAD"), method = "passes()Ljava/util/List;", cancellable = true)
    private void passes_2120709866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120709866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "internalTargets()Ljava/util/Map;", cancellable = true)
    private void internalTargets__1510250590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510250590L))
            info.setReturnValue(null);
    }


}
