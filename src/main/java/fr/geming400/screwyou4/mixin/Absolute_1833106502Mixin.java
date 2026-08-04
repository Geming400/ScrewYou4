package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.VerticalAnchor.Absolute.class)
public class Absolute_1833106502Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1076348536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076348536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_697646030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697646030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1871369243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871369243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_1871368747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871368747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveY(Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void resolveY__607442506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607442506L))
            info.setReturnValue(null);
    }


}
