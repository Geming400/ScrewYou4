package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockPattern.BlockPatternMatch.class)
public class BlockPatternMatch_97017597Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_867440625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867440625L))
            info.setReturnValue("\u544AiU\u2286fZ/\u5732G?\u3002)huQ9xsQk^@yaM6c/y.3e'F)@(;\uC81Bm\u5F0F\u88D6\u9EDCO7!/5L:O\u1950pim\u18DAp@37pel+6BM\uBD206[W,[=<[ lCBsxZ'd(oI!\u515A");
    }

    @Inject(at = @At("HEAD"), method = "getBlock(III)Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;", cancellable = true)
    private void getBlock__2089947553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089947553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDepth()I", cancellable = true)
    private void getDepth__28351499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28351499L))
            info.setReturnValue(1685788186);
    }

    @Inject(at = @At("HEAD"), method = "getFrontTopLeft()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getFrontTopLeft_1281718932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281718932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForwards()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getForwards_1324036683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324036683L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1840878894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840878894L))
            info.setReturnValue(1586335609);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1628599579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628599579L))
            info.setReturnValue(1547424721);
    }

    @Inject(at = @At("HEAD"), method = "getUp()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getUp__1658267688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658267688L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }


}
