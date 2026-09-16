package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.FloatWithAlpha.class)
public class FloatWithAlpha_570470132Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__1734203707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734203707L))
            info.setReturnValue(4.394599E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__338156137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338156137L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1340893656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340893656L))
            info.setReturnValue(".7f<\u7E2Fe4JmH\uB6E9uqKP5#[_7]g+\u29F92\u6A178>s[a\u149B^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1127822222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127822222L))
            info.setReturnValue(1181678006);
    }

    @Inject(at = @At("HEAD"), method = "alpha()F", cancellable = true)
    private void alpha__695405832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695405832L))
            info.setReturnValue(4.394599E8F);
    }


}
