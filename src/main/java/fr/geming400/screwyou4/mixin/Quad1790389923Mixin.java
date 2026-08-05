package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Quad.class)
public class Quad1790389923Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1119065114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119065114L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_654929948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654929948L))
            info.setReturnValue("}qh\u86B80X[8JC\u44ECo{vMvp]J1[6p3Y3DMNh7s\u050Dv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1828652665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828652665L))
            info.setReturnValue(107213472);
    }

    @Inject(at = @At("HEAD"), method = "b()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void b__1406847844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406847844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "c()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void c__1406847844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406847844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "d()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void d__1406847844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406847844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "a()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void a__1406847844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406847844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1828652169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828652169L))
            info.setReturnValue(384232680);
    }


}
