package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlocksAttacks.DamageReduction.class)
public class DamageReduction1674083055Mixin {
        @Inject(at = @At("HEAD"), method = "base()F", cancellable = true)
    private void base_1712342418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712342418L))
            info.setReturnValue(5.007743E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/util/Optional;", cancellable = true)
    private void type_1919544477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919544477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1235371982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235371982L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_538623080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538623080L))
            info.setReturnValue("Z5'%q2{8M1佨`㼻wKN#F@3Lp@h;Wi)WtRbB}D^>N-cs6i>30D^O,3'a턼䢪M1!<w{0劢>4m{<;cvym?sgW^Sje%vᛔᾈ!'m`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1712345797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712345797L))
            info.setReturnValue(2036612707);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/world/damagesource/DamageSource;FD)F", cancellable = true)
    private void resolve_1549749481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549749481L))
            info.setReturnValue(5.007743E8F);
    }

    @Inject(at = @At("HEAD"), method = "factor()F", cancellable = true)
    private void factor_1712342418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712342418L))
            info.setReturnValue(5.007743E8F);
    }

    @Inject(at = @At("HEAD"), method = "horizontalBlockingAngle()F", cancellable = true)
    private void horizontalBlockingAngle_1712342418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712342418L))
            info.setReturnValue(5.007743E8F);
    }


}
