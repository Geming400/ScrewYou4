package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.BooleanInput.class)
public class BooleanInput_917621242Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1991833796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991833796L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__217838734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217838734L))
            info.setReturnValue("I\u1E99li}fL{`3we1']sj2.9G6f`\uABE8Nr7l:v\"\u8150{\u73D8<\u100Bd\u3E551m#p2R\uC0C1g/J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_955883983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955883983L))
            info.setReturnValue(1839835975);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1259287924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259287924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Z", cancellable = true)
    private void initial_955899824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955899824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__1641492331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641492331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFalse()Ljava/lang/String;", cancellable = true)
    private void onFalse__217839230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217839230L))
            info.setReturnValue("j\u4025LyxeYcQM\u6812^,\u0C945(Hg-./7Tz9\uC768&j:\u51369#x64VQ\u5807'v c\uB32AO*mqC'^^0\u10B2?");
    }

    @Inject(at = @At("HEAD"), method = "onTrue()Ljava/lang/String;", cancellable = true)
    private void onTrue__217839230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217839230L))
            info.setReturnValue("j\u4025LyxeYcQM\u6812^,\u0C945(Hg-./7Tz9\uC768&j:\u51369#x64VQ\u5807'v c\uB32AO*mqC'^^0\u10B2?");
    }


}
