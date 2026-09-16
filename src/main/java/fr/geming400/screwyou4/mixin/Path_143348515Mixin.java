package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Path.class)
public class Path_143348515Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__765278250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765278250L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_913771543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913771543L))
            info.setReturnValue("^\u42D1$A(_q_zTt?p1=Z.ty*\u069C6xj=\uCC16A./mq\uC17B,*|*1>aI\u8F68p|'\u67DC^OG\uCEF8\u9A9BZBo\uAB67R9M^?\uB1A9hs\u716E\u4196L>A\u4E9C\"xP%8\uAA66pXH}6\uBF46P3/`'D_>4D/j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_700700109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700700109L))
            info.setReturnValue(1093906242);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void copy_111903012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111903012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone__1380620147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380620147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTarget_652075260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652075260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advance()V", cancellable = true)
    private void advance__1436241261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1436241261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceNode(ILnet/minecraft/world/level/pathfinder/Node;)V", cancellable = true)
    private void replaceNode_1297961235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1297961235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNode(I)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getNode_1093804525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093804525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextNodePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getNextNodePos__121752454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121752454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextNodeIndex()I", cancellable = true)
    private void getNextNodeIndex_1973106401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973106401L))
            info.setReturnValue(950927545);
    }

    @Inject(at = @At("HEAD"), method = "getNodeCount()I", cancellable = true)
    private void getNodeCount_1691641329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691641329L))
            info.setReturnValue(2050120806);
    }

    @Inject(at = @At("HEAD"), method = "getNextNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getNextNode__1664336431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664336431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "truncateNodes(I)V", cancellable = true)
    private void truncateNodes_977199865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(977199865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNextEntityPos(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getNextEntityPos__768032964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768032964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugData()Lnet/minecraft/world/level/pathfinder/Path$DebugData;", cancellable = true)
    private void debugData_16949827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16949827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sameAs(Lnet/minecraft/world/level/pathfinder/Path;)Z", cancellable = true)
    private void sameAs_559500603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559500603L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNodePos(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getNodePos__549704872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549704872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEndNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getEndNode__1616812523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616812523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private static void createFromStream_493882723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493882723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNextNodeIndex(I)V", cancellable = true)
    private void setNextNodeIndex__1922783479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1922783479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPreviousNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getPreviousNode_1625784909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625784909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeToStream(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void writeToStream_547013243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(547013243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityPosAtNode(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getEntityPosAtNode__2091955861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091955861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDistToTarget()F", cancellable = true)
    private void getDistToTarget__1778133859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778133859L))
            info.setReturnValue(3.049186E8F);
    }

    @Inject(at = @At("HEAD"), method = "canReach()Z", cancellable = true)
    private void canReach_1835816758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835816758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "notStarted()Z", cancellable = true)
    private void notStarted__777147541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777147541L))
            info.setReturnValue(true);
    }


}
