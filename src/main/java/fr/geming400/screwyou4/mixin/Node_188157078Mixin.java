package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Node.class)
public class Node_188157078Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1573668840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573668840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__947303394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947303394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_226419323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226419323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void asBlockPos__1705229802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705229802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asVec3()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void asVec3_1285886606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285886606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloneAndMove(III)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void cloneAndMove__226733624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226733624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void distanceToSqr_356908300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356908300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceToSqr__961340251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961340251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceTo(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void distanceTo_356908300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356908300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceTo(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceTo__961340251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961340251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeToStream(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void writeToStream__165336044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-165336044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private static void createFromStream_1038268019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038268019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToXZ(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceToXZ__961340251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961340251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceManhattan(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceManhattan__961340251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961340251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceManhattan(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void distanceManhattan_356908300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356908300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHash(III)I", cancellable = true)
    private static void createHash__591947572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591947572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inOpenSet()Z", cancellable = true)
    private void inOpenSet_226435660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226435660L))
            info.setReturnValue(null);
    }


}
