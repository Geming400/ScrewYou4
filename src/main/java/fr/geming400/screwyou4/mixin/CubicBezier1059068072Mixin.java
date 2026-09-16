package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.EasingType.CubicBezier.class)
public class CubicBezier1059068072Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_150441308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150441308L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1829491101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829491101L))
            info.setReturnValue("f\uBA04S8=\uA373ks#\u83D4)l:lb8!A^*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1616419667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616419667L))
            info.setReturnValue(190328775);
    }

    @Inject(at = @At("HEAD"), method = "apply(F)F", cancellable = true)
    private void apply__2082785745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082785745L))
            info.setReturnValue(4.421456E8F);
    }


}
