package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SignBlockEntity.class)
public class SignBlockEntity1881845349Mixin {
        @Inject(at = @At("HEAD"), method = "setText(Lnet/minecraft/world/level/block/entity/SignText;Z)Z", cancellable = true)
    private void setText_171173624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171173624L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getText(Z)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void getText__1960215490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1960215490L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SignBlockEntity;)V", cancellable = true)
    private static void tick_776653681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(776653681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateText(Ljava/util/function/UnaryOperator;Z)Z", cancellable = true)
    private void updateText_926222281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926222281L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setWaxed(Z)Z", cancellable = true)
    private void setWaxed_363709617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363709617L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTextLineHeight()I", cancellable = true)
    private void getTextLineHeight__2046002483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046002483L))
            info.setReturnValue(-518755658);
    }

    @Inject(at = @At("HEAD"), method = "getMaxTextLineWidth()I", cancellable = true)
    private void getMaxTextLineWidth__821408076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821408076L))
            info.setReturnValue(-1367649328);
    }

    @Inject(at = @At("HEAD"), method = "updateSignText(Lnet/minecraft/world/entity/player/Player;ZLjava/util/List;)V", cancellable = true)
    private void updateSignText_1631417131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1631417131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerIsTooFarAwayToEdit(Ljava/util/UUID;)Z", cancellable = true)
    private void playerIsTooFarAwayToEdit__1867705009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867705009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBackText()Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void getBackText_1684957415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684957415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFrontText()Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void getFrontText_1213148817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213148817L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "executeClickCommandsIfPresent(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void executeClickCommandsIfPresent__125492645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125492645L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSignInteractionFailedSoundEvent()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getSignInteractionFailedSoundEvent__1565754368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565754368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWaxed()Z", cancellable = true)
    private void isWaxed__352948999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352948999L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_1348450960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348450960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__240928520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240928520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_1303705470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303705470L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "isFacingFrontText(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void isFacingFrontText__281851227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281851227L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canExecuteClickCommands(ZLnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canExecuteClickCommands__272144692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272144692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAllowedPlayerEditor(Ljava/util/UUID;)V", cancellable = true)
    private void setAllowedPlayerEditor_775140792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(775140792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerWhoMayEdit()Ljava/util/UUID;", cancellable = true)
    private void getPlayerWhoMayEdit__1092504288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092504288L))
            info.setReturnValue(null);
    }


}
