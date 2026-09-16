package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Node.class)
public class Node_188157078Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__720469687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720469687L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_958580106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958580106L))
            info.setReturnValue("lM>A\u7975\u8CFEP_OoZ\uBCD8mm_`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_745508672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745508672L))
            info.setReturnValue(402506202);
    }

    @Inject(at = @At("HEAD"), method = "distanceTo(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void distanceTo__836430244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836430244L))
            info.setReturnValue(6.936627E8F);
    }

    @Inject(at = @At("HEAD"), method = "distanceTo(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceTo__1891390987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891390987L))
            info.setReturnValue(6.936627E8F);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void distanceToSqr_1130330736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130330736L))
            info.setReturnValue(6.936627E8F);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceToSqr_295918345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295918345L))
            info.setReturnValue(6.936627E8F);
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private static void createFromStream__850373671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850373671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeToStream(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void writeToStream_591821806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591821806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "distanceManhattan(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void distanceManhattan_1944022743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944022743L))
            info.setReturnValue(6.946635E8F);
    }

    @Inject(at = @At("HEAD"), method = "distanceManhattan(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceManhattan_1081085744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081085744L))
            info.setReturnValue(6.946635E8F);
    }

    @Inject(at = @At("HEAD"), method = "cloneAndMove(III)Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void cloneAndMove_1725931315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725931315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asVec3()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void asVec3_1714582141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714582141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inOpenSet()Z", cancellable = true)
    private void inOpenSet_449725785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449725785L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "distanceToXZ(Lnet/minecraft/world/level/pathfinder/Node;)F", cancellable = true)
    private void distanceToXZ__1777937161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777937161L))
            info.setReturnValue(6.946635E8F);
    }

    @Inject(at = @At("HEAD"), method = "createHash(III)I", cancellable = true)
    private static void createHash__686766346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686766346L))
            info.setReturnValue(1200748501);
    }

    @Inject(at = @At("HEAD"), method = "asBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void asBlockPos_789566557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789566557L))
            info.setReturnValue(null);
    }


}
