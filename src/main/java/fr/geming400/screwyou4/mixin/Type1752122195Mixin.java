package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.ConsumeEffect.Type.class)
public class Type1752122195Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_843495927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843495927L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1772421576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772421576L))
            info.setReturnValue("JLgM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1985493010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985493010L))
            info.setReturnValue(1036530448);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1476399847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476399847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_613376089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613376089L))
            info.setReturnValue(null);
    }


}
