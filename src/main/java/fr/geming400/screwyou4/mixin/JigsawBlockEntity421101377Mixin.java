package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.JigsawBlockEntity.class)
public class JigsawBlockEntity421101377Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getName__2021965176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021965176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setName__1073339780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1073339780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPool()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void getPool_1229592690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229592690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTarget__2021965176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021965176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTarget__1073339780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1073339780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void generate_1660065334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1660065334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJoint()Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private void getJoint_1897970670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897970670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionPriority(I)V", cancellable = true)
    private void setSelectionPriority_1635018349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1635018349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlacementPriority(I)V", cancellable = true)
    private void setPlacementPriority_1635018349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1635018349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFinalState(Ljava/lang/String;)V", cancellable = true)
    private void setFinalState_1573462526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1573462526L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__745520171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745520171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionPriority()I", cancellable = true)
    private void getSelectionPriority_459363623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459363623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlacementPriority()I", cancellable = true)
    private void getPlacementPriority_459363623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459363623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFinalState()Ljava/lang/String;", cancellable = true)
    private void getFinalState__714359094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714359094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setJoint(Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;)V", cancellable = true)
    private void setJoint__1578074526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1578074526L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPool(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void setPool_608770680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(608770680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__575750395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575750395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__593451685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593451685L))
            info.setReturnValue(null);
    }


}
