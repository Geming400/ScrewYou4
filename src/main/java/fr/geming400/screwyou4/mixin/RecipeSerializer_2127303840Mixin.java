package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeSerializer.class)
public class RecipeSerializer_2127303840Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1218677571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218677571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1397239932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397239932L))
            info.setReturnValue("W zSZio\uAFD2K:<-m{*J\uA288<HQ\uAF70m\u8B07l,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1610311366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610311366L))
            info.setReturnValue(927123278);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1101218203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101218203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_988557733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988557733L))
            info.setReturnValue(null);
    }


}
