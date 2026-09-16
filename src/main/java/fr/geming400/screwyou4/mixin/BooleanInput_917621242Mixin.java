package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.BooleanInput.class)
public class BooleanInput_917621242Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_8994973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8994973L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1688044766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688044766L))
            info.setReturnValue("\u802C'G\u0831c*p?\"vbVIj) B6`\u2678\u0BE9q0q [pN^x\uB1E6_\uB0CF/r-xYrUfux\uAF82#fZ>#\u3863i\u080AuZ?]BUZ$;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1474973332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474973332L))
            info.setReturnValue(1978426393);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_1529895040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529895040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Z", cancellable = true)
    private void initial_455111404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455111404L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_173626171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173626171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFalse()Ljava/lang/String;", cancellable = true)
    private void onFalse__190743290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190743290L))
            info.setReturnValue("v\u71025Nu+(S\"&0;]_;aT}&W4}c?");
    }

    @Inject(at = @At("HEAD"), method = "onTrue()Ljava/lang/String;", cancellable = true)
    private void onTrue__376127025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376127025L))
            info.setReturnValue("_n\u8948.?e?v1B!^F G2V(?>BsCzk(\u74EF7dN**NBhb'\u3856_\u34ABPG3Rii\u618B/Mk0s/3Nrb3S\u8BB7ct<\u67A3_O=3RZ4\u5434KV\uA0BC");
    }


}
