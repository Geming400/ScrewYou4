package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.JigsawBlockEntity.class)
public class JigsawBlockEntity421101377Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getName__339783543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339783543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setName__1715246321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1715246321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPool()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void getPool_1241408544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241408544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTarget__2140961777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140961777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTarget_941218633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(941218633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void generate_1391320097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391320097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setJoint(Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;)V", cancellable = true)
    private void setJoint_661857818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(661857818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPool(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void setPool_881949846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(881949846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJoint()Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private void getJoint__1981450558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981450558L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionPriority(I)V", cancellable = true)
    private void setSelectionPriority__1416627461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1416627461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlacementPriority()I", cancellable = true)
    private void getPlacementPriority_855208468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855208468L))
            info.setReturnValue(-985229620);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionPriority()I", cancellable = true)
    private void getSelectionPriority_1041652429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041652429L))
            info.setReturnValue(1938534);
    }

    @Inject(at = @At("HEAD"), method = "setFinalState(Ljava/lang/String;)V", cancellable = true)
    private void setFinalState__564082015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-564082015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFinalState()Ljava/lang/String;", cancellable = true)
    private void getFinalState__1399719749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1399719749L))
            info.setReturnValue("\u976D39396J}![Njb\u4E45\u4606+'}N\u80D5Z/d:\u6932\";,fb*S7qvv&M\u3BA6x\uCB96\u3592#\u4A07\uC15DWG3\u4C0COto\uAD00\u2076h\u9964`KmWgY/\u5920]MA)`|yr1x;\u4E51P<\u72A1c&\u95337XFAD|\u9E29rCu()");
    }

    @Inject(at = @At("HEAD"), method = "setPlacementPriority(I)V", cancellable = true)
    private void setPlacementPriority_1393544340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1393544340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1701672492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701672492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__112293012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112293012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__157038502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157038502L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
