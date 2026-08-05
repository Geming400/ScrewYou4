package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.TranslucencyPointOfView.class)
public class TranslucencyPointOfView_1413969507Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1495486027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495486027L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1452231752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452231752L))
            info.setReturnValue(-1527141932);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/phys/Vec3;J)Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;", cancellable = true)
    private static void of__2109161585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109161585L))
            info.setReturnValue(new net.minecraft.client.renderer.chunk.TranslucencyPointOfView());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/phys/Vec3;J)Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;", cancellable = true)
    private void set__2109161833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109161833L))
            info.setReturnValue(new net.minecraft.client.renderer.chunk.TranslucencyPointOfView());
    }

    @Inject(at = @At("HEAD"), method = "isAxisAligned()Z", cancellable = true)
    private void isAxisAligned_1452248089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452248089L))
            info.setReturnValue(false);
    }


}
