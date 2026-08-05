package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.JigsawBlock.class)
public class JigsawBlock_1653614882Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__905498691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905498691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_395015114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395015114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFrontFacing(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getFrontFacing_784486869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784486869L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getTopFacing(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getTopFacing_784486869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784486869L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "canAttach(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;)Z", cancellable = true)
    private static void canAttach_296451312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296451312L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_68137226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68137226L))
            info.setReturnValue(null);
    }


}
