package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.EntityRenderState.ShadowPiece.class)
public class ShadowPiece_1500814964Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_592188695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592188695L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2023728808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023728808L))
            info.setReturnValue("\u3ABAm&2X;|Hh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2058167054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058167054L))
            info.setReturnValue(-1924708893);
    }

    @Inject(at = @At("HEAD"), method = "alpha()F", cancellable = true)
    private void alpha_234939000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234939000L))
            info.setReturnValue(6.805538E8F);
    }

    @Inject(at = @At("HEAD"), method = "relativeZ()F", cancellable = true)
    private void relativeZ__1890041144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890041144L))
            info.setReturnValue(6.805538E8F);
    }

    @Inject(at = @At("HEAD"), method = "relativeY()F", cancellable = true)
    private void relativeY__1918670295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918670295L))
            info.setReturnValue(6.805538E8F);
    }

    @Inject(at = @At("HEAD"), method = "relativeX()F", cancellable = true)
    private void relativeX__1947299446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947299446L))
            info.setReturnValue(6.805538E8F);
    }

    @Inject(at = @At("HEAD"), method = "shapeBelow()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void shapeBelow__485349787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485349787L))
            info.setReturnValue(null);
    }


}
