package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SignBlockEntity.class)
public class SignBlockEntity1881845349Mixin {
        @Inject(at = @At("HEAD"), method = "setText(Lnet/minecraft/world/level/block/entity/SignText;Z)Z", cancellable = true)
    private void setText__388746105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388746105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getText(Z)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void getText_924141275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924141275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SignBlockEntity;)V", cancellable = true)
    private static void tick_1299894766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1299894766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxTextLineWidth()I", cancellable = true)
    private void getMaxTextLineWidth_1920107595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920107595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerIsTooFarAwayToEdit(Ljava/util/UUID;)Z", cancellable = true)
    private void playerIsTooFarAwayToEdit_1524293104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524293104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextLineHeight()I", cancellable = true)
    private void getTextLineHeight_1920107595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920107595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_715223801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(715223801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackText()Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void getBackText__1923951919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923951919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFrontText()Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void getFrontText__1923951919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923951919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_884993577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884993577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_867292287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867292287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSignText(Lnet/minecraft/world/entity/player/Player;ZLjava/util/List;)V", cancellable = true)
    private void updateSignText__1452386632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1452386632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateText(Ljava/util/function/UnaryOperator;Z)Z", cancellable = true)
    private void updateText_1040740403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040740403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWaxed(Z)Z", cancellable = true)
    private void setWaxed__1183501274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1183501274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWaxed()Z", cancellable = true)
    private void isWaxed_1920123932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920123932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFacingFrontText(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void isFacingFrontText__1472516457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472516457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowedPlayerEditor(Ljava/util/UUID;)V", cancellable = true)
    private void setAllowedPlayerEditor_1524289260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1524289260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerWhoMayEdit()Ljava/util/UUID;", cancellable = true)
    private void getPlayerWhoMayEdit__2001987464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001987464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canExecuteClickCommands(ZLnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canExecuteClickCommands__1581256159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581256159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "executeClickCommandsIfPresent(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void executeClickCommandsIfPresent__880598306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880598306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSignInteractionFailedSoundEvent()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getSignInteractionFailedSoundEvent__1322909049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322909049L))
            info.setReturnValue(null);
    }


}
