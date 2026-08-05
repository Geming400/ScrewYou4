package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BoundingBoxRenderable.RenderableBox.class)
public class RenderableBox684802680Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void size_300404216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300404216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2070314939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070314939L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__450657295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450657295L))
            info.setReturnValue("ht+'8X:EW\u712F..H\u28CEl)h0bmRf2 A5e3+HYY9@'toGCq\u3C68wz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_723065422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723065422L))
            info.setReturnValue(1842075239);
    }

    @Inject(at = @At("HEAD"), method = "fromCorners(IIIIII)Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$RenderableBox;", cancellable = true)
    private static void fromCorners_1288632670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288632670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "localPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void localPos__1208584199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208584199L))
            info.setReturnValue(null);
    }


}
