package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Path.class)
public class Path_143348515Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1528860277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528860277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__992111957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992111957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_181610760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181610760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void copy_39195961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39195961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_181627097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181627097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTarget__1750038365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750038365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advance()V", cancellable = true)
    private void advance_181623253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(181623253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceNode(ILnet/minecraft/world/level/pathfinder/Node;)V", cancellable = true)
    private void replaceNode_614894889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(614894889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNode(I)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getNode__604841099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604841099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugData()Lnet/minecraft/world/level/pathfinder/Path$DebugData;", cancellable = true)
    private void debugData__1138226112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138226112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getNextNode__1349868996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349868996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreviousNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getPreviousNode__1349868996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349868996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextNodePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getNextNodePos__1750038365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750038365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "truncateNodes(I)V", cancellable = true)
    private void truncateNodes_1357265486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1357265486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNextEntityPos(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getNextEntityPos__1866790092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866790092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextNodeIndex()I", cancellable = true)
    private void getNextNodeIndex_181610760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181610760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNodeCount()I", cancellable = true)
    private void getNodeCount_181610760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181610760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeToStream(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void writeToStream__210144607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-210144607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private static void createFromStream__1912442883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912442883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReach()Z", cancellable = true)
    private void canReach_181627097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181627097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNextNodeIndex(I)V", cancellable = true)
    private void setNextNodeIndex_1357265486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1357265486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityPosAtNode(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getEntityPosAtNode_1195339995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195339995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notStarted()Z", cancellable = true)
    private void notStarted_181627097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181627097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEndNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getEndNode__1349868996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349868996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNodePos(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getNodePos_1568041372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568041372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sameAs(Lnet/minecraft/world/level/pathfinder/Path;)Z", cancellable = true)
    private void sameAs__1849534973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849534973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDistToTarget()F", cancellable = true)
    private void getDistToTarget_181607877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181607877L))
            info.setReturnValue(null);
    }


}
