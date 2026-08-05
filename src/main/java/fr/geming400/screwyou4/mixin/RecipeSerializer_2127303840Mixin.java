package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeSerializer.class)
public class RecipeSerializer_2127303840Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__782151198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782151198L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_991843864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991843864L))
            info.setReturnValue("n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2129400715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129400715L))
            info.setReturnValue(65925188);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__431809733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431809733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__906663333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906663333L))
            info.setReturnValue(null);
    }


}
