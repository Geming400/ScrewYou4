package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Point.class)
public class Point1696750750Mixin {
        @Inject(at = @At("HEAD"), method = "size()F", cancellable = true)
    private void size_2140479456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140479456L))
            info.setReturnValue(4.046559E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_788124482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788124482L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1827793021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827793021L))
            info.setReturnValue(":^o\u7255OsVdc4*0`= tI8xM'<V4 q\u4E6A3y\u07DEOH'kD<]tR3\u7D39\uC462wDiRK+\u37F9YQQC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2040864455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2040864455L))
            info.setReturnValue(-935888734);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__119541821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119541821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1361565439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1361565439L))
            info.setReturnValue(1614456707);
    }


}
