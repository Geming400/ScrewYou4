package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Quad.class)
public class Quad1790389923Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_881763655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881763655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1734153848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734153848L))
            info.setReturnValue("F;b6 @gQ0H(1 -\u50352XpZ1?4\u429Fn#N.ZQyK@%`.8\uB515FA5\"`B0zK7kTehSpW(,`W`\"SxZ^\u4F41,\u1ACB\u85AE\uC49DO#J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1947225282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947225282L))
            info.setReturnValue(-535786677);
    }

    @Inject(at = @At("HEAD"), method = "b()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void b_744016122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744016122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "c()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void c__1600650919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600650919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "d()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void d_349649336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(349649336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "a()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void a__1206284133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206284133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1267926266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267926266L))
            info.setReturnValue(-529722542);
    }


}
