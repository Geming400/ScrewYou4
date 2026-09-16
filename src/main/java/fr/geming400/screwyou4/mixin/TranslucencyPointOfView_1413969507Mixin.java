package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.TranslucencyPointOfView.class)
public class TranslucencyPointOfView_1413969507Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_505342742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505342742L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1971321101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971321101L))
            info.setReturnValue(2119530848);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/phys/Vec3;J)Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;", cancellable = true)
    private static void of_836714648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836714648L))
            info.setReturnValue(new net.minecraft.client.renderer.chunk.TranslucencyPointOfView());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/phys/Vec3;J)Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;", cancellable = true)
    private void set__899045771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899045771L))
            info.setReturnValue(new net.minecraft.client.renderer.chunk.TranslucencyPointOfView());
    }

    @Inject(at = @At("HEAD"), method = "isAxisAligned()Z", cancellable = true)
    private void isAxisAligned_719619008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719619008L))
            info.setReturnValue(true);
    }


}
