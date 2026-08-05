package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockPattern.BlockPatternMatch.class)
public class BlockPatternMatch_97017597Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1038442875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038442875L))
            info.setReturnValue("!z$Y-&f\uFEF1Ng:#3mmw ;#b\u94C4Z7GU\u530Au}Uhj4g^?A_\u6909`Kbnj-\u4950\u6465Wni;*g'F\u5F10\u626C'iX&e2c[%9*y\u5519uAK.Y&3D@.");
    }

    @Inject(at = @At("HEAD"), method = "getBlock(III)Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;", cancellable = true)
    private void getBlock_1290052758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290052758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDepth()I", cancellable = true)
    private void getDepth_135279842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135279842L))
            info.setReturnValue(-495099346);
    }

    @Inject(at = @At("HEAD"), method = "getForwards()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getForwards__665837689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665837689L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_135279842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135279842L))
            info.setReturnValue(-495099346);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_135279842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135279842L))
            info.setReturnValue(-495099346);
    }

    @Inject(at = @At("HEAD"), method = "getFrontTopLeft()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getFrontTopLeft__1796369283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796369283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUp()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getUp__665837689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665837689L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }


}
