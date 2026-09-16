package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BoundingBoxRenderable.RenderableBox.class)
public class RenderableBox684802680Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void size_1266579001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266579001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__223823588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223823588L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1455226205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455226205L))
            info.setReturnValue("awo\uD343W\uB9B3D\u11F6R}\u127DA1\u7B5B$\uA530V4#cG:\u0949fb/$F665x,f9H1|{\u7A6Bkk/o!p'\u2D1FI\u2AAFlvZ\u7BBA4$\u7FF51\u112B\uD67Cb!8\uB2D5![w6p{lY20\u6300TAwJ<dPPqD<Q A)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1242154771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242154771L))
            info.setReturnValue(-1457276290);
    }

    @Inject(at = @At("HEAD"), method = "fromCorners(IIIIII)Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$RenderableBox;", cancellable = true)
    private static void fromCorners__1640849390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640849390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "localPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void localPos_419437104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419437104L))
            info.setReturnValue(null);
    }


}
