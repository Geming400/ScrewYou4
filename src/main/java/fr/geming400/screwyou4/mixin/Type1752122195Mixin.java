package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.ConsumeEffect.Type.class)
public class Type1752122195Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1157332842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157332842L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_616662220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616662220L))
            info.setReturnValue("ᣴ?Mꡨlz8?.Q!xNbp]/2Tᓷ3r7cnU()|S368윒cQ13>䢱㤥^ ?'(46-@k쀖]ၿAF-?fB6NG벸gZ7\"鲹)iYfmKZ0_!両N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1790384937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790384937L))
            info.setReturnValue(720766097);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__806991377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806991377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__1281844977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281844977L))
            info.setReturnValue(null);
    }


}
