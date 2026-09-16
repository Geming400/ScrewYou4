package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.JigsawBlock.class)
public class JigsawBlock_1653614882Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1574907161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1574907161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1795190266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795190266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__815573599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815573599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTopFacing(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getTopFacing_472841774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472841774L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getFrontFacing(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getFrontFacing_1286172546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286172546L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "canAttach(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$JigsawBlockInfo;)Z", cancellable = true)
    private static void canAttach_2106592923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106592923L))
            info.setReturnValue(true);
    }


}
