package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetStructureBlockPacket.class)
public class ServerboundSetStructureBlockPacket302360811Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1586486091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586486091L))
            info.setReturnValue("\u6B9A\u4769J{SW");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_458228401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458228401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize__261582174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261582174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_939720985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939720985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_6648948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(6648948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOffset()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getOffset__1324798973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324798973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStrict()Z", cancellable = true)
    private void isStrict_823513583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823513583L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_868844555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868844555L))
            info.setReturnValue(5430981998034587687L);
    }

    @Inject(at = @At("HEAD"), method = "getData()Ljava/lang/String;", cancellable = true)
    private void getData_1245145236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245145236L))
            info.setReturnValue("+<`hFcDsyPo\u44E9E`<2\u8FBD");
    }

    @Inject(at = @At("HEAD"), method = "getMirror()Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private void getMirror__783774671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783774671L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private void getMode__1576106660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576106660L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StructureMode.LOAD);
    }

    @Inject(at = @At("HEAD"), method = "isShowAir()Z", cancellable = true)
    private void isShowAir__2056427521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056427521L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__592324335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592324335L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_791926542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791926542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntegrity()F", cancellable = true)
    private void getIntegrity_269601111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269601111L))
            info.setReturnValue(4.17883E7F);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoreEntities()Z", cancellable = true)
    private void isIgnoreEntities_1330554181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330554181L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateType()Lnet/minecraft/world/level/block/entity/StructureBlockEntity$UpdateType;", cancellable = true)
    private void getUpdateType__1391138442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391138442L))
            info.setReturnValue(net.minecraft.world.level.block.entity.StructureBlockEntity.UpdateType.SAVE_AREA);
    }

    @Inject(at = @At("HEAD"), method = "isShowBoundingBox()Z", cancellable = true)
    private void isShowBoundingBox_1444756194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444756194L))
            info.setReturnValue(false);
    }


}
