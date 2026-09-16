package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SideChainPartBlock.SideChainNeighbor.class)
public class SideChainNeighbor1841998116Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_933371848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933371848L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1682545655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682545655L))
            info.setReturnValue("&*[q&42<\uB136:\uA9A4\u11EB\u1F2D\u7B6B*AiO\uBFC9!\u5093-p\u8683D^OYqmawHI2RUEE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1895617089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895617089L))
            info.setReturnValue(1749533416);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__438778159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438778159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/SideChainPartBlock;", cancellable = true)
    private void block_1416230545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416230545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "part()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void part_157136904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157136904L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/LevelAccessor;", cancellable = true)
    private void level_1165711925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165711925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnectable()Z", cancellable = true)
    private void isConnectable_327884129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327884129L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "connectsTowards(Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Z", cancellable = true)
    private void connectsTowards__937399654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937399654L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "disconnectFromLeft()V", cancellable = true)
    private void disconnectFromLeft_1228847210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228847210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUnconnectableOrChainEnd()Z", cancellable = true)
    private void isUnconnectableOrChainEnd__1136973475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136973475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "connectToTheRight()V", cancellable = true)
    private void connectToTheRight_1936470407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1936470407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connectToTheLeft()V", cancellable = true)
    private void connectToTheLeft_532426852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(532426852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnectFromRight()V", cancellable = true)
    private void disconnectFromRight_2050665025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050665025L))
            info.cancel();
    }


}
