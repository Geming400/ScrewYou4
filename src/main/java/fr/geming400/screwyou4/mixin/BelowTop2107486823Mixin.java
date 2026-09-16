package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.VerticalAnchor.BelowTop.class)
public class BelowTop2107486823Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1198860555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198860555L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1417057444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417057444L))
            info.setReturnValue("m");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1630128382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630128382L))
            info.setReturnValue(1418867776);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset__964360294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964360294L))
            info.setReturnValue(-1625508219);
    }

    @Inject(at = @At("HEAD"), method = "resolveY(Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void resolveY__155733051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155733051L))
            info.setReturnValue(81105776);
    }


}
