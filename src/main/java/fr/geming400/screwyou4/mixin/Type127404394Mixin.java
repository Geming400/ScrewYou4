package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplay.Type.class)
public class Type127404394Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1512916653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512916653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1008055581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008055581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_165667136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165667136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1863258118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863258118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_1388404518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388404518L))
            info.setReturnValue(null);
    }


}
