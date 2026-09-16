package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.ColorModifier.BlendToGray.class)
public class BlendToGray1064725839Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_156099571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156099571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1835149364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835149364L))
            info.setReturnValue("r;`? 'aM/z#\uB8383R%{!9nM\u95E2;(8P\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1622077930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622077930L))
            info.setReturnValue(-1916721857);
    }

    @Inject(at = @At("HEAD"), method = "factor()F", cancellable = true)
    private void factor_1066186755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1066186755L))
            info.setReturnValue(9.295625E8F);
    }

    @Inject(at = @At("HEAD"), method = "brightness()F", cancellable = true)
    private void brightness__1882188223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882188223L))
            info.setReturnValue(9.295625E8F);
    }


}
