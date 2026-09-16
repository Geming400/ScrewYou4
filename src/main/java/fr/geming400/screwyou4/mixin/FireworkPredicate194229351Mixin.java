package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.FireworkExplosionPredicate.FireworkPredicate.class)
public class FireworkPredicate194229351Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__714396917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714396917L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_964652876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964652876L))
            info.setReturnValue(">i$%^\u2956=1+c+dZvF iV4/p3chd;q.;o8s&|&\"-pD.j6@o'O\u1F8CO6C]=^U \u0B2FPx0#\u1D23{A),;MQvFxb1X5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_751581442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751581442L))
            info.setReturnValue(-1812187292);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/component/FireworkExplosion;)Z", cancellable = true)
    private void test__742509494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742509494L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1542742360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542742360L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shape()Ljava/util/Optional;", cancellable = true)
    private void shape_735961782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735961782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trail()Ljava/util/Optional;", cancellable = true)
    private void trail_1303963163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303963163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "twinkle()Ljava/util/Optional;", cancellable = true)
    private void twinkle_858325329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858325329L))
            info.setReturnValue(null);
    }


}
